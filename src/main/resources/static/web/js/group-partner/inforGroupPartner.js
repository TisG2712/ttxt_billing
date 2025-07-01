$(".btn-close-addGroup").click(function (){
    $("#modalEditGroup").removeClass("show");
});
$(".btn-send-editGroup").click(function (){
    let idGroup = $("#idGroup").val();
    let editTitleGroup = $("#addTitleNewGroup").val();
    if (editTitleGroup != null && editTitleGroup !== "") {
        fetch(`${localdomain}/api/partner-group/update`,{
            method: "PUT",
            headers: { "Content-Type": "application/json" },
            body : JSON.stringify({
                idGroup : idGroup,
                editNameGroup : editTitleGroup,
            })
        }).then(function (response) {
            if (!response.ok) {
                throw new Error(`HTTP error! status: ${response.status}`);
            }
            return response.json();
        }).then(data => {
            if(data.success){
                alertGloable(data.message, "success");
                router(`/group-partners/listGroup`)
            }else {
                alertGloable(data.message, "false");
                router(`/group-partners/listGroup`)
            }
        }).catch(error => {
            console.log(error)
        })
    }else {
        $("#box-content-edit-inputName").html("Không được để trống trường này");
    }
});