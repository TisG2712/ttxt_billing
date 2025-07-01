$(document).ready(function () {
    
    let startDateInput = $("#startDate");
    let endDate = $("#endDate");
    
    startDateInput.attr("value", getConvertLocalDateTimeNew2(startDateInput.attr("startDate")));
    endDate.attr("value", getConvertLocalDateTimeNew2(endDate.attr("endDate")));
    
    
    let startTime = getConvertLocalDateTimeNew2(startDateInput.attr("startDate")) ;
    let endTime = getConvertLocalDateTimeNew2(endDate.attr("endDate"));
    
    
    startDateInput.attr("value", startTime);
    endDate.attr("value", endTime);
    
    function getConvertTime(){
        let startDateNew = getConvertLocalDateTimeNew(startDateInput.val());
        let endDateNew = getConvertLocalDateTimeNew(endDate.val());
        
        return `startDate=${startDateNew}&endDate=${endDateNew}`;
    }
    $(".btn-findReport").click(function(){
        let idGroup = $("#partnerName").val();
        if (role === "ADMIN"){
            customGetPage(`/reports/findListPartnerInGroup?id=${idGroup}&${getConvertTime()}`, "#loadReport")
        }
        
    });
    $(".view-report-part-group").click(function(){
        let idGroup = $(this).attr("data-id");
        customGetPage(`/group-partners/loadListPartnerInGroup?idGroup=${idGroup}&${getConvertTime()}`, "#content_box");
    })
    $(".btn-exportDataGroupPartner").click(function () {
        exportData(`${localdomain}/reports/exportDataPartnerGroup?id=&${getConvertTime()}`);
    });
});