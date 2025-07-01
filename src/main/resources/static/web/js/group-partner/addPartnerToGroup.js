$(document).ready(function () {
   $(".btn-addNewPartnerToGroup").click(function () {
      let idGroup = $("#idGroup").val();
      $("#box-partner-item").addClass("active");
      customGetPage(`${localdomain}/group-partners/loadPartnerForGroup?idGroup=${idGroup}`, "#box-partner-item-content")
   });
   
   $(".remove-partner-group").click(function () {
      let checkConFirm = confirm("Bạn có chắc chắn muốn xoá đơn vị này ra khỏi nhóm");
      if (checkConFirm){
         let idGroup = $("#idGroup").val();
         let idPartner = $(this).attr("data-id");
         fetch(`${localdomain}/api/partner-to-group/deletePartToGroup`, {
            method: "DELETE",
            headers : {
               "Content-Type": "application/json"
            },
            body: JSON.stringify({
               idGroup : idGroup,
               idPart  : idPartner
            })
         }).then(response => {
            if (!response.ok) {
               return response.json();
            }
            return response.json();
         }).then(data => {
            router(`/partners/listGroupPartner?idGroup=${idGroup}&size=${100}&page=${0}`);
            getCountGroupPartner(idGroup, `group-`+idGroup);
         }).catch(error => {
            console.log(error);
         })
       
      }
   })
});