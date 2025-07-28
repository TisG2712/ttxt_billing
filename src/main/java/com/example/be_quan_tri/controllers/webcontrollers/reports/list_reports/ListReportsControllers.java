package com.example.be_quan_tri.controllers.webcontrollers.reports.list_reports;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "reports/list_reports/")
public class ListReportsControllers {
    @GetMapping("reportSystemTime")
    public String reportSystemTime(@RequestParam(defaultValue = "" , value = "size") String size,
                                            @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportSystemTime";
    }

}
