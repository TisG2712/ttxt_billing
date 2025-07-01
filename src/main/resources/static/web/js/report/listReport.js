$(document).ready(function(){
    
    //Lấy ra phần tử DOM input time
    let startDate = $("#startDate");
    let endDate = $("#endDate");
    startDate.attr("value", getConvertLocalDateTimeNew2(startDate.attr("startDate")));
    endDate.attr("value", getConvertLocalDateTimeNew2(endDate.attr("endDate")));
    
    //Định dạng time để hiển thị
    let startTime = getConvertLocalDateTimeNew2(startDate.attr("startDate")) ;
    let endTime = getConvertLocalDateTimeNew2(endDate.attr("endDate"));
    
    // Hiển thị định dạng time chuẩn ra ô input
    startDate.attr("value", startTime);
    endDate.attr("value", endTime);
    if(role === "ADMIN"){
    }else if(role === "PARTNER"){
        $("#partnerName").addClass("an");
    }
    function getTime(){
        //Lấy ra ngày tháng hiện tại cảu input
        let startDateFrom = startDate.val();
        let endDateFrom = endDate.val();
        
        //Đinh dạnh lại về chuẩn Time
        let startDateConvert = getConvertLocalDateTimeNew(startDateFrom);
        let endDateConvert = getConvertLocalDateTimeNew(endDateFrom);
        return `startDate=${startDateConvert}&endDate=${endDateConvert}`;
    }
   
    $(".view-report").click(function(){
        let idPartner = $(this).attr("data-id");
        customGetPage(`${localdomain}/reports/listDetail?id=${idPartner}&${getTime()}`, "#content_box");
    });
    $(".btn-findReport").click(function(){
        
        let idPartner = $("#partnerName").val();
        if (role === "ADMIN"){
            customGetPage(`${localdomain}/reports/findListReport?id=${idPartner}&${getTime()}`, "#loadReport")
        }else if(role === "PARTNER"){
            customGetPage(`${localdomain}/reports/findListReport?id=${userId}&${getTime()}`, "#loadReport")
        }

    });
    $(".btn-findReportService").click(function(){
        customGetPage(`${localdomain}/reports/getAllService?${getTime()}`, "#loadReport")
    });
    
    $(".btn-findReportServiceItem").click(function(){
        customGetPage(`${localdomain}/reports/getAllServiceItem?${getTime()}`, "#loadReport")
    });

    $(".btn-exportData").click(function(){
        let idPartner = $("#partnerName").val();
        if (role === "ADMIN"){
            exportData(`${localdomain}/reports/exportDataListPartnerReport?${getTime()}&id=${idPartner}`);
        }else if(role === "PARTNER"){
            exportData(`${localdomain}/reports/exportDataListPartnerReport?${getTime()}&id=${userId}`);
        }
    });
    
});