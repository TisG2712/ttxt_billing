package com.example.be_quan_tri.controllers.webcontrollers.partners;

import com.example.be_quan_tri.comparator.ServiceComparator;
import com.example.be_quan_tri.dtos.CustomListDataServiceOfCategoryDto;
import com.example.be_quan_tri.dtos.GloableValue;
import com.example.be_quan_tri.dtos.partners.*;
import com.example.be_quan_tri.dtos.reports.fomatReportServiceDtos;
import com.example.be_quan_tri.dtos.reports.fomatReportServiceDtosNew;
import com.example.be_quan_tri.dtos.status.CustomStatusDtos;
import com.example.be_quan_tri.entitys.*;
import com.example.be_quan_tri.services.*;
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

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("partners/")
public class PartnerWebControllers {

    @Autowired
    private PartnerService partnerService;

    @Autowired
    private StatusPartnerService statusPartnerService;

    @Autowired
    private StatusService statusService;

    @Autowired
    private ReportService reportService;

    @Autowired
    private GroupPartnerService groupPartnerService;

    @PreAuthorize("hasAnyRole('ADMIN', 'PARTNER')")
    @GetMapping("listPartner")
    public String listPartner( @RequestParam String size,
                               @RequestParam String page, Model model){
        Page<Partner> partners = partnerService.getAllPartner(GloableValue.pageAndId(size, page));


        model.addAttribute("partners", partners);
        return "dashboard/partner/listPartner";
    }


    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("listPartnerDevTest")
    public String listPartnerDevTest( @RequestParam String size,
                               @RequestParam String page,
                                      @RequestParam String idStatus, Model model){
        Long id = (idStatus == null || idStatus.isEmpty()) ? null : Long.valueOf(idStatus);
        Page<CustomListPartnerDtos> partnerStatus = partnerService.getPartnerStatus(id , GloableValue.pageAndId(size, page));
        StatusEntity status = statusService.getOneService(id);
        model.addAttribute("partners", partnerStatus);
        model.addAttribute("nameStatus", status.getStatusDetail());
        model.addAttribute("productComparator", new ServiceComparator());
        return "dashboard/partner/phanloai/dev-test-partner";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("listGroupPartner")
    public String listGroupPartner(   @RequestParam String size,
                                      @RequestParam String page,
                                      @RequestParam String idGroup, Model model){
        Long id = (idGroup == null || idGroup.isEmpty()) ? null : Long.valueOf(idGroup);
        Page<CustomListPartnerGroupDtos> partnerGroupDtos = partnerService.getPartnerGroup(id , GloableValue.pageAndId(size, page));
        GroupPartnerEntity groupPartnerEntity = groupPartnerService.getOneGroup(id);
        model.addAttribute("partnerGroupDtos", partnerGroupDtos);
        model.addAttribute("nameStatus", groupPartnerEntity.getNameGroup());
        model.addAttribute("productComparator", new ServiceComparator());
        model.addAttribute("id", id);
        return "dashboard/partner/phanloai/group-partner";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("load-CateOfPart")
    public String loadCateOfPart(
            @RequestParam String idCategory,
            @RequestParam String id,
                                Model model){
        Long idPartner = Long.valueOf(id);
        Long categoryId = Long.valueOf(idCategory);
        List<CustomCategoryOfPartnerDtos> categoryOfPartnerDtosList = partnerService.findByEmail(idPartner, categoryId);
        model.addAttribute("categoryOfPartnerDtosList", categoryOfPartnerDtosList);
        model.addAttribute("idPartner", idPartner);
        model.addAttribute("categoryId", categoryId);
        return "dashboard/services/load-CateOfPart";
    }

    @PreAuthorize("hasAnyRole('ADMIN', 'PARTNER')")
    @GetMapping("infoUser")
    public String infoUser( @RequestParam("startDate") String startDate,
                            @RequestParam("endDate") String endDate
                            , Model model, @RequestParam("id") String partnerId){
        Long idPartner = Long.valueOf(partnerId);
        LocalDateTime localDateTimeStart = LocalDateTime.parse(startDate);
        LocalDateTime localDateTimeEnd = LocalDateTime.parse(endDate);
        Page<CustomReportDetailDtosPa1> page3 = reportService.findByCreatedAt3(idPartner, GloableValue.pageAndId("10", "0"));

        Page<CustomReportDetailDtosPa> page2 = reportService.findByCreatedAt2(idPartner, localDateTimeStart, localDateTimeEnd, GloableValue.pageAndId("10", "0"));
        List<CustomReportDetailDtosPaNew> serviceDtosNews = new ArrayList<>();
        for (CustomReportDetailDtosPa dtos : page2) {
            serviceDtosNews.add(dtos.getVo());
        }


        // Tính toán rowspan cho từng ReportService dựa vào SateServiceName
        Map<String, Integer> nameCountMap = new HashMap<>();
        for (CustomReportDetailDtosPaNew report : serviceDtosNews) {
            String name = report.getCategoryName();
            nameCountMap.put(name, nameCountMap.getOrDefault(name, 0) + 1);
        }

        // Gán giá trị rowspan cho từng ReportService
        for (CustomReportDetailDtosPaNew report : serviceDtosNews) {
            report.setRowspan(nameCountMap.get(report.getCategoryName()) > 1 ? 2 : 1);
        }

        Long countQuota = partnerService.countQuota(idPartner) == null ? 0 : partnerService.countQuota(idPartner);
        Partner partner = partnerService.findById(idPartner);
        CustomStatusDtos customStatusDtos = statusPartnerService.getOneService(idPartner);
        Long checkIdStatus = customStatusDtos == null ? 0L : customStatusDtos.getId();

        model.addAttribute("idPartner", idPartner);
        model.addAttribute("countQuota", countQuota);
        model.addAttribute("serviceDtosNews", serviceDtosNews);
        model.addAttribute("partner", partner);
        model.addAttribute("checkIdStatus", checkIdStatus);
        model.addAttribute("customStatusDtos", customStatusDtos);
        model.addAttribute("page3", page3);
        return "dashboard/partner/infoUser";
    }

    @PreAuthorize("hasAnyRole('ADMIN', 'PARTNER')")
    @GetMapping("loadDataServiceInPart")
    public String loadDataServiceInPart(
                            @RequestParam("idPart") String idPart
            , Model model, @RequestParam("idCate") String idCate){
        Long idPartner = Long.valueOf(idPart);
        Long idCateGory = Long.valueOf(idCate);
        List<CustomCategoryOfPartnerDtos> categoryOfPartnerDtosList = partnerService.findByEmail(idPartner, idCateGory);
        model.addAttribute("idPartner", idPartner);
        model.addAttribute("idCateGory", idCateGory);
        model.addAttribute("categoryOfPartnerDtosList", categoryOfPartnerDtosList);
        return "dashboard/partner/loadDataServiceInPart";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("setDateGolive")
    public String setDateGolive(Model model, @RequestParam("idCate") String idCate, @RequestParam("idPart") String idPart){

        model.addAttribute("idCate", idCate);
        model.addAttribute("idPart", idPart);
        return "dashboard/partner/loadSetDateGoLive";
    }


    @GetMapping("addPartner")
    public String addPartner(){
        return "dashboard/partner/addPartner";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("valuePartnerName")
    public String valuePartnerName(Model model, @RequestParam("valuePartnerName") String valuePartnerName){
        List<CustomPartForTransaction> part = partnerService.searchPartForTransaction(valuePartnerName);
        model.addAttribute("part", part);
        return "dashboard/transactions/loadPartnerOfTransaction";
    }

    @PreAuthorize("hasAnyRole('ADMIN', 'PARTNER')")
    @GetMapping("editPartner")
    public String editPartner(@RequestParam("id") String partnerId, Model model){
        Long id = Long.valueOf(partnerId);
        Partner partner = partnerService.findById(id);
        //----
        CustomStatusDtos customStatusDtos = statusPartnerService.getOneService(id);
        Long checkIdStatus = customStatusDtos == null ? 0L : customStatusDtos.getId();
        List<StatusEntity> statusEntities = statusService.getAllStatus();
        model.addAttribute("status", statusEntities);
        model.addAttribute("partner", partner);
        model.addAttribute("customStatusDtos", customStatusDtos);
        model.addAttribute("checkIdStatus", checkIdStatus);
        model.addAttribute("productComparator", new ServiceComparator());
        return "dashboard/partner/editPartner";
    }

    @PreAuthorize("hasAnyRole('ADMIN', 'PARTNER')")
    @GetMapping("detailReport")
    public String listDetail(@RequestParam("id") String idPartner,
                             @RequestParam("startDate") String startDate,
                             @RequestParam("endDate") String endDate,
                             Model model) {

        Long partnerId = Long.valueOf(idPartner);
        LocalDateTime localDateTimeStart = LocalDateTime.parse(startDate);
        LocalDateTime localDateTimeEnd = LocalDateTime.parse(endDate);

        Page<CustomReportDetailDtosPa> page2 = reportService.findByCreatedAt2(partnerId, localDateTimeStart, localDateTimeEnd, GloableValue.pageAndId("10", "0"));
        List<CustomReportDetailDtosPaNew> serviceDtosNews = new ArrayList<>();
        for (CustomReportDetailDtosPa dtos : page2) {
            serviceDtosNews.add(dtos.getVo());
        }
        // Tính toán rowspan cho từng ReportService dựa vào SateServiceName
        Map<String, Integer> nameCountMap = new HashMap<>();
        int count = 1;
        for (CustomReportDetailDtosPaNew report : serviceDtosNews) {
            String name = report.getCategoryName();
            nameCountMap.put(name, nameCountMap.getOrDefault(name, 0) + 1);
        }
        String lastName = null;
        // Gán giá trị rowspan cho từng ReportService
        for (CustomReportDetailDtosPaNew report : serviceDtosNews) {
            String name = report.getCategoryName();
            if (!name.equals(lastName)) {
                // Chỉ gán rowspan cho hàng đầu tiên của mỗi SateServiceName
                report.setRowspan(nameCountMap.get(name));
                lastName = name;
            } else {
                // Các hàng trùng tiếp theo không cần rowspan
                report.setRowspan(0);
            }
        }
        model.addAttribute("serviceDtosNews", serviceDtosNews);
        return "dashboard/partner/detailReport";
    }

}
