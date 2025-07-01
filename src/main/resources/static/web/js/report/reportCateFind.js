$(".view-report1").click(function () {
    let dataId = $(this).attr("data-id");
    let startDateFrom = $("#startDate").val();
    let endDateFrom = $("#endDate").val();
    let startDate = getConvertLocalDateTimeNew(startDateFrom);
    let endDate = getConvertLocalDateTimeNew(endDateFrom);
    if (role === "ADMIN"){
        customGetPage(`${localdomain}/reports/getAllPartnerToCate?id=${dataId}&startDate=${startDate}&endDate=${endDate}&idPartner=`, "#content_box");
    }else if(role === "PARTNER"){
        customGetPage(`${localdomain}/reports/getAllPartnerToCate?id=${dataId}&startDate=${startDate}&endDate=${endDate}&idPartner=${userId}`, "#content_box");
    }
});