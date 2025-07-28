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

    @GetMapping("reportSystemUnit")
    public String reportSystemUnit(@RequestParam(defaultValue = "" , value = "size") String size,
                                   @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportSystemUnit";
    }

    @GetMapping("reportSystemRegion")
    public String reportSystemRegion(@RequestParam(defaultValue = "" , value = "size") String size,
                                   @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportSystemRegion";
    }

    @GetMapping("reportUpdateMaintenance")
    public String reportUpdateMaintenance(@RequestParam(defaultValue = "" , value = "size") String size,
                                     @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportUpdateMaintenance";
    }

    @GetMapping("reportCustomerDemographics")
    public String reportCustomerDemographics(@RequestParam(defaultValue = "" , value = "size") String size,
                                     @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportCustomerDemographics";
    }

    @GetMapping("reportInteractionByStaff")
    public String reportInteractionByStaff(@RequestParam(defaultValue = "" , value = "size") String size,
                                     @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportInteractionByStaff";
    }

    @GetMapping("reportCustomerInfo")
    public String reportCustomerInfo(@RequestParam(defaultValue = "" , value = "size") String size,
                                     @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportCustomerInfo";
    }

    @GetMapping("reportCustomerSegment")
    public String reportCustomerSegment(@RequestParam(defaultValue = "" , value = "size") String size,
                                     @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportCustomerSegment";
    }

    @GetMapping("reportRevenueForecast")
    public String reportRevenueForecast(@RequestParam(defaultValue = "" , value = "size") String size,
                                     @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportRevenueForecast";
    }

    @GetMapping("reportMarketTrends")
    public String reportMarketTrends(@RequestParam(defaultValue = "" , value = "size") String size,
                                     @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportMarketTrends";
    }

    @GetMapping("reportCustomerGrowth")
    public String reportCustomerGrowth(@RequestParam(defaultValue = "" , value = "size") String size,
                                     @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportCustomerGrowth";
    }

    @GetMapping("reportCustomerCare")
    public String reportCustomerCare(@RequestParam(defaultValue = "" , value = "size") String size,
                                     @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportCustomerCare";
    }

    @GetMapping("reportCustomerChannel")
    public String reportCustomerChannel(@RequestParam(defaultValue = "" , value = "size") String size,
                                     @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportCustomerChannel";
    }

    @GetMapping("reportTicketHandling")
    public String reportTicketHandling(@RequestParam(defaultValue = "" , value = "size") String size,
                                        @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportTicketHandling";
    }

    @GetMapping("reportTicketCategory")
    public String reportTicketCategory(@RequestParam(defaultValue = "" , value = "size") String size,
                                        @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportTicketCategory";
    }

    @GetMapping("reportStaffPerformance")
    public String reportStaffPerformance(@RequestParam(defaultValue = "" , value = "size") String size,
                                        @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportStaffPerformance";
    }

    @GetMapping("reportSlaSummary")
    public String reportSlaSummary(@RequestParam(defaultValue = "" , value = "size") String size,
                                        @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportSlaSummary";
    }

    @GetMapping("reportTicketStatus")
    public String reportTicketStatus(@RequestParam(defaultValue = "" , value = "size") String size,
                                        @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportTicketStatus";
    }

    @GetMapping("reportRevenueByUnit")
    public String reportRevenueByUnit(@RequestParam(defaultValue = "" , value = "size") String size,
                                        @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportRevenueByUnit";
    }

    @GetMapping("reportInvoice")
    public String reportInvoice(@RequestParam(defaultValue = "" , value = "size") String size,
                                        @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportInvoice";
    }

    @GetMapping("reportPaymentCount")
    public String reportPaymentCount(@RequestParam(defaultValue = "" , value = "size") String size,
                                        @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportPaymentCount";
    }

    @GetMapping("reportFinance")
    public String reportFinance(@RequestParam(defaultValue = "" , value = "size") String size,
                                        @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportFinance";
    }

    @GetMapping("reportContractByUnit")
    public String reportContractByUnit(@RequestParam(defaultValue = "" , value = "size") String size,
                                        @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportContractByUnit";
    }

    @GetMapping("reportDiscountPromotion")
    public String reportDiscountPromotion(@RequestParam(defaultValue = "" , value = "size") String size,
                                        @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportDiscountPromotion";
    }

    @GetMapping("reportApiTraffic")
    public String reportApiTraffic(@RequestParam(defaultValue = "" , value = "size") String size,
                                        @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportApiTraffic";
    }

    @GetMapping("reportApiRequestTrends")
    public String reportApiRequestTrends(@RequestParam(defaultValue = "" , value = "size") String size,
                                        @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportApiRequestTrends";
    }

    @GetMapping("reportApiThreshold")
    public String reportApiThreshold(@RequestParam(defaultValue = "" , value = "size") String size,
                                        @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportApiThreshold";
    }

    @GetMapping("reportApiPerformance")
    public String reportApiPerformance(@RequestParam(defaultValue = "" , value = "size") String size,
                                        @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportApiPerformance";
    }

    @GetMapping("reportApiBandwidth")
    public String reportApiBandwidth(@RequestParam(defaultValue = "" , value = "size") String size,
                                        @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportApiBandwidth";
    }

    @GetMapping("reportPluginUsage")
    public String reportPluginUsage(@RequestParam(defaultValue = "" , value = "size") String size,
                                        @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportPluginUsage";
    }

    @GetMapping("reportApiRequestByUser")
    public String reportApiRequestByUser(@RequestParam(defaultValue = "" , value = "size") String size,
                                        @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportApiRequestByUser";
    }

    @GetMapping("reportApiResponseTime")
    public String reportApiResponseTime(@RequestParam(defaultValue = "" , value = "size") String size,
                                        @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportApiResponseTime";
    }

    @GetMapping("reportInvoiceTotalValue")
    public String reportInvoiceTotalValue(@RequestParam(defaultValue = "" , value = "size") String size,
                                        @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportInvoiceTotalValue";
    }

    @GetMapping("reportInvoiceStatus")
    public String reportInvoiceStatus(@RequestParam(defaultValue = "" , value = "size") String size,
                                        @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportInvoiceStatus";
    }

    @GetMapping("reportRevenueByPeriod")
    public String reportRevenueByPeriod(@RequestParam(defaultValue = "" , value = "size") String size,
                                        @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportRevenueByPeriod";
    }

    @GetMapping("reportExportedInvoicesByTime")
    public String reportExportedInvoicesByTime(@RequestParam(defaultValue = "" , value = "size") String size,
                                        @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportExportedInvoicesByTime";
    }

    @GetMapping("reportExportedInvoicesByStatus")
    public String reportExportedInvoicesByStatus(@RequestParam(defaultValue = "" , value = "size") String size,
                                        @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportExportedInvoicesByStatus";
    }

    @GetMapping("reportExportedInvoicesByType")
    public String reportExportedInvoicesByType(@RequestParam(defaultValue = "" , value = "size") String size,
                                        @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportExportedInvoicesByType";
    }

    @GetMapping("reportInvoiceDetails")
    public String reportInvoiceDetails(@RequestParam(defaultValue = "" , value = "size") String size,
                                        @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportInvoiceDetails";
    }

    @GetMapping("reportAdjustedInvoices")
    public String reportAdjustedInvoices(@RequestParam(defaultValue = "" , value = "size") String size,
                                        @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportAdjustedInvoices";
    }

    @GetMapping("invoiceDetailCancelled")
    public String invoiceDetailCancelled(@RequestParam(defaultValue = "" , value = "size") String size,
                                        @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/invoiceDetailCancelled";
    }

    @GetMapping("invoiceRevenueByCustomer")
    public String invoiceRevenueByCustomer(@RequestParam(defaultValue = "" , value = "size") String size,
                                        @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/invoiceRevenueByCustomer";
    }

    @GetMapping("invoiceRevenueByCustomerGroup")
    public String invoiceRevenueByCustomerGroup(@RequestParam(defaultValue = "" , value = "size") String size,
                                        @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/invoiceRevenueByCustomerGroup";
    }

    @GetMapping("invoiceRevenueByService")
    public String invoiceRevenueByService(@RequestParam(defaultValue = "" , value = "size") String size,
                                        @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/invoiceRevenueByService";
    }

    @GetMapping("invoiceRevenueByServiceGroup")
    public String invoiceRevenueByServiceGroup(@RequestParam(defaultValue = "" , value = "size") String size,
                                        @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/invoiceRevenueByServiceGroup";
    }

    @GetMapping("vatInvoiceByTime")
    public String vatInvoiceByTime(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/vatInvoiceByTime";
    }

    @GetMapping("vatInvoiceByType")
    public String vatInvoiceByType(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/vatInvoiceByType";
    }

    @GetMapping("invoiceStatusIssued")
    public String invoiceStatusIssued(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/invoiceStatusIssued";
    }

    @GetMapping("invoiceStatusPaid")
    public String invoiceStatusPaid(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/invoiceStatusPaid";
    }

    @GetMapping("invoiceStatusUnpaid")
    public String invoiceStatusUnpaid(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/invoiceStatusUnpaid";
    }

    @GetMapping("contractCountByStatus")
    public String contractCountByStatus(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/contractCountByStatus";
    }

    @GetMapping("contractCountByTime")
    public String contractCountByTime(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/contractCountByTime";
    }

    @GetMapping("contractCountByService")
    public String contractCountByService(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/contractCountByService";
    }

    @GetMapping("contractDetailList")
    public String contractDetailList(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/contractDetailList";
    }

    @GetMapping("contractChangeLog")
    public String contractChangeLog(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/contractChangeLog";
    }

    @GetMapping("contractProgressVsPlan")
    public String contractProgressVsPlan(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/contractProgressVsPlan";
    }

    @GetMapping("contractPaymentProgress")
    public String contractPaymentProgress(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/contractPaymentProgress";
    }

    @GetMapping("contractExpiringSoon")
    public String contractExpiringSoon(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/contractExpiringSoon";
    }

    @GetMapping("contractNeedsRenewal")
    public String contractNeedsRenewal(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/contractNeedsRenewal";
    }

    @GetMapping("contractValueRealized")
    public String contractValueRealized(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/contractValueRealized";
    }

    @GetMapping("reportDebtTotal")
    public String reportDebtTotal(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportDebtTotal";
    }

    @GetMapping("reportPartnerPerformance")
    public String reportPartnerPerformance(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportPartnerPerformance";
    }

    @GetMapping("reportRevenueByTime")
    public String reportRevenueByTime(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportRevenueByTime";
    }

    @GetMapping("reportRevenueByService")
    public String reportRevenueByService(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportRevenueByService";
    }

    @GetMapping("reportRevenueByChannel")
    public String reportRevenueByChannel(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportRevenueByChannel";
    }

    @GetMapping("reportRevenueByCustomerGroup")
    public String reportRevenueByCustomerGroup(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportRevenueByCustomerGroup";
    }

    @GetMapping("reportDebtFromGroup")
    public String reportDebtFromGroup(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportDebtFromGroup";
    }

    @GetMapping("reportDebtFromCustomer")
    public String reportDebtFromCustomer(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportDebtFromCustomer";
    }

    @GetMapping("reportOverdueDebt")
    public String reportOverdueDebt(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportOverdueDebt";
    }

    @GetMapping("reportPaymentHistory")
    public String reportPaymentHistory(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportPaymentHistory";
    }

    @GetMapping("reportTotalCollectedRemaining")
    public String reportTotalCollectedRemaining(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportTotalCollectedRemaining";
    }

    @GetMapping("reportTransactionList")
    public String reportTransactionList(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportTransactionList";
    }

    @GetMapping("reportPaymentMethod")
    public String reportPaymentMethod(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportPaymentMethod";
    }

    @GetMapping("reportTopDebtCustomers")
    public String reportTopDebtCustomers(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportTopDebtCustomers";
    }

    @GetMapping("reportAPIUsage")
    public String reportAPIUsage(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportAPIUsage";
    }

    @GetMapping("reportApiTrafficEndpoint")
    public String reportApiTrafficEndpoint(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportApiTrafficEndpoint";
    }

    @GetMapping("reportApiErrorRate")
    public String reportApiErrorRate(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportApiErrorRate";
    }

    @GetMapping("reportApiUptime")
    public String reportApiUptime(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportApiUptime";
    }

    @GetMapping("reportApiRequestLog")
    public String reportApiRequestLog(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportApiRequestLog";
    }

    @GetMapping("reportApiRejectedRate")
    public String reportApiRejectedRate(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportApiRejectedRate";
    }

    @GetMapping("reportAuthErrors")
    public String reportAuthErrors(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportAuthErrors";
    }

    @GetMapping("reportSuspiciousIPs")
    public String reportSuspiciousIPs(@RequestParam(defaultValue = "" , value = "size") String size,
                                               @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportSuspiciousIPs";
    }

    @GetMapping("reportTotalRequestsByEndpoint")
    public String reportTotalRequestsByEndpoint(@RequestParam(defaultValue = "" , value = "size") String size,
                                      @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportTotalRequestsByEndpoint";
    }

    @GetMapping("reportApiCallsByUser")
    public String reportApiCallsByUser(@RequestParam(defaultValue = "" , value = "size") String size,
                                      @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportApiCallsByUser";
    }

    @GetMapping("reportApiCallsByClient")
    public String reportApiCallsByClient(@RequestParam(defaultValue = "" , value = "size") String size,
                                      @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportApiCallsByClient";
    }

    @GetMapping("reportPopularApis")
    public String reportPopularApis(@RequestParam(defaultValue = "" , value = "size") String size,
                                      @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportPopularApis";
    }

    @GetMapping("reportApiUsageByRegion")
    public String reportApiUsageByRegion(@RequestParam(defaultValue = "" , value = "size") String size,
                                      @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportApiUsageByRegion";
    }

    @GetMapping("reportHttpErrorCodes")
    public String reportHttpErrorCodes(@RequestParam(defaultValue = "" , value = "size") String size,
                                      @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportHttpErrorCodes";
    }

    @GetMapping("reportEndpointErrors")
    public String reportEndpointErrors(@RequestParam(defaultValue = "" , value = "size") String size,
                                      @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportEndpointErrors";
    }

    @GetMapping("reportErrorRateByDev")
    public String reportErrorRateByDev(@RequestParam(defaultValue = "" , value = "size") String size,
                                      @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportErrorRateByDev";
    }

    @GetMapping("reportTotalApiRequestsByTime")
    public String reportTotalApiRequestsByTime(@RequestParam(defaultValue = "" , value = "size") String size,
                                      @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/reportTotalApiRequestsByTime";
    }

    @GetMapping("avgReplyTimeTicket")
    public String avgReplyTimeTicket(@RequestParam(defaultValue = "" , value = "size") String size,
                                      @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/avgReplyTimeTicket";
    }

    @GetMapping("avgResolveTimeTicket")
    public String avgResolveTimeTicket(@RequestParam(defaultValue = "" , value = "size") String size,
                                      @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/avgResolveTimeTicket";
    }

    @GetMapping("firstAttemptResolutionRate")
    public String firstAttemptResolutionRate(@RequestParam(defaultValue = "" , value = "size") String size,
                                      @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/firstAttemptResolutionRate";
    }

    @GetMapping("staffEfficiency")
    public String staffEfficiency(@RequestParam(defaultValue = "" , value = "size") String size,
                                      @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/staffEfficiency";
    }

    @GetMapping("teamEfficiency")
    public String teamEfficiency(@RequestParam(defaultValue = "" , value = "size") String size,
                                      @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/teamEfficiency";
    }

    @GetMapping("slaOverdueTickets")
    public String slaOverdueTickets(@RequestParam(defaultValue = "" , value = "size") String size,
                                      @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/slaOverdueTickets";
    }

    @GetMapping("onTimeResolvedRate")
    public String onTimeResolvedRate(@RequestParam(defaultValue = "" , value = "size") String size,
                                    @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/onTimeResolvedRate";
    }

    @GetMapping("avgSlaProcessTime")
    public String avgSlaProcessTime(@RequestParam(defaultValue = "" , value = "size") String size,
                                    @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/avgSlaProcessTime";
    }

    @GetMapping("ticketCategoryReportLink")
    public String ticketCategoryReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                    @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/ticketCategoryReportLink";
    }

    @GetMapping("ticketTrendReportLink")
    public String ticketTrendReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                    @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/ticketTrendReportLink";
    }

    @GetMapping("customerSatisfactionReportLink")
    public String customerSatisfactionReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                    @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/customerSatisfactionReportLink";
    }

    @GetMapping("negativeFeedbackReportLink")
    public String negativeFeedbackReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                    @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/negativeFeedbackReportLink";
    }

    @GetMapping("positiveFeedbackReportLink")
    public String positiveFeedbackReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                    @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/positiveFeedbackReportLink";
    }

    @GetMapping("negativeFeedbackResolutionTimeReportLink")
    public String negativeFeedbackResolutionTimeReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                    @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/negativeFeedbackResolutionTimeReportLink";
    }

    @GetMapping("recurringIssueRateReportLink")
    public String recurringIssueRateReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                    @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/recurringIssueRateReportLink";
    }

    @GetMapping("ticketsByEmployeeReportLink")
    public String ticketsByEmployeeReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                    @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/ticketsByEmployeeReportLink";
    }

    @GetMapping("supportTeamPerformanceReportLink")
    public String supportTeamPerformanceReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                    @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/supportTeamPerformanceReportLink";
    }

    @GetMapping("customerRegionReportLink")
    public String customerRegionReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                    @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/customerRegionReportLink";
    }

    @GetMapping("customerIndustryReportLink")
    public String customerIndustryReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                    @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/customerIndustryReportLink";
    }

    @GetMapping("employeePerformanceReportLink")
    public String employeePerformanceReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                    @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/employeePerformanceReportLink";
    }

    @GetMapping("feedbackSatisfactionReportLink")
    public String feedbackSatisfactionReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                    @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/feedbackSatisfactionReportLink";
    }

    @GetMapping("customerRevenueReportLink")
    public String customerRevenueReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                    @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/customerRevenueReportLink";
    }

    @GetMapping("regionRevenueReportLink")
    public String regionRevenueReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                    @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/regionRevenueReportLink";
    }

    @GetMapping("customerGroupRevenueReportLink")
    public String customerGroupRevenueReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                          @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/customerGroupRevenueReportLink";
    }

    @GetMapping("supportRequestsOverTimeReportLink")
    public String supportRequestsOverTimeReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                          @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/supportRequestsOverTimeReportLink";
    }

    @GetMapping("averageResolutionTimeReportLink")
    public String averageResolutionTimeReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                          @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/averageResolutionTimeReportLink";
    }

    @GetMapping("activeServersReportLink")
    public String activeServersReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                          @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/activeServersReportLink";
    }

    @GetMapping("runningServicesReportLink")
    public String runningServicesReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                          @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/runningServicesReportLink";
    }

    @GetMapping("downtimeReportLink")
    public String downtimeReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                          @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/downtimeReportLink";
    }

    @GetMapping("systemStatusReportLink")
    public String systemStatusReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                          @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/systemStatusReportLink";
    }

    @GetMapping("serverPerformanceReportLink")
    public String serverPerformanceReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                          @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/serverPerformanceReportLink";
    }

    @GetMapping("systemLogErrorsReportLink")
    public String systemLogErrorsReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                          @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/systemLogErrorsReportLink";
    }

    @GetMapping("errorFrequencyReportLink")
    public String errorFrequencyReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                          @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/errorFrequencyReportLink";
    }

    @GetMapping("failedLoginAttemptsReportLink")
    public String failedLoginAttemptsReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                          @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/failedLoginAttemptsReportLink";
    }

    @GetMapping("userListReportLink")
    public String userListReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                          @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/userListReportLink";
    }

    @GetMapping("inactiveAccountsReportLink")
    public String inactiveAccountsReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                          @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/inactiveAccountsReportLink";
    }

    @GetMapping("databaseStatusReportLink")
    public String databaseStatusReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                          @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/databaseStatusReportLink";
    }

    @GetMapping("backupRecoveryReportLink")
    public String backupRecoveryReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                          @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/backupRecoveryReportLink";
    }

    @GetMapping("dataChangeLogReportLink")
    public String dataChangeLogReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                          @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/dataChangeLogReportLink";
    }

    @GetMapping("resourceUsageReportLink")
    public String resourceUsageReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                          @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/resourceUsageReportLink";
    }

    @GetMapping("apiResponseTimeReportLink")
    public String apiResponseTimeReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                          @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/apiResponseTimeReportLink";
    }

    @GetMapping("hardwareStatusReportLink")
    public String hardwareStatusReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                          @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/hardwareStatusReportLink";
    }

    @GetMapping("systemPerformanceReportLink")
    public String systemPerformanceReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                          @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/systemPerformanceReportLink";
    }

    @GetMapping("performanceBenchmarkReportLink")
    public String performanceBenchmarkReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                          @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/performanceBenchmarkReportLink";
    }

    @GetMapping("signedContractsReportLink")
    public String signedContractsReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                                 @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/signedContractsReportLink";
    }

    @GetMapping("pendingApprovalContractsReportLink")
    public String pendingApprovalContractsReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                                 @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/pendingApprovalContractsReportLink";
    }

    @GetMapping("salesContractsReportLink")
    public String salesContractsReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                                 @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/salesContractsReportLink";
    }

    @GetMapping("serviceContractsReportLink")
    public String serviceContractsReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                                 @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/serviceContractsReportLink";
    }

    @GetMapping("leaseContractsReportLink")
    public String leaseContractsReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                                 @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/leaseContractsReportLink";
    }

    @GetMapping("contractsByPartnerReportLink")
    public String contractsByPartnerReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                                 @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/contractsByPartnerReportLink";
    }

    @GetMapping("actualRevenueReportLink")
    public String actualRevenueReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                                 @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/actualRevenueReportLink";
    }

    @GetMapping("revenueByContractTypeReportLink")
    public String revenueByContractTypeReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                                 @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/revenueByContractTypeReportLink";
    }

    @GetMapping("expiringContractsReportLink")
    public String expiringContractsReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                                  @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/expiringContractsReportLink";
    }

    @GetMapping("contractRenewalRequiredReportLink")
    public String contractRenewalRequiredReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                                  @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/contractRenewalRequiredReportLink";
    }

    @GetMapping("failedContractRenewalsReportLink")
    public String failedContractRenewalsReportLink(@RequestParam(defaultValue = "" , value = "size") String size,
                                                  @RequestParam(defaultValue = "" , value = "page") String page){
        System.out.println(size+"/"+page);
        return "dashboard/reports/list_reports/failedContractRenewalsReportLink";
    }
}
