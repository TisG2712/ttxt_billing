package com.example.be_quan_tri.controllers.apiControllers;

import com.example.be_quan_tri.dtos.GloableResponse;
import com.example.be_quan_tri.dtos.groups.CustomAddPartToGroup;
import com.example.be_quan_tri.dtos.groups.CustomDeletePartToGroup;
import com.example.be_quan_tri.dtos.partners.CustomAddCateDtos;
import com.example.be_quan_tri.dtos.requests.RequestAddCategoryServiceDtos;
import com.example.be_quan_tri.dtos.status.ResponseCountStatus;
import com.example.be_quan_tri.services.GroupToPartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/partner-to-group/")
public class GroupToPartnerController {

    @Autowired
    private GroupToPartnerService groupToPartnerService;

    @GetMapping("countGroup")
    public ResponseEntity<GloableResponse<ResponseCountStatus>> countGroup(@RequestParam String idGroup){
        return groupToPartnerService.countGroup(idGroup);
    }

    @PostMapping("addCategoryPartToGroup")
    public ResponseEntity<GloableResponse<RequestAddCategoryServiceDtos>> addCategoryServiceToPart(@RequestBody CustomAddPartToGroup customAddPartToGroup){
        return groupToPartnerService.addCategoryPartToGroup(customAddPartToGroup);
    }

    @DeleteMapping("deletePartToGroup")
    public ResponseEntity<GloableResponse<RequestAddCategoryServiceDtos>> deletePartToGroup(@RequestBody CustomDeletePartToGroup customDeletePartToGroup){
        return groupToPartnerService.deletePartToGroup(customDeletePartToGroup);
    }

}
