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
    // Sự kiện dropdown của quản lý khách hàng
    $("#viewCustomer").click(function () {
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
            customGetPage(`${localdomain}/system/staffGroupManagement?size=${20}&page=${0}`, "#content_box");
        });

        // Quản lý Vai trò
        $("#roleManagementLink").click(function () {
            customGetPage(`${localdomain}/system/roleManagement?size=${20}&page=${0}`, "#content_box");
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
            customGetPage(`${localdomain}/system/systemParameter?size=${20}&page=${0}`, "#content_box");
        });

        // Quản lý nhóm chức năng phần mềm
        $("#softwareFunctionGroupLink").click(function () {
            customGetPage(`${localdomain}/system/softwareFunctionGroups?size=${20}&page=${0}`, "#content_box");
        });

        // Quản lý nhóm chức năng phần mềm
        $("#softwareFunctionLink").click(function () {
            customGetPage(`${localdomain}/system/softwareFunction?size=${20}&page=${0}`, "#content_box");
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

        // Các trang mới trong menu Quản lý báo cáo
        // Biểu đồ trạng thái dịch vụ môi trường kiểm thử
        $("#testEnvServiceStatusChart").click(function () {
            customGetPage(`${localdomain}/reports/charts/testEnvServiceStatusChart?size=20&page=0`, "#content_box");
        });

        // Biểu đồ trạng thái dịch vụ môi trường vận hành
        $("#prodEnvServiceStatusChart").click(function () {
            customGetPage(`${localdomain}/reports/charts/prodEnvServiceStatusChart?size=20&page=0`, "#content_box");
        });

        // Biểu đồ các đơn vị chia sẻ nhiều dịch vụ nhất
        $("#topSharingOrganizationsChart").click(function () {
            customGetPage(`${localdomain}/reports/charts/topSharingOrganizationsChart?size=20&page=0`, "#content_box");
        });

        // Biểu đồ các dịch vụ tích hợp nhiều nhất
        $("#topIntegratedServicesChart").click(function () {
            customGetPage(`${localdomain}/reports/charts/topIntegratedServicesChart?size=20&page=0`, "#content_box");
        });

        // Biểu đồ tỷ lệ phê duyệt dịch vụ tích hợp
        $("#integrationApprovalRateChart").click(function () {
            customGetPage(`${localdomain}/reports/charts/integrationApprovalRateChart?size=20&page=0`, "#content_box");
        });

        // Biểu đồ diễn biến yêu cầu tích hợp
        $("#integrationRequestTrendChart").click(function () {
            customGetPage(`${localdomain}/reports/charts/integrationRequestTrendChart?size=20&page=0`, "#content_box");
        });

        // Biểu đồ top đơn vị sử dụng nhiều nhất theo thời gian
        $("#topUsingOrganizationsChart").click(function () {
            customGetPage(`${localdomain}/reports/charts/topUsingOrganizationsChart?size=20&page=0`, "#content_box");
        });

        // Biểu đồ số lượng sử dụng dịch vụ theo thời gian
        $("#serviceUsageOverTimeChart").click(function () {
            customGetPage(`${localdomain}/reports/charts/serviceUsageOverTimeChart?size=20&page=0`, "#content_box");
        });

        // Biểu đồ top dịch vụ có yêu cầu sử dụng nhiều nhất
        $("#topRequestedServicesChart").click(function () {
            customGetPage(`${localdomain}/reports/charts/topRequestedServicesChart?size=20&page=0`, "#content_box");
        });

        // Biểu đồ tỷ lệ sử dụng dịch vụ giữa các đơn vị
        $("#usageRatioBetweenOrganizationsChart").click(function () {
            customGetPage(`${localdomain}/reports/charts/usageRatioBetweenOrganizationsChart?size=20&page=0`, "#content_box");
        });

        // Biểu đồ tỷ lệ yêu cầu dịch vụ theo trạng thái
        $("#requestRatioByStatusChart").click(function () {
            customGetPage(`${localdomain}/reports/charts/requestRatioByStatusChart?size=20&page=0`, "#content_box");
        });

        // Biểu đồ trạng thái yêu cầu dịch vụ
        $("#criticalServiceStatusChart").click(function () {
            customGetPage(`${localdomain}/reports/charts/criticalServiceStatusChart?size=20&page=0`, "#content_box");
        });

        // Biểu đồ tổng hợp số lượng yêu cầu dịch vụ
        $("#totalServiceRequestsChart").click(function () {
            customGetPage(`${localdomain}/reports/charts/totalServiceRequestsChart?size=20&page=0`, "#content_box");
        });

        // Biểu đồ top 10 người dùng tích hợp nhiều nhất
        $("#top10IntegratedUsersChart").click(function () {
            customGetPage(`${localdomain}/reports/charts/top10IntegratedUsersChart?size=20&page=0`, "#content_box");
        });

        // Các trang báo cáo mới
        // Báo cáo hiệu suất hệ thống theo thời gian
        $("#reportSystemTime").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportSystemTime?size=20&page=0`, "#content_box");
        });

        // Báo cáo hiệu suất hệ thống hoạt động theo đơn vị
        $("#reportSystemUnit").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportSystemUnit?size=20&page=0`, "#content_box");
        });

        // Báo cáo hiệu suất hệ thống hoạt động theo Khu vực
        $("#reportSystemRegion").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportSystemRegion?size=20&page=0`, "#content_box");
        });

        // Báo cáo Cập nhật và Bảo trì
        $("#reportUpdateMaintenance").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportUpdateMaintenance?size=20&page=0`, "#content_box");
        });

        // Báo cáo khách hàng theo các tiêu chí như độ tuổi, giới tính
        $("#reportCustomerDemographics").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportCustomerDemographics?size=20&page=0`, "#content_box");
        });

        // Báo cáo tổng số lượt Tương tác Khách hàng theo nhân viên
        $("#reportInteractionByStaff").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportInteractionByStaff?size=20&page=0`, "#content_box");
        });

        // Báo cáo thông tin khách hàng
        $("#reportCustomerInfo").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportCustomerInfo?size=20&page=0`, "#content_box");
        });

        // Báo cáo phân khúc khách hàng
        $("#reportCustomerSegment").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportCustomerSegment?size=20&page=0`, "#content_box");
        });

        // Báo cáo dự báo doanh thu
        $("#reportRevenueForecast").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportRevenueForecast?size=20&page=0`, "#content_box");
        });

        // Báo cáo dự báo xu hướng thị trường
        $("#reportMarketTrends").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportMarketTrends?size=20&page=0`, "#content_box");
        });

        // Báo cáo dự báo tăng trưởng khách hàng
        $("#reportCustomerGrowth").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportCustomerGrowth?size=20&page=0`, "#content_box");
        });

        // Báo cáo Chăm sóc Khách hàng
        $("#reportCustomerCare").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportCustomerCare?size=20&page=0`, "#content_box");
        });

        // Báo cáo số lượng khách hàng theo từng kênh liên hệ
        $("#reportCustomerChannel").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportCustomerChannel?size=20&page=0`, "#content_box");
        });

        // Báo cáo Hiệu suất Xử lý Ticket
        $("#reportTicketHandling").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportTicketHandling?size=20&page=0`, "#content_box");
        });

        // Báo cáo Phân loại Ticket
        $("#reportTicketCategory").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportTicketCategory?size=20&page=0`, "#content_box");
        });

        // Báo cáo Hiệu suất Nhân viên
        $("#reportStaffPerformance").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportStaffPerformance?size=20&page=0`, "#content_box");
        });

        // Báo cáo tổng hợp SLA
        $("#reportSlaSummary").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportSlaSummary?size=20&page=0`, "#content_box");
        });

        // Báo cáo Tình trạng Ticket
        $("#reportTicketStatus").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportTicketStatus?size=20&page=0`, "#content_box");
        });

        // Báo cáo tổng Doanh thu theo Đơn vị
        $("#reportRevenueByUnit").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportRevenueByUnit?size=20&page=0`, "#content_box");
        });

        // Báo cáo Hóa đơn
        $("#reportInvoice").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportInvoice?size=20&page=0`, "#content_box");
        });

        // Báo cáo tổng số lượng thanh toán
        $("#reportPaymentCount").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportPaymentCount?size=20&page=0`, "#content_box");
        });

        // Báo cáo Tài chính
        $("#reportFinance").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportFinance?size=20&page=0`, "#content_box");
        });

        // Báo cáo số lượng Hợp đồng theo Đơn vị
        $("#reportContractByUnit").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportContractByUnit?size=20&page=0`, "#content_box");
        });

        // Báo cáo Chiết khấu và Khuyến mãi
        $("#reportDiscountPromotion").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportDiscountPromotion?size=20&page=0`, "#content_box");
        });

        // Báo cáo tổng hợp Lưu lượng API
        $("#reportApiTraffic").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportApiTraffic?size=20&page=0`, "#content_box");
        });

        // Báo cáo số lượng yêu cầu API theo xu hướng
        $("#reportApiRequestTrends").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportApiRequestTrends?size=20&page=0`, "#content_box");
        });

        // Báo cáo tổng hợp lượng API khi vượt ngưỡng
        $("#reportApiThreshold").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportApiThreshold?size=20&page=0`, "#content_box");
        });

        // Báo cáo tổng hợp Hiệu suất API
        $("#reportApiPerformance").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportApiPerformance?size=20&page=0`, "#content_box");
        });

        // Báo cáo tổng hợp sử dụng băng thông
        $("#reportApiBandwidth").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportApiBandwidth?size=20&page=0`, "#content_box");
        });

        // Báo cáo về Plugin và Tiện ích
        $("#reportPluginUsage").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportPluginUsage?size=20&page=0`, "#content_box");
        });

        // Báo cáo số lượng yêu cầu API theo người dùng
        $("#reportApiRequestByUser").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportApiRequestByUser?size=20&page=0`, "#content_box");
        });

        // Báo cáo tổng hợp thời gian phản hồi API
        $("#reportApiResponseTime").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportApiResponseTime?size=20&page=0`, "#content_box");
        });

        // Báo cáo Tổng giá trị hóa đơn theo thời gian
        $("#reportInvoiceTotalValue").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportInvoiceTotalValue?size=20&page=0`, "#content_box");
        });

        // Báo cáo Số lượng hóa đơn hợp lệ, bị hủy, điều chỉnh
        $("#reportInvoiceStatus").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportInvoiceStatus?size=20&page=0`, "#content_box");
        });

        // Báo cáo Tổng Doanh thu từ hóa đơn theo từng thời kỳ
        $("#reportRevenueByPeriod").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportRevenueByPeriod?size=20&page=0`, "#content_box");
        });

        // Báo cáo Danh sách hóa đơn đã xuất theo thời gian
        $("#reportExportedInvoicesByTime").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportExportedInvoicesByTime?size=20&page=0`, "#content_box");
        });

        // Báo cáo Danh sách hóa đơn đã xuất theo khách hàng
        $("#reportExportedInvoicesByStatus").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportExportedInvoicesByStatus?size=20&page=0`, "#content_box");
        });

        // Báo cáo Danh sách hóa đơn đã xuất theo loại hóa đơn
        $("#reportExportedInvoicesByType").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportExportedInvoicesByType?size=20&page=0`, "#content_box");
        });

        // Báo cáo Chi tiết từng hóa đơn
        $("#reportInvoiceDetails").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportInvoiceDetails?size=20&page=0`, "#content_box");
        });

        // Báo cáo chi tiết số hóa đơn đã chỉnh sửa
        $("#reportAdjustedInvoices").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportAdjustedInvoices?size=20&page=0`, "#content_box");
        });

        // Báo cáo chi tiết số hóa đơn bị huỷ
        $("#invoiceDetailCancelled").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/invoiceDetailCancelled?size=20&page=0`, "#content_box");
        });

        // Báo cáo chi tiết doanh thu từ hóa đơn theo khách hàng
        $("#invoiceRevenueByCustomer").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/invoiceRevenueByCustomer?size=20&page=0`, "#content_box");
        });

        // Báo cáo chi tiết doanh thu từ hóa đơn theo nhóm khách hàng
        $("#invoiceRevenueByCustomerGroup").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/invoiceRevenueByCustomerGroup?size=20&page=0`, "#content_box");
        });

        // Báo cáo chi tiết doanh thu từ hóa đơn theo dịch vụ
        $("#invoiceRevenueByService").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/invoiceRevenueByService?size=20&page=0`, "#content_box");
        });

        // Báo cáo chi tiết doanh thu từ hóa đơn theo nhóm dịch vụ
        $("#invoiceRevenueByServiceGroup").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/invoiceRevenueByServiceGroup?size=20&page=0`, "#content_box");
        });

        // Báo cáo Tổng số hóa đơn VAT đầu ra theo thời gian
        $("#vatInvoiceByTime").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/vatInvoiceByTime?size=20&page=0`, "#content_box");
        });

        // Báo cáo Tổng số hóa đơn VAT đầu ra theo loại hóa đơn
        $("#vatInvoiceByType").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/vatInvoiceByType?size=20&page=0`, "#content_box");
        });

        // Báo cáo trạng thái hóa đơn đã phát hành
        $("#invoiceStatusIssued").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/invoiceStatusIssued?size=20&page=0`, "#content_box");
        });

        // Báo cáo trạng thái hóa đơn đã thanh toán
        $("#invoiceStatusPaid").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/invoiceStatusPaid?size=20&page=0`, "#content_box");
        });

        // Báo cáo trạng thái hóa đơn chưa thanh toán
        $("#invoiceStatusUnpaid").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/invoiceStatusUnpaid?size=20&page=0`, "#content_box");
        });

        // Báo cáo Tổng hợp Số lượng hợp đồng theo trạng thái
        $("#contractCountByStatus").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/contractCountByStatus?size=20&page=0`, "#content_box");
        });

        // Báo cáo Tổng hợp Số lượng hợp đồng theo thời gian
        $("#contractCountByTime").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/contractCountByTime?size=20&page=0`, "#content_box");
        });

        // Báo cáo Tổng hợp Số lượng hợp đồng theo loại dịch vụ
        $("#contractCountByService").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/contractCountByService?size=20&page=0`, "#content_box");
        });

        // Báo cáo chi tiết danh sách hợp đồng kèm thông tin chi tiết
        $("#contractDetailList").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/contractDetailList?size=20&page=0`, "#content_box");
        });

        // Báo cáo Chi tiết hợp đồng theo nhật ký thay đổi
        $("#contractChangeLog").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/contractChangeLog?size=20&page=0`, "#content_box");
        });

        // Báo cáo Chi tiết tiến độ hợp đồng so với kế hoạch
        $("#contractProgressVsPlan").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/contractProgressVsPlan?size=20&page=0`, "#content_box");
        });

        // Báo cáo Chi tiết hợp đồng theo tiến độ thanh toán
        $("#contractPaymentProgress").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/contractPaymentProgress?size=20&page=0`, "#content_box");
        });

        // Báo cáo Danh sách hợp đồng sắp hết hạn
        $("#contractExpiringSoon").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/contractExpiringSoon?size=20&page=0`, "#content_box");
        });

        // Báo cáo Danh sách hợp đồng cần gia hạn
        $("#contractNeedsRenewal").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/contractNeedsRenewal?size=20&page=0`, "#content_box");
        });

        // Báo cáo Tổng giá trị hợp đồng đã thực hiện
        $("#contractValueRealized").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/contractValueRealized?size=20&page=0`, "#content_box");
        });

        // Báo cáo Tổng công nợ chưa thanh toán
        $("#reportDebtTotal").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportDebtTotal?size=20&page=0`, "#content_box");
        });

        // Báo cáo Hiệu suất thực hiện hợp đồng của từng đối tác
        $("#reportPartnerPerformance").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportPartnerPerformance?size=20&page=0`, "#content_box");
        });

        // Báo cáo Chất lượng dịch vụ theo hợp đồng
        $("#reportRevenueByTime").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportRevenueByTime?size=20&page=0`, "#content_box");
        });

        // Báo cáo tổng doanh thu theo thời gian
        $("#reportRevenueByService").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportRevenueByService?size=20&page=0`, "#content_box");
        });

        // Báo cáo tổng doanh thu theo loại dịch vụ
        $("#reportRevenueByChannel").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportRevenueByChannel?size=20&page=0`, "#content_box");
        });

        // Báo cáo tổng doanh thu theo kênh thanh toán
        $("#reportRevenueByCustomerGroup").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportRevenueByCustomerGroup?size=20&page=0`, "#content_box");
        });

        // Báo cáo tổng doanh thu theo nhóm khách hàng
        $("#reportDebtFromGroup").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportDebtFromGroup?size=20&page=0`, "#content_box");
        });

        // Báo cáo Tổng công nợ phải thu từ nhóm khách hàng
        $("#reportDebtFromCustomer").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportDebtFromCustomer?size=20&page=0`, "#content_box");
        });

        // Báo cáo Tổng công nợ phải thu từ khách hàng
        $("#reportOverdueDebt").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportOverdueDebt?size=20&page=0`, "#content_box");
        });

        // Báo cáo Công nợ quá hạn & tình trạng thu hồi nợ
        $("#reportPaymentHistory").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportPaymentHistory?size=20&page=0`, "#content_box");
        });

        // Báo cáo Lịch sử thanh toán theo khách hàng
        $("#reportTotalCollectedRemaining").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportTotalCollectedRemaining?size=20&page=0`, "#content_box");
        });

        // Báo cáo Tổng số tiền đã thu và còn phải thu
        $("#reportTransactionList").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportTransactionList?size=20&page=0`, "#content_box");
        });

        // Báo cáo Danh sách các giao dịch theo thời gian thực
        $("#reportPaymentMethod").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportPaymentMethod?size=20&page=0`, "#content_box");
        });

        // Báo cáo Giao dịch theo phương thức thanh toán
        $("#reportTopDebtCustomers").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportTopDebtCustomers?size=20&page=0`, "#content_box");
        });

        // Báo cáo Khách hàng có công nợ lớn nhất
        $("#reportAPIUsage").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportAPIUsage?size=20&page=0`, "#content_box");
        });

        // Báo cáo Lưu lượng truy cập theo API endpoint
        $("#reportApiTrafficEndpoint").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportApiTrafficEndpoint?size=20&page=0`, "#content_box");
        });

        // Báo cáo Tình trạng uptime/downtime của API
        $("#reportApiErrorRate").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportApiErrorRate?size=20&page=0`, "#content_box");
        });

        // Báo cáo Nhật ký yêu cầu API
        $("#reportApiUptime").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportApiUptime?size=20&page=0`, "#content_box");
        });

        // Báo cáo Danh sách địa chỉ IP có hành vi bất thường
        $("#reportApiRequestLog").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportApiRequestLog?size=20&page=0`, "#content_box");
        });

        // Báo cáo Tổng số yêu cầu API theo từng endpoint
        $("#reportApiRejectedRate").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportApiRejectedRate?size=20&page=0`, "#content_box");
        });

        // Báo cáo Lượt gọi API theo user
        $("#reportAuthErrors").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportAuthErrors?size=20&page=0`, "#content_box");
        });

        // Báo cáo Lượt gọi API theo client
        $("#reportSuspiciousIPs").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportSuspiciousIPs?size=20&page=0`, "#content_box");
        });

        // Báo cáo danh sách API phổ biến nhất
        $("#reportTotalRequestsByEndpoint").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportTotalRequestsByEndpoint?size=20&page=0`, "#content_box");
        });

        // Báo cáo Sử dụng API theo khu vực
        $("#reportApiCallsByUser").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportApiCallsByUser?size=20&page=0`, "#content_box");
        });

        // Báo cáo Tổng số lỗi theo mã lỗi HTTP
        $("#reportApiCallsByClient").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportApiCallsByClient?size=20&page=0`, "#content_box");
        });

        // Báo cáo Thống kê lỗi theo endpoint
        $("#reportPopularApis").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportPopularApis?size=20&page=0`, "#content_box");
        });

        // Báo cáo Tỷ lệ lỗi theo nhà phát triển
        $("#reportApiUsageByRegion").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportApiUsageByRegion?size=20&page=0`, "#content_box");
        });

        // Báo cáo Tổng số yêu cầu API theo thời gian
        $("#reportHttpErrorCodes").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportHttpErrorCodes?size=20&page=0`, "#content_box");
        });

        // Báo cáo Dung lượng băng thông sử dụng
        $("#reportEndpointErrors").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportEndpointErrors?size=20&page=0`, "#content_box");
        });

        // Báo cáo Số lượng ticket theo thời gian
        $("#reportErrorRateByDev").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportErrorRateByDev?size=20&page=0`, "#content_box");
        });

        // Báo cáo Mức độ ưu tiên của ticket
        $("#reportTotalApiRequestsByTime").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/reportTotalApiRequestsByTime?size=20&page=0`, "#content_box");
        });

        // Báo cáo Thời gian trung bình để phản hồi ticket
        $("#avgReplyTimeTicket").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/avgReplyTimeTicket?size=20&page=0`, "#content_box");
        });

        // Báo cáo Thời gian trung bình để giải quyết ticket
        $("#avgResolveTimeTicket").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/avgResolveTimeTicket?size=20&page=0`, "#content_box");
        });

        // Báo cáo Tỷ lệ giải quyết thành công ticket ngay từ lần xử lý đầu tiên
        $("#firstAttemptResolutionRate").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/firstAttemptResolutionRate?size=20&page=0`, "#content_box");
        });

        // Báo cáo Hiệu suất xử lý của nhân viên
        $("#staffEfficiency").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/staffEfficiency?size=20&page=0`, "#content_box");
        });

        // Báo cáo Hiệu suất xử lý của nhóm nhân viên
        $("#teamEfficiency").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/teamEfficiency?size=20&page=0`, "#content_box");
        });

        // Báo cáo Số lượng ticket quá hạn so với SLA
        $("#slaOverdueTickets").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/slaOverdueTickets?size=20&page=0`, "#content_box");
        });

        // Báo cáo Tỷ lệ ticket được giải quyết đúng hạn
        $("#onTimeResolvedRate").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/onTimeResolvedRate?size=20&page=0`, "#content_box");
        });

        // Báo cáo Thời gian trung bình để xử lý ticket theo SLA
        $("#avgSlaProcessTime").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/avgSlaProcessTime?size=20&page=0`, "#content_box");
        });

        // Báo cáo Số lượng ticket theo danh mục yêu cầu
        $("#ticketCategoryReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/ticketCategoryReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo Xu hướng phát sinh ticket theo danh mục
        $("#ticketTrendReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/ticketTrendReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo Mức độ hài lòng của khách hàng
        $("#customerSatisfactionReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/customerSatisfactionReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo Số lượng phản hồi tiêu cực
        $("#negativeFeedbackReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/negativeFeedbackReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo Số lượng phản hồi tích cực
        $("#positiveFeedbackReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/positiveFeedbackReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo Thời gian trung bình để giải quyết ticket có phản hồi tiêu cực
        $("#negativeFeedbackResolutionTimeReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/negativeFeedbackResolutionTimeReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo Tỷ lệ sự cố lặp lại theo thời gian
        $("#recurringIssueRateReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/recurringIssueRateReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo Số lượng ticket xử lý bởi từng nhân viên
        $("#ticketsByEmployeeReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/ticketsByEmployeeReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo Hiệu suất làm việc của đội hỗ trợ
        $("#supportTeamPerformanceReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/supportTeamPerformanceReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo Phân loại khách hàng theo khu vực
        $("#customerRegionReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/customerRegionReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo Phân loại khách hàng theo ngành nghề
        $("#customerIndustryReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/customerIndustryReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo Hiệu suất chăm sóc khách hàng theo nhân viên
        $("#employeePerformanceReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/employeePerformanceReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo Tỷ lệ phản hồi và mức độ hài lòng của khách hàng
        $("#feedbackSatisfactionReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/feedbackSatisfactionReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo tổng doanh số theo khách hàng
        $("#customerRevenueReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/customerRevenueReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo tổng doanh số theo khu vực
        $("#regionRevenueReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/regionRevenueReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo tổng doanh số theo nhóm khách hàng
        $("#customerGroupRevenueReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/customerGroupRevenueReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo tổng số Số lượng yêu cầu hỗ trợ theo thời gian
        $("#supportRequestsOverTimeReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/supportRequestsOverTimeReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo Thời gian xử lý trung bình của đội ngũ hỗ trợ
        $("#averageResolutionTimeReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/averageResolutionTimeReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo tổng số máy chủ đang chạy
        $("#activeServersReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/activeServersReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo tổng số dịch vụ đang chạy
        $("#runningServicesReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/runningServicesReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo số lượng downtime theo thời gian
        $("#downtimeReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/downtimeReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo Trạng thái hiện tại của hệ thống
        $("#systemStatusReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/systemStatusReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo hiệu suất của máy chủ
        $("#serverPerformanceReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/serverPerformanceReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo Danh sách lỗi ghi nhận trong log hệ thống
        $("#systemLogErrorsReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/systemLogErrorsReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo Tần suất lỗi theo thời gian
        $("#errorFrequencyReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/errorFrequencyReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo Danh sách đăng nhập thất bại
        $("#failedLoginAttemptsReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/failedLoginAttemptsReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo danh sách người dùng
        $("#userListReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/userListReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo Danh sách tài khoản bị khóa hoặc chưa kích hoạt
        $("#inactiveAccountsReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/inactiveAccountsReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo tình trạng cơ sở dữ liệu
        $("#databaseStatusReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/databaseStatusReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo sao lưu và phục hồi dữ liệu
        $("#backupRecoveryReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/backupRecoveryReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo nhật ký thay đổi dữ liệu
        $("#dataChangeLogReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/dataChangeLogReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo sử dụng tài nguyên
        $("#resourceUsageReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/resourceUsageReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo Thời gian phản hồi trung bình của API
        $("#apiResponseTimeReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/apiResponseTimeReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo tình trạng phần cứng
        $("#hardwareStatusReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/hardwareStatusReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo Hiệu suất tổng hợp của toàn hệ thống
        $("#systemPerformanceReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/systemPerformanceReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo Điểm số hiệu suất so sánh theo từng giai đoạn
        $("#performanceBenchmarkReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/performanceBenchmarkReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo hợp đồng theo trạng thái đã ký kết
        $("#signedContractsReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/signedContractsReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo hợp đồng theo trạng thái chờ phê duyệt
        $("#pendingApprovalContractsReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/pendingApprovalContractsReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo hợp đồng theo trạng thái bị hủy, hết hiệu lực
        $("#salesContractsReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/salesContractsReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo hợp đồng theo loại Hợp đồng mua bán
        $("#serviceContractsReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/serviceContractsReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo hợp đồng theo loại Hợp đồng dịch vụ
        $("#leaseContractsReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/leaseContractsReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo hợp đồng theo loại Hợp đồng thuê tài sản
        $("#contractsByPartnerReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/contractsByPartnerReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo Tổng số hợp đồng theo từng đối tác
        $("#contractValueByPartnerReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/contractValueByPartnerReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo Giá trị hợp đồng theo từng đối tác
        $("#actualRevenueReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/actualRevenueReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo Doanh thu thực tế từ hợp đồng đã ký
        $("#revenueByContractTypeReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/revenueByContractTypeReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo Doanh thu theo từng loại hợp đồng
        $("#expiringContractsReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/expiringContractsReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo hợp đồng sắp hết hạn theo từng giai đoạn
        $("#expiringContractsByPhaseReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/expiringContractsByPhaseReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo hợp đồng cần gia hạn
        $("#contractRenewalRequiredReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/contractRenewalRequiredReportLink?size=20&page=0`, "#content_box");
        });

        // Báo cáo hợp đồng gia hạn thất bại
        $("#failedContractRenewalsReportLink").click(function () {
            customGetPage(`${localdomain}/reports/list_reports/failedContractRenewalsReportLink?size=20&page=0`, "#content_box");
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