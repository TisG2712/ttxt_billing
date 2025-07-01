package com.example.be_quan_tri.services;

import com.example.be_quan_tri.dtos.GloableResponse;
import com.example.be_quan_tri.dtos.ResponsePartner;
import com.example.be_quan_tri.dtos.status.RequestAddStatusDtos;
import com.example.be_quan_tri.dtos.status.RequestUpdateStatusDtos;
import com.example.be_quan_tri.dtos.status.ResponseCountStatus;
import com.example.be_quan_tri.entitys.Services;
import com.example.be_quan_tri.entitys.StatusEntity;
import com.example.be_quan_tri.repositorys.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class StatusService {

    private Boolean success;
    private String message;

    @Autowired
    private StatusRepository statusRepository;

    public List<StatusEntity> getListStatus() {
        return statusRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }

    public ResponseEntity<GloableResponse<ResponsePartner>> addNewStatus(RequestAddStatusDtos requestAddStatusDtos) {
        try {
            StatusEntity  statusEntity = StatusEntity.builder()
                    .statusDetail(requestAddStatusDtos.getTitleStatus())
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .build();

            statusRepository.save(statusEntity);
            success = true;
            message = "Thêm trạng thái thành công";
        }catch (Exception e){
            success = false;
            message = "Thêm trạng thái thất bại";
            e.printStackTrace();
        }


       return new ResponseEntity<>(new GloableResponse<>(success, message, null), HttpStatusCode.valueOf(HttpStatus.OK.value()));
    }

    public ResponseEntity<GloableResponse<ResponsePartner>> deleteStatus(String id) {
        try {
            Long idStatus = (id == null || id.isEmpty()) ? 0L : Long.parseLong(id);
            statusRepository.deleteById(Math.toIntExact(idStatus));
            success = true;
            message = "Xóa trạng thái thành công";
        }catch (Exception e){
            success = false;
            message = "Xóa trạng thái không thành công";
            e.printStackTrace();
        }

        return new ResponseEntity<>(new GloableResponse<>(success, message, null), HttpStatusCode.valueOf(HttpStatus.OK.value()));
    }

    public StatusEntity getOneService(Long idService) {
        return statusRepository.findById(Math.toIntExact(idService)).get();
    }

    public ResponseEntity<GloableResponse<ResponsePartner>> updateStatus(RequestUpdateStatusDtos requestUpdateStatusDtos) {
        if(requestUpdateStatusDtos.getIdStatus() == null || requestUpdateStatusDtos.getIdStatus() == 0) {
            success = false;
            message = "Không tìm thấy Trạng thái cần update";
            return new ResponseEntity<>(new GloableResponse<>(success, message, null), HttpStatusCode.valueOf(HttpStatus.OK.value()));
        }else {
            try {
                StatusEntity statusEntity = statusRepository.findById(Math.toIntExact(requestUpdateStatusDtos.getIdStatus())).get();
                StatusEntity statusEntityNew = StatusEntity.builder()
                        .id(requestUpdateStatusDtos.getIdStatus())
                        .statusDetail(requestUpdateStatusDtos.getEditTitleStatus())
                        .createdAt(statusEntity.getCreatedAt())
                        .updatedAt(LocalDateTime.now())
                        .build();
                statusRepository.save(statusEntityNew);
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

    public List<StatusEntity> getAllStatus() {
        return statusRepository.findAll();
    }


}
