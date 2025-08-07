package com.example.be_quan_tri.controllers.webcontrollers.customer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "customer/")
public class CustomerController {

    // Quản lý Nhóm Khách Hàng
    @GetMapping("customerGroupManagement")
    public String customerGroupManagement(@RequestParam(defaultValue = "", value = "size") String size,
                                          @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/customer/customerGroupManagement";
    }

    // Quản lý Khách Hàng
    @GetMapping("customerManagement")
    public String customerManagement(@RequestParam(defaultValue = "", value = "size") String size,
                                     @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/customer/customerManagement";
    }

    // Quản lý Loại Chi nhánh
    @GetMapping("branchTypeManagement")
    public String branchTypeManagement(@RequestParam(defaultValue = "", value = "size") String size,
                                       @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/customer/branchTypeManagement";
    }

    // Quản lý Sử Dụng Dịch Vụ
    @GetMapping("serviceUsageManagement")
    public String serviceUsageManagement(@RequestParam(defaultValue = "", value = "size") String size,
                                         @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/customer/serviceUsageManagement";
    }

    // Quản lý nhóm Nhân viên
    @GetMapping("employeeGroupManagement")
    public String employeeGroupManagement(@RequestParam(defaultValue = "", value = "size") String size,
                                          @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/customer/employeeGroupManagement";
    }

    // Quản lý Nhân viên
    @GetMapping("employeeManagement")
    public String employeeManagement(@RequestParam(defaultValue = "", value = "size") String size,
                                     @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/customer/employeeManagement";
    }

    // Quản Lý Thông Tin Tổ chức
    @GetMapping("organizationInfoManagement")
    public String organizationInfoManagement(@RequestParam(defaultValue = "", value = "size") String size,
                                             @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/customer/organizationInfoManagement";
    }

    // Quản lý liên hệ khách hàng
    @GetMapping("customerContactManagement")
    public String customerContactManagement(@RequestParam(defaultValue = "", value = "size") String size,
                                            @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/customer/customerContactManagement";
    }

    // Quản lý lịch sử giao dịch
    @GetMapping("transactionHistoryManagement")
    public String transactionHistoryManagement(@RequestParam(defaultValue = "", value = "size") String size,
                                               @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/customer/transactionHistoryManagement";
    }

    // Quản lý lịch sử tương tác
    @GetMapping("interactionHistoryManagement")
    public String interactionHistoryManagement(@RequestParam(defaultValue = "", value = "size") String size,
                                               @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/customer/interactionHistoryManagement";
    }

    // Quản lý lịch làm việc
    @GetMapping("workScheduleManagement")
    public String workScheduleManagement(@RequestParam(defaultValue = "", value = "size") String size,
                                         @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/customer/workScheduleManagement";
    }

    // Quản lý ghi chú và nhắc nhở
    @GetMapping("notesRemindersManagement")
    public String notesRemindersManagement(@RequestParam(defaultValue = "", value = "size") String size,
                                           @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/customer/notesRemindersManagement";
    }

    // Quản lý nguồn lực
    @GetMapping("resourceManagement")
    public String resourceManagement(@RequestParam(defaultValue = "", value = "size") String size,
                                     @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/customer/resourceManagement";
    }

    // Quản lý tiến trình chuyển đổi khách hàng tiềm năng
    @GetMapping("leadConversionManagement")
    public String leadConversionManagement(@RequestParam(defaultValue = "", value = "size") String size,
                                           @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/customer/leadConversionManagement";
    }

    // Quản lý Ghi chú đặc biệt
    @GetMapping("specialNotesManagement")
    public String specialNotesManagement(@RequestParam(defaultValue = "", value = "size") String size,
                                         @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/customer/specialNotesManagement";
    }

    // Quản lý Danh mục Kênh tiếp cận
    @GetMapping("channelCategoryManagement")
    public String channelCategoryManagement(@RequestParam(defaultValue = "", value = "size") String size,
                                            @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/customer/channelCategoryManagement";
    }

    // Quản lý Danh sách Kênh tiếp cận
    @GetMapping("channelListManagement")
    public String channelListManagement(@RequestParam(defaultValue = "", value = "size") String size,
                                        @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/customer/channelListManagement";
    }

    // Quản lý phản hồi
    @GetMapping("feedbackManagement")
    public String feedbackManagement(@RequestParam(defaultValue = "", value = "size") String size,
                                     @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/customer/feedbackManagement";
    }

    // Quản lý danh mục kịch bản Giới thiệu
    @GetMapping("introductionScenarioCategoryManagement")
    public String introductionScenarioCategoryManagement(@RequestParam(defaultValue = "", value = "size") String size,
                                                         @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/customer/introductionScenarioCategoryManagement";
    }

    // Quản lý danh sách kịch bản Giới thiệu
    @GetMapping("introductionScenarioListManagement")
    public String introductionScenarioListManagement(@RequestParam(defaultValue = "", value = "size") String size,
                                                     @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/customer/introductionScenarioListManagement";
    }

    // Quản lý các câu hỏi thường gặp
    @GetMapping("faqManagement")
    public String faqManagement(@RequestParam(defaultValue = "", value = "size") String size,
                                @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/customer/faqManagement";
    }

    // Quản lý mẫu chúc mừng sinh nhật
    @GetMapping("birthdayTemplateManagement")
    public String birthdayTemplateManagement(@RequestParam(defaultValue = "", value = "size") String size,
                                             @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/customer/birthdayTemplateManagement";
    }

    // Quản lý Loại ngân sách Quảng cáo
    @GetMapping("adBudgetTypeManagement")
    public String adBudgetTypeManagement(@RequestParam(defaultValue = "", value = "size") String size,
                                         @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/customer/adBudgetTypeManagement";
    }

    // Quản lý ngân sách Quảng cáo
    @GetMapping("adBudgetManagement")
    public String adBudgetManagement(@RequestParam(defaultValue = "", value = "size") String size,
                                     @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/customer/adBudgetManagement";
    }
}
