package com.example.be_quan_tri.controllers.apiControllers;

import com.example.be_quan_tri.dtos.GloableResponse;
import com.example.be_quan_tri.dtos.ResponsePartner;
import com.example.be_quan_tri.dtos.groups.RequestAddGroupDtos;
import com.example.be_quan_tri.dtos.groups.RequestUpdateGroupDtos;
import com.example.be_quan_tri.dtos.status.RequestAddStatusDtos;
import com.example.be_quan_tri.dtos.status.RequestUpdateStatusDtos;
import com.example.be_quan_tri.services.GroupPartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("api/partner-group/")
public class GroupPartnerController {

    @Autowired
    private GroupPartnerService groupPartnerService;

    @PostMapping("add")
    public ResponseEntity<GloableResponse<ResponsePartner>> addStatus(@RequestBody RequestAddGroupDtos requestAddStatusDtos){
        return groupPartnerService.addNewGroup(requestAddStatusDtos);
    }

    @DeleteMapping("delete")
    public ResponseEntity<GloableResponse<ResponsePartner>> deleteStatus(@RequestParam String id){
        return groupPartnerService.deleteStatus(id);
    }

    @PutMapping("update")
    public ResponseEntity<GloableResponse<ResponsePartner>> updateStatus(@RequestBody RequestUpdateGroupDtos requestUpdateGroupDtos){
        return groupPartnerService.updateGroup(requestUpdateGroupDtos);
    }

}
