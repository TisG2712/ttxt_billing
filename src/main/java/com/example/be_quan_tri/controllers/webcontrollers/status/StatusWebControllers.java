package com.example.be_quan_tri.controllers.webcontrollers.status;

import com.example.be_quan_tri.entitys.Services;
import com.example.be_quan_tri.entitys.StatusEntity;
import com.example.be_quan_tri.services.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("status/")
public class StatusWebControllers {

    @Autowired
    private StatusService statusService;

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("status")
    public String listCategoryService(Model model) {
        List<StatusEntity> status = statusService.getListStatus();
        model.addAttribute("status", status);
        return "dashboard/status/status";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("editStatus")
    public String tableService(
            @RequestParam String id, Model model) {
        Long idStatus = Long.valueOf(id);
        StatusEntity statusEntity = statusService.getOneService(idStatus);
        model.addAttribute("idStatus", idStatus);
        model.addAttribute("status", statusEntity);
        return "dashboard/status/inforStatus";
    }
}
