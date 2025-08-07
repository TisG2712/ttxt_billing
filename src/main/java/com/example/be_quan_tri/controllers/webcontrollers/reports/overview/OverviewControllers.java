package com.example.be_quan_tri.controllers.webcontrollers.reports.overview;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "reports/overview/")
public class OverviewControllers {
    @GetMapping("systemPerformanceDashboard")
    public String systemPerformanceDashboard(@RequestParam(defaultValue = "" , value = "size") String size,
                                            @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/overview/systemPerformanceDashboard";
    }

    @GetMapping("serviceStatusDashboard")
    public String serviceStatusDashboard(@RequestParam(defaultValue = "" , value = "size") String size,
                                         @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/overview/serviceStatusDashboard";
    }

    @GetMapping("logErrorManagementDashboard")
    public String logErrorManagementDashboard(@RequestParam(defaultValue = "" , value = "size") String size,
                                              @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/logErrorManagementDashboard";
    }

    @GetMapping("securityDashboard")
    public String securityDashboard(@RequestParam(defaultValue = "" , value = "size") String size,
                                    @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/securityDashboard";
    }

    @GetMapping("databasePerformanceDashboard")
    public String databasePerformanceDashboard(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/databasePerformanceDashboard";
    }

    @GetMapping("userInteractionDashboard")
    public String userInteractionDashboard(@RequestParam(defaultValue = "" , value = "size") String size,
                                           @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/userInteractionDashboard";
    }

    @GetMapping("serverResourcesDashboard")
    public String serverResourcesDashboard(@RequestParam(defaultValue = "" , value = "size") String size,
                                           @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/serverResourcesDashboard";
    }

    @GetMapping("devopsCiCdDashboard")
    public String devopsCiCdDashboard(@RequestParam(defaultValue = "" , value = "size") String size,
                                      @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/devopsCiCdDashboard";
    }

    @GetMapping("customerOverviewDashboard")
    public String customerOverviewDashboard(@RequestParam(defaultValue = "" , value = "size") String size,
                                            @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/customerOverviewDashboard";
    }

    @GetMapping("customerRetentionDashboard")
    public String customerRetentionDashboard(@RequestParam(defaultValue = "" , value = "size") String size,
                                             @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/customerRetentionDashboard";
    }

    @GetMapping("customerSupportDashboard")
    public String customerSupportDashboard(@RequestParam(defaultValue = "" , value = "size") String size,
                                           @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/customerSupportDashboard";
    }

    @GetMapping("customerSegmentationDashboard")
    public String customerSegmentationDashboard(@RequestParam(defaultValue = "" , value = "size") String size,
                                                @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/customerSegmentationDashboard";
    }

    @GetMapping("customerCareDashboard")
    public String customerCareDashboard(@RequestParam(defaultValue = "" , value = "size") String size,
                                        @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/customerCareDashboard";
    }

    @GetMapping("complaintManagementDashboard")
    public String complaintManagementDashboard(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/complaintManagementDashboard";
    }

    @GetMapping("customerFeedbackDashboard")
    public String customerFeedbackDashboard(@RequestParam(defaultValue = "" , value = "size") String size,
                                            @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/customerFeedbackDashboard";
    }

    @GetMapping("currentTicketCountDashboard")
    public String currentTicketCountDashboard(@RequestParam(defaultValue = "" , value = "size") String size,
                                              @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/currentTicketCountDashboard";
    }

    @GetMapping("ticketStatusDashboard")
    public String ticketStatusDashboard(@RequestParam(defaultValue = "" , value = "size") String size,
                                        @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/ticketStatusDashboard";
    }

    @GetMapping("ticketPriorityDashboard")
    public String ticketPriorityDashboard(@RequestParam(defaultValue = "" , value = "size") String size,
                                          @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/ticketPriorityDashboard";
    }

    @GetMapping("averageResolutionTimeDashboard")
    public String averageResolutionTimeDashboard(@RequestParam(defaultValue = "" , value = "size") String size,
                                                 @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/averageResolutionTimeDashboard";
    }

