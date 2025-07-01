$(".btn-addNewGroups").click(function () {
    $(".modal-addNewGroups").addClass("show");
});
$(".btn-close-addNewGroups").click(function () {
    $(".modal-addNewGroups").removeClass("show");
})
$("#modal-content1").click(function (e) {
    e.stopPropagation();
})
$(".btn-send-addNewGroups").click(function (event){
    let titleGroups = $("#addNameGroups").val();
    if(titleGroups !== "" && titleGroups !== null){
        fetch(`${localdomain}/api/partner-group/add`, {
            method: "POST",
            headers : {
                "Content-Type": "application/json",
                "Authorization": `Bearer ${token}`,
            },
            body: JSON.stringify({
                nameGroup : titleGroups
            })
        }).then(response => {
            if (!response.ok) {
                throw new Error(`HTTP error! status: ${response.status}`);
            }
            return response.json(); // Hoặc response.text(), response.blob(), response.arrayBuffer()
        })
            .then(data => {
                if(data.success){
                    alertGloable(data.message, "success");
                    customGetPage(`${localdomain}/group-partners/listGroup`, "#content_box")
                }else {
                    alertGloable(data.message, "false");
                    customGetPage(`${localdomain}/group-partners/listGroup`, "#content_box")
                }
            })
            .catch(error => {
                console.error('Có lỗi xảy ra:', error); // Xử lý lỗi
            });
    }else {
        $("#loiCategorySVName").html("Không được để trống trường này");
    }
});
$(".remove-group-partner").click(function (){
    let checkDelete = confirm("Bạn có chắc chắn muốn xóa trạng thái này");
    if (checkDelete){
        let idStatus = $(this).attr("data-id");
        fetch(`${localdomain}/api/partner-group/delete?id=${idStatus}`, {
            method: "DELETE",
            headers : {
                "Content-Type": "application/json",
                "Authorization": `Bearer ${token}`
            }
        }).then(response => {
            if (!response.ok) {
                throw new Error(`HTTP error! status: ${response.status}`);
            }
            return response.json(); // Hoặc response.text(), response.blob(), response.arrayBuffer()
        })
            .then(data => {
                if(data.success){
                    alertGloable(data.message, "success");
                    customGetPage(`${localdomain}/group-partners/listGroup`, "#content_box")
                }else {
                    customGetPage(data.message, "false", "#content_box");
                }
            })
            .catch(error => {
                console.error('Có lỗi xảy ra:', error); // Xử lý lỗi
            });
    }
});
$(".view-partner-group").click(function () {
    $(".modal-editGroup").addClass("show");
    let idGroup = $(this).attr("data-id");
    customGetPage(`${localdomain}/group-partners/editGroup?id=${idGroup}`, "#modal-content");
});