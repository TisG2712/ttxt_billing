$(document).ready(function () {
    let startDate = $("#startDate");
    let endDate = $("#endDate");
    startDate.attr("value", getConvertLocalDateTimeNew2(startDate.attr("startDate")));
    endDate.attr("value", getConvertLocalDateTimeNew2(endDate.attr("endDate")));
    
    function convertTime(){
        let startDateNew = getConvertLocalDateTimeNew(startDate.val());
        let endDateNew = getConvertLocalDateTimeNew(endDate.val());
        return `startDate=${startDateNew}&endDate=${endDateNew}`;
    }
    
    $(".view-report1").click(function () {
        let dataId = $(this).attr("data-id");
        if (role === "ADMIN"){
            customGetPage(`${localdomain}/reports/getAllPartnerToCate?id=${dataId}&${convertTime()}&idPartner=`, "#content_box");
        }else if(role === "PARTNER"){
            customGetPage(`${localdomain}/reports/getAllPartnerToCate?id=${dataId}&${convertTime()}&idPartner=${userId}`, "#content_box");
        }

    });
    $(".btn-findReport").click(function () {
        if (role === "ADMIN") {
            customGetPage(`${localdomain}/reports/loadReportCategory?${convertTime()}&id=`, "#loadReport");
        } else if (role === "PARTNER") {
            customGetPage(`${localdomain}/reports/loadReportCategory?${convertTime()}&id=${userId}`, "#loadReport");
        }
    });
    $(".btn-exportData").click(function () {
        if (role === "ADMIN") {
            exportData(`${localdomain}/reports/exportDataListCategory?${convertTime()}&id=`);
        } else if (role === "PARTNER") {
            exportData(`${localdomain}/reports/exportDataListCategory?${convertTime()}&id=${userId}`);
        }
    });
    endDate.datetimepicker({
        dateFormat: "dd/mm/yy",
        timeFormat: "HH:mm:ss",
        changeMonth: true,
        changeYear: true,
        showButtonPanel: true,
        showSecond: true
    });
    startDate.datetimepicker({
        dateFormat: "dd/mm/yy",
        timeFormat: "HH:mm:ss",
        changeMonth: true,
        changeYear: true,
        showButtonPanel: true,
        showSecond: true
    });

});