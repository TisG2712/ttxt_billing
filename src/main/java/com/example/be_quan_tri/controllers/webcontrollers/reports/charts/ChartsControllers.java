package com.example.be_quan_tri.controllers.webcontrollers.reports.charts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "reports/charts/")
public class ChartsControllers {
    @GetMapping("testEnvServiceStatusChart")
    public String testEnvServiceStatusChart(@RequestParam(defaultValue = "" , value = "size") String size,
                                @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/charts/testEnvServiceStatusChart";
    }
    @GetMapping("prodEnvServiceStatusChart")
    public String prodEnvServiceStatusChart(@RequestParam(defaultValue = "" , value = "size") String size,
                                            @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/charts/prodEnvServiceStatusChart";
    }
    @GetMapping("topSharingOrganizationsChart")
    public String topSharingOrganizationsChart(@RequestParam(defaultValue = "" , value = "size") String size,
                                            @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/charts/topSharingOrganizationsChart";
    }
    @GetMapping("topIntegratedServicesChart")
    public String topIntegratedServicesChart(@RequestParam(defaultValue = "" , value = "size") String size,
                                            @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/charts/topIntegratedServicesChart";
    }
    @GetMapping("integrationApprovalRateChart")
    public String integrationApprovalRateChart(@RequestParam(defaultValue = "" , value = "size") String size,
                                            @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/charts/integrationApprovalRateChart";
    }
    @GetMapping("integrationRequestTrendChart")
    public String integrationRequestTrendChart(@RequestParam(defaultValue = "" , value = "size") String size,
                                            @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/charts/integrationRequestTrendChart";
    }
    @GetMapping("topUsingOrganizationsChart")
    public String topUsingOrganizationsChart(@RequestParam(defaultValue = "" , value = "size") String size,
                                            @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/charts/topUsingOrganizationsChart";
    }
    @GetMapping("serviceUsageOverTimeChart")
    public String serviceUsageOverTimeChart(@RequestParam(defaultValue = "" , value = "size") String size,
                                            @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/charts/serviceUsageOverTimeChart";
    }
    @GetMapping("topRequestedServicesChart")
    public String topRequestedServicesChart(@RequestParam(defaultValue = "" , value = "size") String size,
                                            @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/charts/topRequestedServicesChart";
    }
    @GetMapping("usageRatioBetweenOrganizationsChart")
    public String usageRatioBetweenOrganizationsChart(@RequestParam(defaultValue = "" , value = "size") String size,
                                            @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/charts/usageRatioBetweenOrganizationsChart";
    }
    @GetMapping("requestRatioByStatusChart")
    public String requestRatioByStatusChart(@RequestParam(defaultValue = "" , value = "size") String size,
                                                      @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/charts/requestRatioByStatusChart";
    }
    @GetMapping("criticalServiceStatusChart")
    public String criticalServiceStatusChart(@RequestParam(defaultValue = "" , value = "size") String size,
                                                      @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/charts/criticalServiceStatusChart";
    }
    @GetMapping("totalServiceRequestsChart")
    public String totalServiceRequestsChart(@RequestParam(defaultValue = "" , value = "size") String size,
                                                      @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/charts/totalServiceRequestsChart";
    }
    @GetMapping("top10IntegratedUsersChart")
    public String top10IntegratedUsersChart(@RequestParam(defaultValue = "" , value = "size") String size,
                                                      @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/charts/top10IntegratedUsersChart";
    }
}
