$(".btn-trolai").click(function(){
    let startDateFrom = $(this).attr("startDate");
    let endDateFrom = $(this).attr("endDate");
    
    if (role === "ADMIN"){
        customGetPage(`/reports/getAllServiceItem?startDate=${startDateFrom}&endDate=${endDateFrom}&id=`, "#content_box");
    }else if(role === "PARTNER"){
        customGetPage(`/reports/getAllServiceItem?startDate=${startDateFrom}&endDate=${endDateFrom}&id=${userId}`, "#content_box");
    }

})