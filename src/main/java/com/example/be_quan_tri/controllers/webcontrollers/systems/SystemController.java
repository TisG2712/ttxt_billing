package com.example.be_quan_tri.controllers.webcontrollers.systems;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "system/")
public class SystemController {

    @GetMapping("userGroups")
    public String userGroups(@RequestParam(defaultValue = "" , value = "size") String size,
                             @RequestParam(defaultValue = "" , value = "page") String page){

        System.out.println(size+"/"+page);
        return "dashboard/system/userGroup";
    }

    @GetMapping("userManagement")
    public String userManagement(@RequestParam(defaultValue = "" , value = "size") String size,
                             @RequestParam(defaultValue = "" , value = "page") String page){

        System.out.println(size+"/"+page);
        return "dashboard/system/userManagement";
    }

    @GetMapping("softwareCategories")  // Thêm /system và sửa thành softwareCategories
    public String softwareCategory(
            @RequestParam(defaultValue = "20") int size,  // Nên dùng int/Integer thay String
            @RequestParam(defaultValue = "0") int page) {

        System.out.println("Size: " + size + ", Page: " + page);
        return "dashboard/system/softwareCategory";  // Trả về template
    }

    @GetMapping("organizationTypes")
    public String organizationTypes(
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(defaultValue = "0") int page) {

        System.out.println("Size: " + size + ", Page: " + page);
        return "dashboard/system/organizationType";
    }

    // lỗi API chưa fix dc
    @GetMapping("positionCategories")
    public String positionCategory(
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(defaultValue = "0") int page) {

        System.out.println("Size: " + size + ", Page: " + page);
        return "dashboard/system/positionCategory";
    }

    @GetMapping("permissionGroups")
    public String permissionGroup(
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(defaultValue = "0") int page) {

        System.out.println("Size: " + size + ", Page: " + page);
        return "dashboard/system/permissionGroup";
    }

    @GetMapping("passwordPolicies")
    public String passwordPolicy(
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(defaultValue = "0") int page) {

        System.out.println("Size: " + size + ", Page: " + page);
        return "dashboard/system/passwordPolicy";
    }

    @GetMapping("accessLogs")
    public String accessLog(
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(defaultValue = "0") int page) {

        System.out.println("Size: " + size + ", Page: " + page);
        return "dashboard/system/accessLog";
    }

    @GetMapping("departmentCategories")
    public String departmentCategory(
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(defaultValue = "0") int page) {

        System.out.println("Size: " + size + ", Page: " + page);
        return "dashboard/system/departmentCategory";
    }

    @GetMapping("departmentInfo")
    public String departmentInfo(
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(defaultValue = "0") int page) {

        System.out.println("Size: " + size + ", Page: " + page);
        return "dashboard/system/departmentInfo";
    }

    @GetMapping("administrativeCategories")
    public String administrativeCategory(
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(defaultValue = "0") int page) {

        System.out.println("Size: " + size + ", Page: " + page);
        return "dashboard/system/administrativeCategory";
    }

    @GetMapping("staffManagement")
    public String staffManagement(
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(defaultValue = "0") int page) {

        System.out.println("Size: " + size + ", Page: " + page);
        return "dashboard/system/staffManagement";
    }

    @GetMapping("staffGroupManagement")
    public String staffGroupManagement(
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(defaultValue = "0") int page) {

        System.out.println("Size: " + size + ", Page: " + page);
        return "dashboard/system/staffGroupManagement";
    }

    @GetMapping("roleManagement")
    public String roleManagement(
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(defaultValue = "0") int page) {

        System.out.println("Size: " + size + ", Page: " + page);
        return "dashboard/system/roleManagement";
    }

    @GetMapping("systemCategories")
    public String systemCategory(
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(defaultValue = "0") int page) {

        System.out.println("Size: " + size + ", Page: " + page);
        return "dashboard/system/systemCategory";
    }

    @GetMapping("utilities")
    public String utilityManagement(
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(defaultValue = "0") int page) {

        System.out.println("Size: " + size + ", Page: " + page);
        return "dashboard/system/utilityManagement";
    }

