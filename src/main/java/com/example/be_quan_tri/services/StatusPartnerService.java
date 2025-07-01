package com.example.be_quan_tri.services;

import com.example.be_quan_tri.dtos.GloableResponse;
import com.example.be_quan_tri.dtos.ResponsePartner;
import com.example.be_quan_tri.dtos.status.CustomStatusDtos;
import com.example.be_quan_tri.dtos.status.RequestAddStatusPartnerDtos;
import com.example.be_quan_tri.dtos.status.ResponseCountStatus;
import com.example.be_quan_tri.entitys.Partner;
import com.example.be_quan_tri.entitys.Partner_to_Status;
import com.example.be_quan_tri.entitys.StatusEntity;
import com.example.be_quan_tri.repositorys.StatusPartnerRepository;
import com.example.be_quan_tri.repositorys.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class StatusPartnerService {
    private Boolean success;
    private String message;

    @Autowired
    private StatusPartnerRepository statusPartnerRepository;

    public ResponseEntity<GloableResponse<ResponsePartner>> addStatusPartner(RequestAddStatusPartnerDtos requestAddStatusDtos) {
        Long idStatus = requestAddStatusDtos.getIdStatus() == 0L ? 0L : requestAddStatusDtos.getIdStatus();
        Long idPartner = requestAddStatusDtos.getIdPartner() == 0L ? 0L : requestAddStatusDtos.getIdPartner();
        if (idStatus == 0L || idPartner == 0L) {
            success = false;
            message = "Lỗi thêm dữ liệu, không tìm thấy trạng thái hoặc đơn vị";
        }else {
            Partner_to_Status checkStatus = statusPartnerRepository.findByUpdatedAt(idPartner);
            if (checkStatus != null) {
                Partner_to_Status partnerToStatus = Partner_to_Status.builder()
                        .id(checkStatus.getId())
                        .partner(checkStatus.getPartner())
                        .status(new StatusEntity(idStatus))
                        .createdAt(LocalDateTime.now())
                        .updatedAt(LocalDateTime.now())
                        .build();
                statusPartnerRepository.save(partnerToStatus);
                success = true;
                message = "Update dữ liệu thành công";
            }else {
                Partner_to_Status partnerToStatus = Partner_to_Status.builder()
                        .partner(new Partner(idPartner))
                        .status(new StatusEntity(idStatus))
                        .createdAt(LocalDateTime.now())
                        .updatedAt(LocalDateTime.now())
                        .build();
                statusPartnerRepository.save(partnerToStatus);
                success = true;
                message = "Thêm dữ liệu thành công";
            }
        }
        return new ResponseEntity<>(new GloableResponse<>(success, message, null), HttpStatusCode.valueOf(HttpStatus.OK.value()));
    }

    public CustomStatusDtos getOneService(Long id) {
        return statusPartnerRepository.findByPartner(id);
    }

    public ResponseEntity<GloableResponse<ResponseCountStatus>> countStatus(String idStatus) {
        Long id = idStatus == null ? 0L : Long.parseLong(idStatus);
        ResponseCountStatus responseCountStatus = null;
        if (id == 0L){
            success = false;
            message = "Không tìm thấy id trạng thái";
        }else {
            int countStatus = statusPartnerRepository.findByCreatedAt(id);
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
}
