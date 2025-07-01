
$(".view-report1").click(function(){
    let startDateFrom = $("#startDate").val();
    let endDateFrom = $("#endDate").val();
    let startDate = getConvertLocalDateTimeNew(startDateFrom);
    let endDate = getConvertLocalDateTimeNew(endDateFrom);
    let inData =   $(this).attr("data-id");
    if(role === "ADMIN"){
        customGetPage(`${localdomain}/reports/getAllPartnerToService?id=${inData}&startDate=${startDate}&endDate=${endDate}&idPartner=`, "#content_box");
    }else if(role === "PARTNER"){
        customGetPage(`${localdomain}/reports/getAllPartnerToService?id=${inData}&startDate=${startDate}&endDate=${endDate}&idPartner=`, "#content_box");
    }
    
});