    @GetMapping("systemParameterGroups")
    public String systemParameterGroup(
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(defaultValue = "0") int page) {

        System.out.println("Size: " + size + ", Page: " + page);
        return "dashboard/system/systemParameterGroup";
    }

    @GetMapping("systemParameter")
    public String systemParameter(
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(defaultValue = "0") int page) {

        System.out.println("Size: " + size + ", Page: " + page);
        return "dashboard/system/systemParameter";
    }

    @GetMapping("softwareFunctionGroups")
    public String softwareFunctionGroup(
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(defaultValue = "0") int page) {

        System.out.println("Size: " + size + ", Page: " + page);
        return "dashboard/system/softwareFunctionGroup";
    }

    @GetMapping("notificationGroups")
    public String notificationGroup(
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(defaultValue = "0") int page) {

        System.out.println("Size: " + size + ", Page: " + page);
        return "dashboard/system/notificationGroup";
    }

    @GetMapping("systemNotifications")
    public String systemNotification(
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(defaultValue = "0") int page) {

        System.out.println("Size: " + size + ", Page: " + page);
        return "dashboard/system/systemNotification";
    }

    @GetMapping("systemVersions")
    public String systemVersion(
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(defaultValue = "0") int page) {

        System.out.println("Size: " + size + ", Page: " + page);
        return "dashboard/system/systemVersion";
    }

    @GetMapping("systemDocuments")
    public String systemDocument(
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(defaultValue = "0") int page) {

        System.out.println("Size: " + size + ", Page: " + page);
        return "dashboard/system/systemDocument";
    }

    @GetMapping("softwareVersions")
    public String softwareVersion(
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(defaultValue = "0") int page) {

        System.out.println("Size: " + size + ", Page: " + page);
        return "dashboard/system/softwareVersion";
    }

    @GetMapping("networkResources")
    public String networkResource(
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(defaultValue = "0") int page) {

        System.out.println("Size: " + size + ", Page: " + page);
        return "dashboard/system/networkResource";
    }

    @GetMapping("securityEvents")
    public String securityEvent(
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(defaultValue = "0") int page) {

        System.out.println("Size: " + size + ", Page: " + page);
        return "dashboard/system/securityEvent";
    }

    @GetMapping("encryptionKeys")
    public String encryptionKey(
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(defaultValue = "0") int page) {

        System.out.println("Size: " + size + ", Page: " + page);
        return "dashboard/system/encryptionKey";
    }

    @GetMapping("systemParameters")
    public String systemParameters(
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(defaultValue = "0") int page) {

        System.out.println("Size: " + size + ", Page: " + page);
        return "dashboard/system/systemParameters";
    }

    @GetMapping("diskStorage")
    public String diskStorage(
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(defaultValue = "0") int page) {

        System.out.println("Size: " + size + ", Page: " + page);
        return "dashboard/system/diskStorage";
    }

    @GetMapping("plugins")
    public String pluginManagement(
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(defaultValue = "0") int page) {

        System.out.println("Size: " + size + ", Page: " + page);
        return "dashboard/system/pluginManagement";
    }

    @GetMapping("ipList")
    public String ipList(
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(defaultValue = "0") int page) {

        System.out.println("Size: " + size + ", Page: " + page);
        return "dashboard/system/ipList";
    }

    @GetMapping("integratedApps")
    public String integratedApp(
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(defaultValue = "0") int page) {

        System.out.println("Size: " + size + ", Page: " + page);
        return "dashboard/system/integratedApp";
    }

    @GetMapping("networkDistribution")
    public String networkDistribution(
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(defaultValue = "0") int page) {

        System.out.println("Size: " + size + ", Page: " + page);
        return "dashboard/system/networkDistribution";
    }

    @GetMapping("vpnList")
    public String vpnList(
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(defaultValue = "0") int page) {

        System.out.println("Size: " + size + ", Page: " + page);
        return "dashboard/system/vpnList";
    }

    @GetMapping("thirdPartyApis")
    public String thirdPartyApi(
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(defaultValue = "0") int page) {

        System.out.println("Size: " + size + ", Page: " + page);
        return "dashboard/system/thirdPartyApi";
    }
}

