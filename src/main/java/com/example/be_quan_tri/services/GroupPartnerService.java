package com.example.be_quan_tri.services;

import com.example.be_quan_tri.dtos.GloableResponse;
import com.example.be_quan_tri.dtos.ResponsePartner;
import com.example.be_quan_tri.dtos.groups.RequestAddGroupDtos;
import com.example.be_quan_tri.dtos.groups.RequestUpdateGroupDtos;
import com.example.be_quan_tri.entitys.GroupPartnerEntity;
import com.example.be_quan_tri.entitys.StatusEntity;
import com.example.be_quan_tri.repositorys.GroupPartnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class GroupPartnerService {

    private Boolean success;
    private String message;


    @Autowired
    private GroupPartnerRepository groupPartnerRepository;

    public List<GroupPartnerEntity> getAllGroup() {
        return groupPartnerRepository.findAll();
    }

    public ResponseEntity<GloableResponse<ResponsePartner>> addNewGroup(RequestAddGroupDtos requestAddStatusDtos) {
        try {
            GroupPartnerEntity statusEntity = GroupPartnerEntity.builder()
                    .nameGroup(requestAddStatusDtos.getNameGroup())
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .build();

            groupPartnerRepository.save(statusEntity);
            success = true;
            message = "Thêm trạng thái thành công";
        }catch (Exception e){
            success = false;
            message = "Thêm trạng thái thất bại";
            e.printStackTrace();
        }


        return new ResponseEntity<>(new GloableResponse<>(success, message, null), HttpStatusCode.valueOf(HttpStatus.OK.value()));

    }

    public GroupPartnerEntity getOneGroup(Long idGroup) {
        return groupPartnerRepository.findById(idGroup).get();
    }

    public ResponseEntity<GloableResponse<ResponsePartner>> updateGroup(RequestUpdateGroupDtos requestUpdateGroupDtos) {
        if(requestUpdateGroupDtos.getIdGroup() == null || requestUpdateGroupDtos.getIdGroup() == 0) {
            success = false;
            message = "Không tìm thấy Nhóm cần update";
            return new ResponseEntity<>(new GloableResponse<>(success, message, null), HttpStatusCode.valueOf(HttpStatus.OK.value()));
        }else {
            try {
                GroupPartnerEntity statusEntity = groupPartnerRepository.findById(requestUpdateGroupDtos.getIdGroup()).get();
                GroupPartnerEntity statusEntityNew = GroupPartnerEntity.builder()
                        .id(requestUpdateGroupDtos.getIdGroup())
                        .nameGroup(requestUpdateGroupDtos.getEditNameGroup())
                        .createdAt(statusEntity.getCreatedAt())
                        .updatedAt(LocalDateTime.now())
                        .build();
                groupPartnerRepository.save(statusEntityNew);
                success = true;
                message = "Update thành công";
            }catch (Exception e){
                success = false;
                message = "Update không thành công";
                e.printStackTrace();
            }

        }
        return new ResponseEntity<>(new GloableResponse<>(success, message, null), HttpStatusCode.valueOf(HttpStatus.OK.value()));
    }

    public ResponseEntity<GloableResponse<ResponsePartner>> deleteStatus(String id) {
        try {
            Long idStatus = (id == null || id.isEmpty()) ? 0L : Long.parseLong(id);
            groupPartnerRepository.deleteById(idStatus);
            success = true;
            message = "Xóa nhóm thành công";
        }catch (Exception e){
            success = false;
            message = "Xóa nhóm không thành công";
            e.printStackTrace();
        }

        return new ResponseEntity<>(new GloableResponse<>(success, message, null), HttpStatusCode.valueOf(HttpStatus.OK.value()));

    }
}