    @GetMapping("onTimeResolutionRateDashboard")
    public String onTimeResolutionRateDashboard(@RequestParam(defaultValue = "" , value = "size") String size,
                                                @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/onTimeResolutionRateDashboard";
    }

    @GetMapping("ticketPerSupportStaffDashboard")
    public String ticketPerSupportStaffDashboard(@RequestParam(defaultValue = "" , value = "size") String size,
                                                 @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/ticketPerSupportStaffDashboard";
    }

    @GetMapping("averageResponseTimeDashboard")
    public String averageResponseTimeDashboard(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/averageResponseTimeDashboard";
    }

    @GetMapping("averageHandlingTimeDashboard")
    public String averageHandlingTimeDashboard(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/averageHandlingTimeDashboard";
    }

    @GetMapping("customerSatisfactionRateDashboard")
    public String customerSatisfactionRateDashboard(@RequestParam(defaultValue = "" , value = "size") String size,
                                                    @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/customerSatisfactionRateDashboard";
    }

    @GetMapping("customerFeedbackQualityDashboard")
    public String customerFeedbackQualityDashboard(@RequestParam(defaultValue = "" , value = "size") String size,
                                                   @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/customerFeedbackQualityDashboard";
    }

    @GetMapping("activeContractCountDashboard")
    public String activeContractCountDashboard(@RequestParam(defaultValue = "", value = "size") String size,
                                               @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/activeContractCountDashboard";
    }

    @GetMapping("contractPerformanceDashboard")
    public String contractPerformanceDashboard(@RequestParam(defaultValue = "", value = "size") String size,
                                               @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/contractPerformanceDashboard";
    }

    @GetMapping("highRiskContractDashboard")
    public String highRiskContractDashboard(@RequestParam(defaultValue = "", value = "size") String size,
                                            @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/highRiskContractDashboard";
    }

    @GetMapping("delayedContractStatusDashboard")
    public String delayedContractStatusDashboard(@RequestParam(defaultValue = "", value = "size") String size,
                                                 @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/delayedContractStatusDashboard";
    }

    @GetMapping("contractTypeCountDashboard")
    public String contractTypeCountDashboard(@RequestParam(defaultValue = "", value = "size") String size,
                                             @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/contractTypeCountDashboard";
    }

    @GetMapping("slaComplianceRateDashboard")
    public String slaComplianceRateDashboard(@RequestParam(defaultValue = "", value = "size") String size,
                                             @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/slaComplianceRateDashboard";
    }

    @GetMapping("slaViolationTicketDashboard")
    public String slaViolationTicketDashboard(@RequestParam(defaultValue = "", value = "size") String size,
                                              @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/slaViolationTicketDashboard";
    }

    @GetMapping("slaViolationCauseAnalysisDashboard")
    public String slaViolationCauseAnalysisDashboard(@RequestParam(defaultValue = "", value = "size") String size,
                                                     @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/slaViolationCauseAnalysisDashboard";
    }

    @GetMapping("ticketTopicClassificationDashboard")
    public String ticketTopicClassificationDashboard(@RequestParam(defaultValue = "", value = "size") String size,
                                                     @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/ticketTopicClassificationDashboard";
    }

    @GetMapping("frequentTicketsDashboard")
    public String frequentTicketsDashboard(@RequestParam(defaultValue = "", value = "size") String size,
                                           @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/frequentTicketsDashboard";
    }

    @GetMapping("customerSatisfactionLevelDashboard")
    public String customerSatisfactionLevelDashboard(@RequestParam(defaultValue = "", value = "size") String size,
                                                     @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/customerSatisfactionLevelDashboard";
    }

    @GetMapping("averageContactCountDashboard")
    public String averageContactCountDashboard(@RequestParam(defaultValue = "", value = "size") String size,
                                               @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/averageContactCountDashboard";
    }

    @GetMapping("revenueOverviewDashboard")
    public String revenueOverviewDashboard(@RequestParam(defaultValue = "", value = "size") String size,
                                           @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/revenueOverviewDashboard";
    }

