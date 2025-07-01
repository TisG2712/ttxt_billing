$(document).ready(function(){

    $(".remove-partner-service").click(function(){
        let checkConfirm = confirm("Bạn có chắc chắn muốn xóa đơn vị này? ");
        if (checkConfirm) {
            let idParner = $(this).attr("data-id");
            customDelete(`${localdomain}/admin_service/partner/deletePatner`, idParner);
            setTimeout(reloadListService, 1100);
        }
    });
    function reloadListService() {
        customGetPage(`/partners/listPartner?size=${20}&page=${0}`, "#content_box");
    }
    $(".view-bank").click(function(){
        let partnerId = $(this).attr("data-id");
        customGetPage(`/partners/infoUser?id=${partnerId}&startDate=${getFirstDayOfMonth()}&endDate=${getLastDayOfMonth()}`, "#content_box")
    })
    
    $(".edit-bank").click(function(){
        let partnerId = $(this).attr("data-id");
        customGetPage(`/partners/editPartner?id=${partnerId}`, "#content_box")
    });
    
    $(".btn-addnewpartner").click(function(){
        customGetPage("/partners/addPartner", "#content_box");
    });
    
    $('#info-topLeft-prev').click(function () {
        customGetPage(`${localdomain}/admin/dashboard`, "#content_box");
    });
});
