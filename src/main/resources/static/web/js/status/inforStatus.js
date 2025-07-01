$(".btn-close-addStatus").click(function (){
    $("#modalEditStatus").removeClass("show");
});
$(".btn-send-editStatus").click(function (){
    let idStatus = $("#idStatus").val();
    let editTitleStatus = $("#addTitleNewStatus").val();
    if (editTitleStatus != null && editTitleStatus !== "") {
        fetch(`${localdomain}/api/status/update`,{
            method: "PUT",
            headers: { "Content-Type": "application/json" },
            body : JSON.stringify({
                idStatus : idStatus,
                editTitleStatus : editTitleStatus,
            })
        }).then(function (response) {
            if (!response.ok) {
                throw new Error(`HTTP error! status: ${response.status}`);
            }
            return response.json();
        }).then(data => {
            if(data.success){
                alertGloable(data.message, "success");
                router("/status/status");
            }else {
                alertGloable(data.message, "false");
                router("/status/status");
            }
        }).catch(error => {
            console.log(error)
        })
    }
});