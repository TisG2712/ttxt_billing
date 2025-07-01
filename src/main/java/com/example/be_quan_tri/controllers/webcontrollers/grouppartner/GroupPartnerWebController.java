package com.example.be_quan_tri.controllers.webcontrollers.grouppartner;

import com.example.be_quan_tri.comparator.ServiceComparator;
import com.example.be_quan_tri.dtos.partners.CustomPartnerDtos;
import com.example.be_quan_tri.dtos.partners.CustomPartnerLiteDtos;
import com.example.be_quan_tri.dtos.reports.ReportGroupPartner;
import com.example.be_quan_tri.dtos.reports.ReportPartnerDtosService;
import com.example.be_quan_tri.entitys.GroupPartnerEntity;
import com.example.be_quan_tri.entitys.StatusEntity;
import com.example.be_quan_tri.services.GroupPartnerService;
import com.example.be_quan_tri.services.GroupToPartnerService;
import com.example.be_quan_tri.services.PartnerService;
import com.example.be_quan_tri.services.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping("group-partners/")
public class GroupPartnerWebController {

    @Autowired
    private GroupToPartnerService groupToPartnerService;

    @Autowired
    private GroupPartnerService groupPartnerService;

    @Autowired
    private PartnerService partnerService;

    @Autowired
    private ReportService reportService;

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("listGroup")
    public String listPartner(Model model) {
        List<GroupPartnerEntity> groupPartnerEntities = groupPartnerService.getAllGroup();
        model.addAttribute("listGroup", groupPartnerEntities);
        return "dashboard/groups/listGroup";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("editGroup")
    public String tableService(
            @RequestParam String id, Model model) {
        Long idGroup = Long.valueOf(id);
        GroupPartnerEntity groupPartner = groupPartnerService.getOneGroup(idGroup);
        model.addAttribute("idGroup", idGroup);
        model.addAttribute("group", groupPartner);
        return "dashboard/groups/inforGroup";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("loadPartnerForGroup")
    public String loadPartnerForGroup(
            @RequestParam(defaultValue = "0") String idGroup, Model model) {
        List<CustomPartnerLiteDtos> customPartnerLiteDtos = partnerService.customGetPartnerLite();
        List<CustomPartnerDtos> customPartnerDtos = groupToPartnerService.customGetAllPartner();
        model.addAttribute("customPartnerDtos", customPartnerDtos);
        model.addAttribute("customPartnerLiteDtos", customPartnerLiteDtos);
        model.addAttribute("productComparator", new ServiceComparator());
        model.addAttribute("idGroup", idGroup);
        return "dashboard/groups/loadPartnerForGroup";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("loadListPartnerInGroup")
    public String loadListPartnerInGroup(
            @RequestParam(defaultValue = "0") String idGroup, @RequestParam("startDate") String startDate,
            @RequestParam("endDate") String endDate, Model model) {
        Long id = !Objects.equals(idGroup, "") ? Long.valueOf(idGroup) : null;
        LocalDateTime localDateTimeStart = LocalDateTime.parse(startDate);
        LocalDateTime localDateTimeEnd = LocalDateTime.parse(endDate);
        List<ReportPartnerDtosService> reportGroupPartners = reportService.customGetAllPartnerGroup(localDateTimeStart,
                localDateTimeEnd, id);
        GroupPartnerEntity groupPartner = groupPartnerService.getOneGroup(id);
        Long totalMoney = 0L;
        Long totalTransaction = 0L;
        Long totalTransactionSuccess = 0L;
        for (ReportPartnerDtosService dtos : reportGroupPartners) {
            totalMoney += dtos.getTotalMoney();
            totalTransaction += dtos.getTotalTransaction();
            totalTransactionSuccess += dtos.getTotalTransactionSuccess();
        }
        model.addAttribute("localDateTimeStart", localDateTimeStart);
        model.addAttribute("localDateTimeEnd", localDateTimeEnd);
        model.addAttribute("listGroup", reportGroupPartners);
        model.addAttribute("totalMoney", totalMoney);
        model.addAttribute("nameGroup", groupPartner.getNameGroup());
        model.addAttribute("totalTransaction", totalTransaction);
        model.addAttribute("totalTransactionSuccess", totalTransactionSuccess);
        return "dashboard/groups/loadDetailGroupPartner";
    }

}
