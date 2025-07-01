$(document).ready(function () {
    $(".info").click(function (){
        customGetPage(`/partners/infoUser?id=${userId}&startDate=${getFirstDayOfMonth()}&endDate=${getLastDayOfMonth()}`, "#content_box");
    })
    $(".logout").click(function () {
        customLogout();
    });
    $(".box-infoUser").click(function (){
       $(this).removeClass("hien");
    });
});