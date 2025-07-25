$(document).ready(function () {
    $("#fullName").html(partnerName);
    $(".nav-user").click(function () {
        $(".box-infoUser").toggleClass("hien")
    });
    $("#btn-infoAccount").click(function () {
    
    });
    // Sự kiện dropdown của quản trị hệ thống
    $("#viewSystemAdmin").click(function () {
        $(this).parent().find("ul.ul-children").slideToggle();
    });
    // Sự kiện dropdown của quản lý điều hành
    $("#viewExecutiveAdmin").click(function () {
        $(this).parent().find("ul.ul-children").slideToggle();
    });
    $("#viewAPIManagement").click(function () {
        $(this).parent().find("ul.ul-children").slideToggle();
    });
    $("#viewDv").click(function () {
        $(this).parent().find("ul.ul-children").slideToggle();
    })
    $("#viewMore").click(function () {
        $(this).parent().find("ul.ul-children").slideToggle();
    })
    $("#viewGroupPartner").click(function () {
        $(this).parent().find("ul.ul-children-group").slideToggle();
    })
    $("#viewReport").click(function(){
        $(this).parent().find("ul.ul-children").slideToggle();
    });
    $("#viewPartnerParent").click(function(){
        $(this).parent().find("ul.ul-children").slideToggle();
    });
})
$(document).ready(function () {
    
    //Dashboard Router
    $("#dashboard").click(function () {
        if (role === "ADMIN"){
            customGetPage(`${localdomain}/admin/dashboard?idPart=`, "#content_box");
        }else if(role === "PARTNER"){
            customGetPage(`${localdomain}/admin/dashboardUser?userId=${userId}&startDate=${getFirstDayOfMonth()}&endDate=${getLastDayOfMonth()}`, "#content_box");
        }
    });

    // System Admin Router - Chỉ dành cho ADMIN
    if (role === "ADMIN") {
        // Quản lý nhóm người dùng
        $("#userGroupLink").click(function () {
            customGetPage(`${localdomain}/system/userGroups?size=${20}&page=${0}`, "#content_box");
        });

        // Quản lý người dùng
        $("#userManagementLink").click(function () {
            customGetPage(`${localdomain}/system/userManagement?size=${20}&page=${0}`, "#content_box");
        });

        // Quản lý danh mục phần mềm
        $("#softwareCategoryLink").click(function() {
            customGetPage(`${localdomain}/system/softwareCategories?size=20&page=0`, "#content_box");
        });

        // Quản lý Danh mục Loại hình tổ chức
        $("#organizationTypeLink").click(function () {
            customGetPage(`${localdomain}/system/organizationTypes?size=${20}&page=${0}`, "#content_box");
        });

        // Quản lý danh mục chức vụ - Chưa làm được
        $("#positionCategoryLink").click(function () {
            customGetPage(`${localdomain}/system/positionCategories?size=20&page=0`, "#content_box");
        });

        // Quản lý Nhóm quyền
        $("#permissionGroupLink").click(function () {
            customGetPage(`${localdomain}/system/permissionGroups?size=${20}&page=${0}`, "#content_box");
        });

        // Quản lý Mật khẩu và Bảo mật
        $("#passwordPolicyLink").click(function () {
            customGetPage(`${localdomain}/system/passwordPolicies?size=${20}&page=${0}`, "#content_box");
        });

        // Quản lý Log Truy Cập
        $("#accessLogLink").click(function () {
            customGetPage(`${localdomain}/system/accessLogs?size=${20}&page=${0}`, "#content_box");
        });

        // Quản lý danh mục Phòng ban
        $("#departmentCategoryLink").click(function () {
            customGetPage(`${localdomain}/system/departmentCategories?size=${20}&page=${0}`, "#content_box");
        });

        // Quản lý thông tin Phòng ban
        $("#departmentInfoLink").click(function () {
            customGetPage(`${localdomain}/system/departmentInfo?size=${20}&page=${0}`, "#content_box");
        });

        // Quản lý danh mục hành chính
        $("#administrativeCategoryLink").click(function () {
            customGetPage(`${localdomain}/system/administrativeCategories?size=${20}&page=${0}`, "#content_box");
        });

        // Quản lý Cán bộ
        $("#staffManagementLink").click(function () {
            customGetPage(`${localdomain}/system/staffManagement?size=${20}&page=${0}`, "#content_box");
        });

        // Quản lý Nhóm cán bộ
        $("#staffGroupManagementLink").click(function () {
            customGetPage(`${localdomain}/system/staffManagement?size=${20}&page=${0}`, "#content_box");
        });

        // Quản lý Vai trò
        $("#roleManagementLink").click(function () {
            customGetPage(`${localdomain}/system/staffManagement?size=${20}&page=${0}`, "#content_box");
        });

        // Quản lý Hệ Thống Danh Mục
        $("#systemCategoryLink").click(function () {
            customGetPage(`${localdomain}/system/systemCategories?size=${20}&page=${0}`, "#content_box");
        });

        // Quản lý Tiện Ích
        $("#utilityManagementLink").click(function () {
            customGetPage(`${localdomain}/system/utilities?size=${20}&page=${0}`, "#content_box");
        });

        // Quản lý nhóm tham số hệ thống
        $("#systemParameterGroupLink").click(function () {
            customGetPage(`${localdomain}/system/systemParameterGroups?size=${20}&page=${0}`, "#content_box");
        });

        // Quản lý tham số hệ thống
        $("#systemParameterLink").click(function () {
            customGetPage(`${localdomain}/system/systemParameters?size=${20}&page=${0}`, "#content_box");
        });

        // Quản lý nhóm chức năng phần mềm
        $("#softwareFunctionGroupLink").click(function () {
            customGetPage(`${localdomain}/system/softwareFunctionGroups?size=${20}&page=${0}`, "#content_box");
        });

        // Quản lý nhóm thông báo
        $("#notificationGroupLink").click(function () {
            customGetPage(`${localdomain}/system/notificationGroups?size=${20}&page=${0}`, "#content_box");
        });

        // Quản lý thông báo hệ thống
        $("#systemNotificationLink").click(function () {
            customGetPage(`${localdomain}/system/systemNotifications?size=${20}&page=${0}`, "#content_box");
        });

        // Quản lý phiên bản cấu hình hệ thống
        $("#systemVersionLink").click(function () {
            customGetPage(`${localdomain}/system/systemVersions?size=${20}&page=${0}`, "#content_box");
        });

        // Quản lý tài liệu cấu hình hệ thống
        $("#systemDocumentLink").click(function () {
            customGetPage(`${localdomain}/system/systemDocuments?size=${20}&page=${0}`, "#content_box");
        });

        // Quản lý bản vá phần mềm
        $("#softwareVersionLink").click(function () {
            customGetPage(`${localdomain}/system/softwareVersions?size=${20}&page=${0}`, "#content_box");
        });

        // Quản lý tài nguyên mạng
        $("#networkResourceLink").click(function () {
            customGetPage(`${localdomain}/system/networkResources?size=${20}&page=${0}`, "#content_box");
        });

        // Quản lý sự kiện an ninh hệ thống
        $("#securityEventLink").click(function () {
            customGetPage(`${localdomain}/system/securityEvents?size=${20}&page=${0}`, "#content_box");
        });

        // Quản lý khóa mã hóa
        $("#encryptionKeyLink").click(function () {
            customGetPage(`${localdomain}/system/encryptionKeys?size=${20}&page=${0}`, "#content_box");
        });

        // Quản lý các tham số hệ thống
        $("#systemParametersLink").click(function () {
            customGetPage(`${localdomain}/system/systemParameters?size=${20}&page=${0}`, "#content_box");
        });

        // Quản lý dung lượng ổ đĩa
        $("#diskStorageLink").click(function () {
            customGetPage(`${localdomain}/system/diskStorage?size=${20}&page=${0}`, "#content_box");
        });

        // Quản lý các Plugin
        $("#pluginManagementLink").click(function () {
            customGetPage(`${localdomain}/system/plugins?size=${20}&page=${0}`, "#content_box");
        });

        // Quản lý danh sách IP
        $("#ipListLink").click(function () {
            customGetPage(`${localdomain}/system/ipList?size=${20}&page=${0}`, "#content_box");
        });

        // Quản lý ứng dụng tích hợp
        $("#integratedAppLink").click(function () {
            customGetPage(`${localdomain}/system/integratedApps?size=${20}&page=${0}`, "#content_box");
        });

        // Quản lý tài nguyên mạng & phân phối tài nguyên
        $("#networkDistributionLink").click(function () {
            customGetPage(`${localdomain}/system/networkDistribution?size=${20}&page=${0}`, "#content_box");
        });

        // Quản lý danh sách VPN
        $("#vpnListLink").click(function () {
            customGetPage(`${localdomain}/system/vpnList?size=${20}&page=${0}`, "#content_box");
        });

        // Quản lý ứng dụng bên thứ ba kết nối với hệ thống qua API
        $("#thirdPartyApiLink").click(function () {
            customGetPage(`${localdomain}/system/thirdPartyApis?size=${20}&page=${0}`, "#content_box");
        });
    }

    // Executive Router ( Quản lý điều hành ) - Chỉ dành cho ADMIN
    if (role === "ADMIN") {
        // Quản lý Danh mục Ticket
        $("#ticketCategoryLink").click(function () {
            customGetPage(`${localdomain}/executive/ticketCategories?size=20&page=0`, "#content_box");
        });

        // Quản lý SLA Template
        $("#slaTemplateLink").click(function () {
            customGetPage(`${localdomain}/executive/slaTemplates?size=20&page=0`, "#content_box");
        });

        // Quản lý mức độ ưu tiên ticket
        $("#ticketPriorityLink").click(function () {
            customGetPage(`${localdomain}/executive/ticketPriorities?size=20&page=0`, "#content_box");
        });

        // Quản lý Danh mục SLA
        $("#slaCategoryLink").click(function () {
            customGetPage(`${localdomain}/executive/slaCategories?size=20&page=0`, "#content_box");
        });

        // Quản lý SLA
        $("#slaManagementLink").click(function () {
            customGetPage(`${localdomain}/executive/slaManagements?size=20&page=0`, "#content_box");
        });

        // Quản lý Schedules
        $("#scheduleManagementLink").click(function () {
            customGetPage(`${localdomain}/executive/scheduleManagements?size=20&page=0`, "#content_box");
        });

        // Quản lý File Đính Kèm
        $("#fileManagementLink").click(function () {
            customGetPage(`${localdomain}/executive/fileManagements?size=20&page=0`, "#content_box");
        });

        // Quản lý Danh Sách Trạng Thái
        $("#statusListLink").click(function () {
            customGetPage(`${localdomain}/executive/statusList?size=20&page=0`, "#content_box");
        });

        $("#ticketTemplateCategoryLink").click(function () {
            customGetPage(`${localdomain}/executive/ticketTemplateCategories?size=20&page=0`, "#content_box");
        });

        // Quản lý Danh sách Mẫu Ticket
        $("#ticketTemplateListLink").click(function () {
            customGetPage(`${localdomain}/executive/ticketTemplateLists?size=20&page=0`, "#content_box");
        });

        // Quản lý mã định danh Ticket
        $("#ticketCodeLink").click(function () {
            customGetPage(`${localdomain}/executive/ticketCodes?size=20&page=0`, "#content_box");
        });

        // Quản lý Loại Kênh tiếp nhận
        $("#channelTypeLink").click(function () {
            customGetPage(`${localdomain}/executive/channelTypes?size=20&page=0`, "#content_box");
        });

        // Quản lý Danh sách Kênh tiếp nhận
        $("#channelListLink").click(function () {
            customGetPage(`${localdomain}/executive/channelList?size=20&page=0`, "#content_box");
        });

        // Quản lý Danh sách Nhãn Ticket
        $("#ticketLabelListLink").click(function () {
            customGetPage(`${localdomain}/executive/ticketLabels?size=20&page=0`, "#content_box");
        });

        // Quản lý Danh sách Trạng thái Ticket
        $("#ticketStatusListLink").click(function () {
            customGetPage(`${localdomain}/executive/ticketStatusList?size=20&page=0`, "#content_box");
        });

        // Quản lý Danh sách Liên kết Ticket
        $("#ticketRelationListLink").click(function () {
            customGetPage(`${localdomain}/executive/ticketRelations?size=20&page=0`, "#content_box");
        });

        // Quản lý Thông tin người gửi Ticket
        $("#ticketSenderInfoLink").click(function () {
            customGetPage(`${localdomain}/executive/ticketSenderInfo?size=20&page=0`, "#content_box");
        });

        // Quản lý Thời gian nhận Ticket
        $("#ticketReceiveTimeLink").click(function () {
            customGetPage(`${localdomain}/executive/ticketReceiveTimes?size=20&page=0`, "#content_box");
        });
    }

    // API Management Menu Routing - Chỉ dành cho ADMIN
    if (role === "ADMIN") {

        // Quản lý API
        $("#apiManagementLink").click(function () {
            customGetPage(`${localdomain}/api/apiManagement?size=20&page=0`, "#content_box");
        });

        // Quản lý Nhóm API
        $("#apiGroupLink").click(function () {
            customGetPage(`${localdomain}/api/apiGroups?size=20&page=0`, "#content_box");
        });

        // Quản lý Phiên bản API
        $("#apiVersionLink").click(function () {
            customGetPage(`${localdomain}/api/apiVersions?size=20&page=0`, "#content_box");
        });

        // Quản lý Tài liệu API
        $("#apiDocsLink").click(function () {
            customGetPage(`${localdomain}/api/apiDocs?size=20&page=0`, "#content_box");
        });

        // Quản lý Chính sách bảo mật
        $("#apiSecurityPolicyLink").click(function () {
            customGetPage(`${localdomain}/api/apiSecurityPolicies?size=20&page=0`, "#content_box");
        });

        // Quản lý Lưu lượng API
        $("#apiTrafficLink").click(function () {
            customGetPage(`${localdomain}/api/apiTraffic?size=20&page=0`, "#content_box");
        });

        // Quản lý Hiệu suất dịch vụ
        $("#servicePerformanceLink").click(function () {
            customGetPage(`${localdomain}/api/servicePerformance?size=20&page=0`, "#content_box");
        });

        // Quản lý API Key
        $("#apiKeyLink").click(function () {
            customGetPage(`${localdomain}/api/apiKeys?size=20&page=0`, "#content_box");
        });

        // Quản lý lỗi API
        $("#apiErrorLink").click(function () {
            customGetPage(`${localdomain}/api/apiErrors?size=20&page=0`, "#content_box");
        });

        // Quản lý thông tin sự cố
        $("#incidentInfoLink").click(function () {
            customGetPage(`${localdomain}/api/incidentInfo?size=20&page=0`, "#content_box");
        });

        // Quản lý Cân bằng tải
        $("#loadBalancingLink").click(function () {
            customGetPage(`${localdomain}/api/loadBalancing?size=20&page=0`, "#content_box");
        });

        // Quản lý phiên bản định tuyến
        $("#fixedRoutingVersionLink").click(function () {
            customGetPage(`${localdomain}/api/fixedRoutingVersions?size=20&page=0`, "#content_box");
        });

        // Quản lý quyền truy cập Route
        $("#routeAccessControlLink").click(function () {
            customGetPage(`${localdomain}/api/routeAccessControls?size=20&page=0`, "#content_box");
        });

        // Quản lý Plugin
        $("#pluginManagementsLink").click(function () {
            customGetPage(`${localdomain}/api/plugins?size=20&page=0`, "#content_box");
        });

        // Quản lý Plugin Tùy chỉnh
        $("#customPluginLink").click(function () {
            customGetPage(`${localdomain}/api/customPlugins?size=20&page=0`, "#content_box");
        });

        // Quản lý phiên bản Plugin
        $("#pluginVersionLink").click(function () {
            customGetPage(`${localdomain}/api/pluginVersion?size=20&page=0`, "#content_box");
        });

        // Quản lý quyền truy cập Plugin
        $("#pluginAccessControlLink").click(function () {
            customGetPage(`${localdomain}/api/pluginAccessControls?size=20&page=0`, "#content_box");
        });

        // Quản lý cấu hình Plugin
        $("#pluginConfigLink").click(function () {
            customGetPage(`${localdomain}/api/pluginConfigs?size=20&page=0`, "#content_box");
        });

        // Quản lý chuỗi Plugin
        $("#pluginChainLink").click(function () {
            customGetPage(`${localdomain}/api/pluginChains?size=20&page=0`, "#content_box");
        });

        // Quản lý bảo mật Plugin
        $("#pluginSecurityLink").click(function () {
            customGetPage(`${localdomain}/api/pluginSecurity?size=20&page=0`, "#content_box");
        });

        // Quản lý nhóm tài liệu Plugin
        $("#pluginDocsGroupLink").click(function () {
            customGetPage(`${localdomain}/api/pluginDocsGroups?size=20&page=0`, "#content_box");
        });

        // Quản lý tài liệu Plugin
        $("#pluginDocsLink").click(function () {
            customGetPage(`${localdomain}/api/pluginDocs?size=20&page=0`, "#content_box");
        });

        // Quản lý vòng đời nhật ký
        $("#LogLifecycleLink").click(function () {
            customGetPage(`${localdomain}/api/logLifecycles?size=20&page=0`, "#content_box");
        });

        // API Retry Policy Management
        $("#apiRetryPolicyLink").click(function () {
            customGetPage(`${localdomain}/api/retryPolicies?size=20&page=0`, "#content_box");
        });

        // Quản lý lưu lượng đa vùng
        $("#multiRegionTrafficLink").click(function () {
            customGetPage(`${localdomain}/api/multiRegionTraffic?size=20&page=0`, "#content_box");
        });

        // Quản lý tài liệu API trên môi trường DEV
        $("#devApiDocsLink").click(function () {
            customGetPage(`${localdomain}/api/devApiDocs?size=20&page=0`, "#content_box");
        });

        // Quản lý dịch vụ API
        $("#apiServiceLink").click(function () {
            customGetPage(`${localdomain}/api/apiServices?size=20&page=0`, "#content_box");
        });

        // Quản lý Endpoint
        $("#endpointManagementLink").click(function () {
            customGetPage(`${localdomain}/api/endpoints?size=20&page=0`, "#content_box");
        });

        // Quản lý bảo mật dịch vụ API
        $("#apiServiceSecurityLink").click(function () {
            customGetPage(`${localdomain}/api/serviceSecurity?size=20&page=0`, "#content_box");
        });

        // Quản lý danh mục lỗi dịch vụ API
        $("#apiErrorCategoryLink").click(function () {
            customGetPage(`${localdomain}/api/serviceErrorCategories?size=20&page=0`, "#content_box");
        });

        // Quản lý lỗi dịch vụ API
        $("#apiServiceErrorLink").click(function () {
            customGetPage(`${localdomain}/api/serviceErrors?size=20&page=0`, "#content_box");
        });

        // Quản lý sự cố dịch vụ API
        $("#apiIncidentLink").click(function () {
            customGetPage(`${localdomain}/api/serviceIncidents?size=20&page=0`, "#content_box");
        });

        // Quản lý quyền truy cập API theo role
        $("#roleBasedAccessLink").click(function () {
            customGetPage(`${localdomain}/api/roleAccess?size=20&page=0`, "#content_box");
        });

        // Quản lý danh sách Request
        $("#apiRequestListLink").click(function () {
            customGetPage(`${localdomain}/api/requests?size=20&page=0`, "#content_box");
        });

        // Quản lý lượng Request từ mỗi client
        $("#clientRequestVolumeLink").click(function () {
            customGetPage(`${localdomain}/api/clientRequests?size=20&page=0`, "#content_box");
        });

        // Quản lý bộ nhớ đệm
        $("#cacheMemoryLink").click(function () {
            customGetPage(`${localdomain}/api/cacheMemory?size=20&page=0`, "#content_box");
        });

        // Quản lý danh sách Captcha nhiều lần thất bại
        $("#captchaFailureListLink").click(function () {
            customGetPage(`${localdomain}/api/captchaFailures?size=20&page=0`, "#content_box");
        });

        // Quản lý danh sách Blacklist
        $("#blacklistLink").click(function () {
            customGetPage(`${localdomain}/api/blacklist?size=20&page=0`, "#content_box");
        });

        // Quản lý danh sách API nội bộ
        $("#internalApiListLink").click(function () {
            customGetPage(`${localdomain}/api/internalApis?size=20&page=0`, "#content_box");
        });

        // Quản lý hạn mức API
        $("#apiQuotaLink").click(function () {
            customGetPage(`${localdomain}/api/apiQuotas?size=20&page=0`, "#content_box");
        });

        // Quản lý danh sách gói API
        $("#apiPackageLink").click(function () {
            customGetPage(`${localdomain}/api/apiPackages?size=20&page=0`, "#content_box");
        });

        // Quản lý khóa API
        $("#apiKeyRotationLink").click(function () {
            customGetPage(`${localdomain}/api/apiKeyRotation?size=20&page=0`, "#content_box");
        });

        // Quản lý danh sách API công khai
        $("#apiPublicListLink").click(function () {
            customGetPage(`${localdomain}/api/publicApis?size=20&page=0`, "#content_box");
        });

        // Quản lý danh sách Whitelist
        $("#whitelistLink").click(function () {
            customGetPage(`${localdomain}/api/whitelist?size=20&page=0`, "#content_box");
        });

        // Quản lý danh sách cảnh báo
        $("#alertListLink").click(function () {
            customGetPage(`${localdomain}/api/alerts?size=20&page=0`, "#content_box");
        });
    } // end if role === ADMIN

    //Partner Router
    $("#partnerLink").click(function () {
        customGetPage(`${localdomain}/partners/listPartner?size=${100}&page=${0}`, "#content_box");
    });
    $("#partnerChildLinkDevTest").click(function () {
        customGetPage(`${localdomain}/partners/listPartnerDevTest?idStatus=1&size=${100}&page=${0}` , "#content_box");
    });
    $("#partnerChildLinkDuyet").click(function () {
        customGetPage(`${localdomain}/partners/listPartnerDevTest?idStatus=2&size=${100}&page=${0}`, "#content_box");
    });
    $("#partnerChildLinkGolive").click(function () {
        customGetPage(`${localdomain}/partners/listPartnerDevTest?idStatus=3&size=${100}&page=${0}`, "#content_box");
    });

    //Report Router
    if (role === "ADMIN") {
        $(".report").click(function () {
            customGetPage(`${localdomain}/reports/listReport?id=&startDate=${getFirstDayOfMonth()}&endDate=${getLastDayOfMonth()}`, "#content_box");
        });
        $("#reportCategoryService").click(function () {
            customGetPage(`${localdomain}/reports/getAllService?id=&startDate=${getFirstDayOfMonth()}&endDate=${getLastDayOfMonth()}`, "#content_box")
        });
        $("#reportService").click(function () {
            customGetPage(`${localdomain}/reports/getAllServiceItem?id=&startDate=${getFirstDayOfMonth()}&endDate=${getLastDayOfMonth()}`, "#content_box")
        });
        $("#groupPartnerLink").click(function () {
            customGetPage(`${localdomain}/group-partners/listGroup`, "#content_box")
        })
        $(".data-group").click(function (){
            let idGroup = $(this).attr("data-value");
            customGetPage(`${localdomain}/partners/listGroupPartner?idGroup=${idGroup}&size=${100}&page=${0}`, "#content_box")
        });
        $("#reportLinkGroupPartner").click(function () {
            customGetPage(`${localdomain}/reports/reportAllGroupPartner?id=&startDate=${getFirstDayOfMonth()}&endDate=${getLastDayOfMonth()}`, "#content_box");
        });
        
    } else if (role === "PARTNER") {
        $(".report").click(function () {
            let partnerId = $(this).attr("data-value");
            customGetPage(`${localdomain}/reports/listReport?id=${partnerId}&startDate=${getFirstDayOfMonth()}&endDate=${getLastDayOfMonth()}`, "#content_box");
        });
        $("#reportCategoryService").click(function () {
            let partnerId = $(this).attr("data-value");
            customGetPage(`${localdomain}/reports/getAllService?id=${partnerId}&startDate=${getFirstDayOfMonth()}&endDate=${getLastDayOfMonth()}`, "#content_box")
        });
        $("#reportService").click(function () {
            let partnerId = $(this).attr("data-value");
            customGetPage(`${localdomain}/reports/getAllServiceItem?id=${partnerId}&startDate=${getFirstDayOfMonth()}&endDate=${getLastDayOfMonth()}`, "#content_box")
        });
        $("#serviceLink111").click(function () {
            customGetPage(`${localdomain}/services/loadServiceForPartner?id=${userId}&startDate=${getFirstDayOfMonth()}&endDate=${getLastDayOfMonth()}`, "#content_box");
        });
    }
    
    //Service Router
    $("#serviceLink").click(function () {
        customGetPage(`${localdomain}/services/listCategoryService?size=${20}&page=${0}`, "#content_box");
    });
    
    $(".listService").click(function (e) {
        e.stopPropagation();
        customGetPage(`${localdomain}/services/listService?size=${20}&page=${0}`, "#content_box");
    });
    
    
    //Transaction Router
    $(".transaction").click(function () {
        if (role === "ADMIN") {
            customGetPage(`${localdomain}/transactions/listTransaction?startDate=${getFirstDayOfMonth()}&endDate=${getLastDayOfMonth()}&page=0&size=10&partnerCode=&status=&id=`, "#content_box")
        } else if (role === "PARTNER") {
            customGetPage(`${localdomain}/transactions/listTransaction?startDate=${getFirstDayOfMonth()}&endDate=${getLastDayOfMonth()}&page=0&size=10&partnerCode=&status=&id=${userId}`, "#content_box");
        }
    });
    
    //System Router
    $(".status").click(function () {
        customGetPage(`${localdomain}/status/status`, "#content_box");
    });
    
    getCountDevTest(1, "partnerChildLinkDevTestCount");
    getCountDevTest(2, "partnerChildLinkDuyetCount");
    getCountDevTest(3, "partnerChildLinkGoliveCount");
    
    
    $(document).ready(function () {
        let dataGroup = document.querySelectorAll(".data-group");
        dataGroup.forEach(el => {
            let id = el.getAttribute("data-value");
            getCountGroupPartner(id, "group-" + id);
        })
    });

    $(".metismenu > li > a.click").click(function(e) {
        // Lấy phần tử cha li
        var parentLi = $(this).parent('li');

        // Nếu không phải menu đang mở
        if (!parentLi.hasClass('active')) {
            // Đóng tất cả menu khác
            $(".metismenu > li").not(parentLi).removeClass('active');
            $(".metismenu > li > ul.ul-children").not(parentLi.find('> ul')).slideUp();
            $(".metismenu > li > ul.ul-children-group").not(parentLi.find('> ul')).slideUp();
        }
    });

})