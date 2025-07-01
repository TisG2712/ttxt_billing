package com.example.be_quan_tri.controllers.apiControllers;

import com.example.be_quan_tri.dtos.GloableResponse;
import com.example.be_quan_tri.dtos.ResponsePartner;
import com.example.be_quan_tri.dtos.status.RequestAddStatusDtos;
import com.example.be_quan_tri.dtos.status.RequestAddStatusPartnerDtos;
import com.example.be_quan_tri.dtos.status.ResponseCountStatus;
import com.example.be_quan_tri.services.StatusPartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/status-partner")
public class StatusPartnerControllers {

    @Autowired
    private StatusPartnerService statusPartnerService;

    @PostMapping("add")
    public ResponseEntity<GloableResponse<ResponsePartner>> addStatusPartner(@RequestBody RequestAddStatusPartnerDtos requestAddStatusDtos){
        return statusPartnerService.addStatusPartner(requestAddStatusDtos);
    }

    @GetMapping("countStatus")
    public ResponseEntity<GloableResponse<ResponseCountStatus>> countStatus(@RequestParam String idStatus){
        return statusPartnerService.countStatus(idStatus);
    }
}
