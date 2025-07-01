
$(document).ready(function () {
   $("#request_number1").click(function () {
       customGetPage(`/partners/listPartner?size=${10}&page=${0}`, "#content_box");
   });

});