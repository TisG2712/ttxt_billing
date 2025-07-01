    $(".btn-trolai").click(function () {
        let startDateFrom = $(this).attr("startDate");
        let endDateFrom = $(this).attr("endDate");
        if(role === "ADMIN"){
            customGetPage(`/reports/getAllService?id=&startDate=${startDateFrom}&endDate=${endDateFrom}`, "#content_box")
        }else if(role === "PARTNER"){
            customGetPage(`/reports/getAllService?id=${userId}&startDate=${startDateFrom}&endDate=${endDateFrom}`, "#content_box")
        }
    });



