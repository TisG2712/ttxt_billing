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
}
