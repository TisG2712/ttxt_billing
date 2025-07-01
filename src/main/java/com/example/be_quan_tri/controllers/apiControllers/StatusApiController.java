package com.example.be_quan_tri.controllers.apiControllers;

import com.example.be_quan_tri.dtos.GloableResponse;
import com.example.be_quan_tri.dtos.ResponsePartner;
import com.example.be_quan_tri.dtos.status.RequestAddStatusDtos;
import com.example.be_quan_tri.dtos.status.RequestUpdateStatusDtos;
import com.example.be_quan_tri.dtos.status.ResponseCountStatus;
import com.example.be_quan_tri.services.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/status")
public class StatusApiController {

    @Autowired
    private StatusService statusService;

    @PostMapping("add")
    public ResponseEntity<GloableResponse<ResponsePartner>> addStatus(@RequestBody RequestAddStatusDtos requestAddStatusDtos){
        return statusService.addNewStatus(requestAddStatusDtos);
    }


    @DeleteMapping("delete")
    public ResponseEntity<GloableResponse<ResponsePartner>> deleteStatus(@RequestParam String id){
        return statusService.deleteStatus(id);
    }

    @PutMapping("update")
    public ResponseEntity<GloableResponse<ResponsePartner>> updateStatus(@RequestBody RequestUpdateStatusDtos requestUpdateStatusDtos){
        return statusService.updateStatus(requestUpdateStatusDtos);
    }

}
