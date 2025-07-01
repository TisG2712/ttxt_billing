$(document).ready(function () {
    function getTime(){
        let startDateFrom = $(this).attr("startDate");
        let endDateFrom = $(this).attr("endDate");
        return `startDate=${startDateFrom}&endDate=${endDateFrom}`;
    }
    if (role === "ADMIN"){
        $(".btn-trolaiListGroup").click(function(){
            customGetPage(`/reports/reportAllGroupPartner?id=&${getTime()}`, "#content_box");
        });
    }else if (role === "PARTNER"){
        $(".btn-trolaiListGroup").click(function(){
            customGetPage(`/reports/reportAllGroupPartner?id=${userId}&${getTime()}`, "#content_box");
        });
    }
})
