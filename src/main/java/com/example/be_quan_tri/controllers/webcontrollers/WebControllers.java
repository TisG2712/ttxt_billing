package com.example.be_quan_tri.controllers.webcontrollers;

import com.example.be_quan_tri.dtos.GloableValue;
import com.example.be_quan_tri.dtos.dashboard.CustomThongKeAdmin;
import com.example.be_quan_tri.dtos.dashboard.CustomTopPartner;
import com.example.be_quan_tri.entitys.GroupPartnerEntity;
import com.example.be_quan_tri.services.CategoryServiceSV;
import com.example.be_quan_tri.services.GroupPartnerService;
import com.example.be_quan_tri.services.PartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;

@Controller

public class WebControllers {

    @Autowired
    private GroupPartnerService groupPartnerService;

    @Autowired
    private PartnerService partnerService;

    @Autowired
    private CategoryServiceSV categoryServiceSV;

    @GetMapping("index")
    public String index(@RequestParam(value = "code", defaultValue = "") String code){

        System.out.println(code);
        return "index";
    }

    public String getToken(String code){

        String url = "https://sso-sandbox.gmedical.vn:3443/realms/gmedical/protocol/openid-connect/token";

        RestTemplate restTemplate = new RestTemplate();

        // Set headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
        body.add("grant_type", "authorization_code");
        body.add("code", code); // truyền code động
        body.add("redirect_uri", "http://gmedicaladmin-sandbox.gtelcds.vn/dashboard?idPart=");
        body.add("client_id", "sub-gmedical-sandbox-01");
        body.add("client_secret", "fDWbP1BCikILIM4Ere1tyFK4eIzuGLuq");

        // Combine headers and body
        HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(body, headers);

        // Send request
        ResponseEntity<String> response = restTemplate.postForEntity(url, entity, String.class);

        // Trả về access token dạng JSON string

        return response.getBody();
    }


    @GetMapping("dashboard")
    public String dashboard(
            @RequestParam(value = "code" , defaultValue = "") String code,
            @RequestParam String idPart,
            Model model
    ){
        return "dashboard/dashboard";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("admin/dashboard")
    public String adminDashboard(Model model){
        Long countPartner = partnerService.countPartner();
        Long countCate = categoryServiceSV.countCate();
        List<CustomTopPartner> customTopPartners = partnerService.getTopPartner(GloableValue.pageAndId("5", "0"));
        model.addAttribute("partner", countPartner);
        model.addAttribute("category", countCate);
        model.addAttribute("customTopPartners", customTopPartners);
        return "dashboard/thongke/thongkeAdmin";
    }

    @PreAuthorize("hasAnyRole('ADMIN', 'PARTNER')")
    @GetMapping("admin/navLeft")
    public String navLeft(Model model){
        List<GroupPartnerEntity> groupPartnerEntities = groupPartnerService.getAllGroup();
        model.addAttribute("listGroup", groupPartnerEntities);
        return "dashboard/navLeft";
    }


}