    @GetMapping("revenueOverTimeDashboard")
    public String revenueOverTimeDashboard(@RequestParam(defaultValue = "", value = "size") String size,
                                           @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/revenueOverTimeDashboard";
    }

    @GetMapping("onTimeVsLatePaymentDashboard")
    public String onTimeVsLatePaymentDashboard(@RequestParam(defaultValue = "", value = "size") String size, @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/onTimeVsLatePaymentDashboard";
    }

    @GetMapping("detailedInvoiceListDashboard")
    public String detailedInvoiceListDashboard(@RequestParam(defaultValue = "", value = "size") String size, @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/detailedInvoiceListDashboard";
    }

    @GetMapping("paymentStatusDashboard")
    public String paymentStatusDashboard(@RequestParam(defaultValue = "", value = "size") String size, @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/paymentStatusDashboard";
    }

    @GetMapping("recurringRevenueDashboard")
    public String recurringRevenueDashboard(@RequestParam(defaultValue = "", value = "size") String size, @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/recurringRevenueDashboard";
    }

    @GetMapping("serviceRevenueDashboard")
    public String serviceRevenueDashboard(@RequestParam(defaultValue = "", value = "size") String size, @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/serviceRevenueDashboard";
    }

    @GetMapping("overdueCustomerListDashboard")
    public String overdueCustomerListDashboard(@RequestParam(defaultValue = "", value = "size") String size, @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/overdueCustomerListDashboard";
    }

    @GetMapping("unpaidAmountOverTimeDashboard")
    public String unpaidAmountOverTimeDashboard(@RequestParam(defaultValue = "", value = "size") String size, @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/unpaidAmountOverTimeDashboard";
    }

    @GetMapping("contractExpirationAlertDashboard")
    public String contractExpirationAlertDashboard(@RequestParam(defaultValue = "", value = "size") String size, @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/contractExpirationAlertDashboard";
    }

    @GetMapping("activeApiCountDashboard")
    public String activeApiCountDashboard(@RequestParam(defaultValue = "", value = "size") String size, @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/activeApiCountDashboard";
    }

    @GetMapping("realTimeApiRequestDashboard")
    public String realTimeApiRequestDashboard(@RequestParam(defaultValue = "", value = "size") String size, @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/realTimeApiRequestDashboard";
    }

    @GetMapping("apiErrorByCodeDashboard")
    public String apiErrorByCodeDashboard(@RequestParam(defaultValue = "", value = "size") String size, @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/apiErrorByCodeDashboard";
    }

    @GetMapping("averageApiPerformanceDashboard")
    public String averageApiPerformanceDashboard(@RequestParam(defaultValue = "", value = "size") String size, @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/averageApiPerformanceDashboard";
    }

    @GetMapping("apiRequestOverTimeDashboard")
    public String apiRequestOverTimeDashboard(@RequestParam(defaultValue = "", value = "size") String size, @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/apiRequestOverTimeDashboard";
    }

    @GetMapping("requestByRegionDashboard")
    public String requestByRegionDashboard(@RequestParam(defaultValue = "", value = "size") String size, @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/requestByRegionDashboard";
    }

    @GetMapping("requestByDeviceDashboard")
    public String requestByDeviceDashboard(@RequestParam(defaultValue = "", value = "size") String size, @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/requestByDeviceDashboard";
    }

    @GetMapping("successFailureRateDashboard")
    public String successFailureRateDashboard(@RequestParam(defaultValue = "", value = "size") String size, @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/successFailureRateDashboard";
    }

    @GetMapping("fastestSlowestRequestDashboard")
    public String fastestSlowestRequestDashboard(@RequestParam(defaultValue = "", value = "size") String size, @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/fastestSlowestRequestDashboard";
    }

    @GetMapping("errorRateByEndpointDashboard")
    public String errorRateByEndpointDashboard(@RequestParam(defaultValue = "", value = "size") String size, @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/errorRateByEndpointDashboard";
    }

