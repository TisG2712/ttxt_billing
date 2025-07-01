package com.example.be_quan_tri.controllers.apiControllers;

import com.example.be_quan_tri.dtos.GloableResponse;
import com.example.be_quan_tri.dtos.requests.RequestUpdateService;
import com.example.be_quan_tri.services.DvServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("services/")
public class ServiceController {

    @Autowired
    private DvServices dvServices;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("updateService")
    public ResponseEntity<GloableResponse<RequestUpdateService>> updateService(@RequestBody RequestUpdateService requestUpdateService){
        return dvServices.updateService(requestUpdateService);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("addService")
    public ResponseEntity<GloableResponse<RequestUpdateService>> addService(@RequestBody RequestUpdateService requestUpdateService){
        return dvServices.addService(requestUpdateService);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("deleteService")
    public ResponseEntity<GloableResponse<RequestUpdateService>> deleteService(@RequestParam("id") String id){
        Long idService = Long.valueOf(id);
        return dvServices.deleteService(idService);
    }

}
