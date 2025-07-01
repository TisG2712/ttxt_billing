$(document).ready(function(){
    $(".view-report").click(function(){
        let idPartner = $(this).attr("data-id");
        let startDateFrom = $("#startDate").val();
        let endDateFrom = $("#endDate").val();
        let startDate = getConvertLocalDateTimeNew(startDateFrom);
        let endDate = getConvertLocalDateTimeNew(endDateFrom);
        console.log(startDate)
        customGetPage(`${localdomain}/reports/listDetail?id=${idPartner}&startDate=${startDate}&endDate=${endDate}`, "#content_box");
    });
});