    @GetMapping("apiVersionPerformanceComparisonDashboard")
    public String apiVersionPerformanceComparisonDashboard(@RequestParam(defaultValue = "", value = "size") String size, @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/apiVersionPerformanceComparisonDashboard";
    }

    @GetMapping("abnormalRequestCountDashboard")
    public String abnormalRequestCountDashboard(@RequestParam(defaultValue = "", value = "size") String size, @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/abnormalRequestCountDashboard";
    }

    @GetMapping("authErrorRequestDashboard")
    public String authErrorRequestDashboard(@RequestParam(defaultValue = "", value = "size") String size, @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/authErrorRequestDashboard";
    }

    @GetMapping("suspiciousIpRequestDashboard")
    public String suspiciousIpRequestDashboard(@RequestParam(defaultValue = "", value = "size") String size, @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/suspiciousIpRequestDashboard";
    }

    @GetMapping("rateLimitedRequestDashboard")
    public String rateLimitedRequestDashboard(@RequestParam(defaultValue = "", value = "size") String size, @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/rateLimitedRequestDashboard";
    }

    @GetMapping("quotaExceededRequestDashboard")
    public String quotaExceededRequestDashboard(@RequestParam(defaultValue = "", value = "size") String size, @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/quotaExceededRequestDashboard";
    }

    @GetMapping("exceededQuotaApiKeyDashboard")
    public String exceededQuotaApiKeyDashboard(@RequestParam(defaultValue = "", value = "size") String size, @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/exceededQuotaApiKeyDashboard";
    }

    @GetMapping("requestLimitComparisonUserDashboard")
    public String requestLimitComparisonUserDashboard(@RequestParam(defaultValue = "", value = "size") String size, @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/requestLimitComparisonUserDashboard";
    }

    @GetMapping("requestLimitComparisonClientDashboard")
    public String requestLimitComparisonClientDashboard(@RequestParam(defaultValue = "", value = "size") String size, @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/requestLimitComparisonClientDashboard";
    }

    @GetMapping("commonErrorsAndCodesDashboard")
    public String commonErrorsAndCodesDashboard(@RequestParam(defaultValue = "", value = "size") String size, @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/commonErrorsAndCodesDashboard";
    }

    @GetMapping("averageErrorHandlingTimeDashboard")
    public String averageErrorHandlingTimeDashboard(@RequestParam(defaultValue = "", value = "size") String size, @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/averageErrorHandlingTimeDashboard";
    }

    @GetMapping("activeApiKeyCountDashboard")
    public String activeApiKeyCountDashboard(@RequestParam(defaultValue = "", value = "size") String size, @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/activeApiKeyCountDashboard";
    }

    @GetMapping("revenueByApiPackageDashboard")
    public String revenueByApiPackageDashboard(@RequestParam(defaultValue = "", value = "size") String size, @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/revenueByApiPackageDashboard";
    }

    @GetMapping("apiRenewalRateDashboard")
    public String apiRenewalRateDashboard(@RequestParam(defaultValue = "", value = "size") String size, @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/apiRenewalRateDashboard";
    }

    @GetMapping("apiCancellationDashboard")
    public String apiCancellationDashboard(@RequestParam(defaultValue = "", value = "size") String size, @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/apiCancellationDashboard";
    }

    @GetMapping("activeApiVersionsDashboard")
    public String activeApiVersionsDashboard(@RequestParam(defaultValue = "", value = "size") String size, @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/activeApiVersionsDashboard";
    }

    @GetMapping("apiRequestByVersionDashboard")
    public String apiRequestByVersionDashboard(@RequestParam(defaultValue = "", value = "size") String size, @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/apiRequestByVersionDashboard";
    }

    @GetMapping("apiPaymentOverTimeDashboard")
    public String apiPaymentOverTimeDashboard(@RequestParam(defaultValue = "", value = "size") String size, @RequestParam(defaultValue = "", value = "page") String page){
        System.out.println(size + "/" + page);
        return "dashboard/reports/overview/apiPaymentOverTimeDashboard";
    }
}
