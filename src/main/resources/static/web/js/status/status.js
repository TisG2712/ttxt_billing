$(".btn-addNewStatus").click(function () {
    $(".modal-addStatus").addClass("show");
});
$(".btn-close-addStatus").click(function () {
    $(".modal-addStatus").removeClass("show");
})
$(".modal-addService").click(function () {
    $(this).removeClass("show");
})
$("#modal-content1").click(function (e) {
    e.stopPropagation();
})
$(".btn-send-addStatus").click(function (event){
    let titleStatus = $("#addNameStatus").val();
    if(titleStatus !== "" && titleStatus !== null){
        fetch(`${localdomain}/api/status/add`, {
            method: "POST",
            headers : {
                "Content-Type": "application/json",
                "Authorization": `Bearer ${token}`
            },
            body: JSON.stringify({
                titleStatus : titleStatus
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
                    customGetPage(`${localdomain}/status/status`, "#content_box");
                }else {
                    alertGloable(data.message, "false");
                }
            })
            .catch(error => {
                console.error('Có lỗi xảy ra:', error); // Xử lý lỗi
            });
    }else {
        $("#loiCategorySVName").html("Không được để trống trường này");
    }
});
$(".remove-partner-service").click(function (){
    let checkDelete = confirm("Bạn có chắc chắn muốn xóa trạng thái này");
    if (checkDelete){
        let idStatus = $(this).attr("data-id");
        fetch(`${localdomain}/api/status/delete?id=${idStatus}`, {
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
                    customGetPage(`${localdomain}/status/status`, "#content_box");
                }else {
                    alertGloable(data.message, "false");
                }
            })
            .catch(error => {
                console.error('Có lỗi xảy ra:', error); // Xử lý lỗi
            });
    }
});
$(".view-status").click(function () {
    $(".modal-editStatus").addClass("show");
    let idService = $(this).attr("data-id");
    customGetPage(`${localdomain}/status/editStatus?id=${idService}`, "#modal-content");
});