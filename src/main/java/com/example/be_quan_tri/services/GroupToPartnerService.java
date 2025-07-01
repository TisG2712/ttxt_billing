package com.example.be_quan_tri.services;

import com.example.be_quan_tri.dtos.GloableResponse;
import com.example.be_quan_tri.dtos.groups.CustomAddPartToGroup;
import com.example.be_quan_tri.dtos.groups.CustomDeletePartToGroup;
import com.example.be_quan_tri.dtos.partners.CustomPartnerDtos;
import com.example.be_quan_tri.dtos.requests.RequestAddCategoryServiceDtos;
import com.example.be_quan_tri.dtos.status.ResponseCountStatus;
import com.example.be_quan_tri.entitys.*;
import com.example.be_quan_tri.repositorys.GroupToPartnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class GroupToPartnerService {

    private Boolean success;
    private String message;

    @Autowired
    private GroupToPartnerRepository groupToPartnerRepository;

    public ResponseEntity<GloableResponse<ResponseCountStatus>> countGroup(String idGroup) {

        Long id = idGroup == null ? 0L : Long.parseLong(idGroup);
        ResponseCountStatus responseCountStatus = null;
        if (id == 0L){
            success = false;
            message = "Không tìm thấy id trạng thái";
        }else {
            int countStatus = groupToPartnerRepository.findByCreatedAt(id);
            responseCountStatus = ResponseCountStatus.builder()
                    .count(countStatus)
                    .build();
            success = true;
            message = "Lấy số liệu thành công";
        }

        return new ResponseEntity<>(new GloableResponse<>(success, message,
                responseCountStatus
        ), HttpStatusCode.valueOf(HttpStatus.OK.value()));

    }

    public List<CustomPartnerDtos> customGetAllPartner() {
        return groupToPartnerRepository.customGetAllPartner();
    }

    public ResponseEntity<GloableResponse<RequestAddCategoryServiceDtos>> addCategoryPartToGroup(CustomAddPartToGroup customAddPartToGroup) {
        try{
            if (customAddPartToGroup.getIdGroup() != null && !customAddPartToGroup.getData().isEmpty()) {
                for (Long item : customAddPartToGroup.getData()){
                    List<Partner_to_group> partner = groupToPartnerRepository.findByPartnerAndGroupPartnerEntity(new Partner(item), new GroupPartnerEntity(customAddPartToGroup.getIdGroup()));
                    if (!partner.isEmpty()) {
                        success = false;
                        message = "Data already exists";
                    }else {
                        Partner_to_group partner_to_service = Partner_to_group.builder()
                                .groupPartnerEntity(new GroupPartnerEntity(customAddPartToGroup.getIdGroup()))
                                .partner(new Partner(item))
                                .createdAt(LocalDateTime.now())
                                .updatedAt(LocalDateTime.now())
                                .build();
                        groupToPartnerRepository.save(partner_to_service);
                        success = true;
                        message = "CategoryService added successfully";
                    }

                }
            }else {
                success = false;
                message = "CategoryService added fail";
            }

        } catch (Exception e) {
            success = false;
            message = "CategoryService added fail";
            throw new RuntimeException(e);
        }

        return new ResponseEntity<>(new GloableResponse<>(
                success, message, null
        ), HttpStatusCode.valueOf(HttpStatus.OK.value()));

    }

    public ResponseEntity<GloableResponse<RequestAddCategoryServiceDtos>> deletePartToGroup(CustomDeletePartToGroup customDeletePartToGroup) {
        if (customDeletePartToGroup.getIdPart() != 0L || customDeletePartToGroup.getIdGroup() != 0L){
            try {
                groupToPartnerRepository.customDeletePartOfGroup(customDeletePartToGroup.getIdPart(), customDeletePartToGroup.getIdGroup());
                success = true;
                message = "CategoryService deleted successfully";
            }catch (Exception e) {
                success = false;
                message = "CategoryService deleted fail";
                e.printStackTrace();
            }
        }else {
            success = false;
            message = "CategoryService deleted fail";
        }
        return new ResponseEntity<>(new GloableResponse<>(
                success, message, null
        ), HttpStatusCode.valueOf(HttpStatus.OK.value()));
    }
}
