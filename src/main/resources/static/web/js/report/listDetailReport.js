$(document).ready(function(){
    let startDateNew = $("#startDate");
    let endDateNew = $("#endDate");
    startDateNew.attr("value", getConvertLocalDateTimeNew2(startDateNew.attr("startDate")));
    endDateNew.attr("value", getConvertLocalDateTimeNew2(endDateNew.attr("endDate")));
    $(".box-icon-close").click(function(){
        $("#box-content-report-children").removeClass("hien");
    })
    
    function getTimeConvert(){
        let startDateConvert = getConvertLocalDateTimeNew(startDateNew.val());
        let endDateConvert = getConvertLocalDateTimeNew(endDateNew.val());
        return `startDate=${startDateConvert}&endDate=${endDateConvert}`;
    }
    
    if (role === "ADMIN"){
        $(".btn-trolai").click(function(){
            let startDateFrom = $(this).attr("startDate");
            let endDateFrom = $(this).attr("endDate");
            customGetPage(`/reports/listReport?id=&startDate=${startDateFrom}&endDate=${endDateFrom}`, "#content_box");
        });
        $(".view-report1").click(function(){
            let inData =   $(this).attr("data-id");
            customGetPage(`${localdomain}/reports/getAllPartnerToService?id=${inData}&${getTimeConvert()}&idPartner=`, "#content_box");
        });
        $(".btn-findReport").click(function(){
            customGetPage(`${localdomain}/reports/loadAllService?id=&${getTimeConvert()}`, "#loadReport");
        });
        $(".btn-exportData").click(function(){
            window.location.href = `${localdomain}/reports/exportDataListAllService?id=&${getTimeConvert()}`;
        });
    }else if (role === "PARTNER"){
        $(".btn-trolai").click(function(){
            let startDateFrom = $(this).attr("startDate");
            let endDateFrom = $(this).attr("endDate");
            customGetPage(`/reports/listReport?id=${userId}&startDate=${startDateFrom}&endDate=${endDateFrom}`, "#content_box");
        });
        $(".view-report1").click(function(){
            let inData =   $(this).attr("data-id");
            let idPartner = $(this).attr("data-idPartner");
            customGetPage(`${localdomain}/reports/getAllPartnerToService?id=${inData}&${getTimeConvert()}&idPartner=${idPartner}`, "#content_box");
        });
        $(".btn-findReport").click(function(){
            let idPartner = $(this).attr("data-idPartner");
            customGetPage(`${localdomain}/reports/loadAllService?id=${idPartner}&${getTimeConvert()}`, "#loadReport");
        });
        $(".btn-exportData").click(function(){
            let idPartner = $(this).attr("data-idPartner");
            window.location.href = `${localdomain}/reports/exportDataListAllService?id=${idPartner}&${getTimeConvert()}`;
        });
        
    }
})

