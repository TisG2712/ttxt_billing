var headers = {
    'Content-Type': 'application/json' // Thiết lập header
}

$("#username").change(function (){
    let username = $(this).val();
    customGet(`${localdomain}/partners/checkUserName?username=${username}`, headers, null, "username");
    
})
$("#code").change(function (){
    let code = $(this).val();
    customGet(`${localdomain}/partners/checkCode?code=${code}`, headers, null, "code");
})

$("#rePassword").change(function (){
    
    let password = $("#passwords").val();
    let rePassword = $(this).val();
    console.log($(this).val())
    console.log(rePassword , password);
    if(password !== rePassword){
        $("#errorRePassword").html("Passwords do not match");
        checkPass = false;
    }else {
        $("#errorRePassword").html("");
        checkPass = true;
    }
    
})

$(document).ready(function () {
    let checkLenghtPhone1 = 0;
    const input = document.getElementById("phoneRegister");
    input.addEventListener("input", function (event) {
        this.value = this.value.replace(/[^0-9]/g, ''); // Loại bỏ ký tự không phải số
        checkLenghtPhone1 = this.value.length;
    });
});

$(".btn-updatePartnerRegister").click(function () {
    let idPart = $(this).attr("data-id");
    let checkFrom = true;
    let email = $("#email").val();
    let code = $("#code").val();
    let partnerNameRegister = $("#partnerNameRegister").val();
    let fullNameRegister = $("#fullNameRegister").val();
    let taxRegister = $("#taxRegister").val();
    let phoneRegister = $("#phoneRegister").val();
    let addressRegister = $("#addressRegister").val()
    let dateGoLive = $("#dateGoLive").val();
    let dateEndLive = $("#endLive").val();
    let username ;
    let password ;
    var dataBody;
    if($("#username").val() !== null){
        username = $("#username").val();
        password = $("#passwords").val();
       
        if (username === ""){
            checkFrom = false;
            $("#errorUsername").html("This field cannot be left blank");
        }
        if (password === ""){
            checkFrom = false;
            $("#errorRePasswords").html("This field cannot be left blank");
        }
        if (code === ""){
            checkFrom = false;
            $("#errorCodePartner").html("This field cannot be left blank");
        }
        
    }
    if (checkFrom && checkFromaAddPartner && checkPass){
        $("#errorUsername").html("");
        $("#errorRePasswords").html("");
        $("#errorCodePartner").html("");
        const formData = new FormData();
        if (!selectedFile) {
            alert('Vui lòng chọn ảnh trước!');
            return;
        }
        dataBody = JSON.stringify({
            id:idPart,
            partnerName : partnerNameRegister,
            userName : username,
            password : password,
            role : "PARTNER",
            status : "1",
            partnerCode : code,
            partnerAddress : addressRegister,
            partnerTax : taxRegister,
            partnerEmail : email,
            goLiveDate: dateGoLive,
            dateEndLive: dateEndLive,
            partnerUser : fullNameRegister,
            partnerPhone : phoneRegister
        });
        formData.append("data", dataBody.toString());
        formData.append("file", selectedFile); // Thay bằng file thực tế
        fetch(`${localdomain}/partners/updatePartner`, {
            method: "POST",
            headers :{
                "Authorization": `Bearer ${token}`
            },
            body: formData // Dữ liệu gửi đi
        }).then(response => {
            if (!response.ok) {
                if (response.status === 500) {
                    customLogout();
                }
                throw new Error('Network response was not ok');
            }
            return response.json();
        }).then(data => {
            console.log(data)
            if (data.success) {
                alertGloable(data.message, "success");
                $("#logo-dv").attr("src", `data:image/png;base64,${data.data.partnerLogo}`);
                sessionStorage.setItem("logo", data.data.partnerLogo);
            } else {
                alertGloable(data.message, "false");
            }
        })
            .catch(error => {
                console.error('There has been a problem with your fetch operation:', error);
            });
        setTimeout(reloadListService, 1100);
    }else {
        alertGloable("Gặp lỗi kiểm tra lại những trường thông tin đã nhập", "false");
    }
    
})


$(".btn-addPartnerRegister").click(function (){
    let checkFrom = true;
    let roleQuery = "";
    let parentPartner;
    let username = $("#username").val();
    let email = $("#email").val();
    let password = $("#passwords").val();
    let code = $("#code").val();
    let partnerNameRegister = $("#partnerNameRegister").val();
    let fullNameRegister = $("#fullNameRegister").val();
    let taxRegister = $("#taxRegister").val();
    let phoneRegister = $("#phoneRegister").val();
    let addressRegister = $("#addressRegister").val()
    let dateGoLive = $("#dateGoLive").val();
    if (username === ""){
        checkFrom = false;
        $("#errorUsername").html("This field cannot be left blank");
    }
    if (password === ""){
        checkFrom = false;
        $("#errorRePasswords").html("This field cannot be left blank");
    }
    if (code === ""){
        checkFrom = false;
        $("#errorCodePartner").html("This field cannot be left blank");
    }

    if (checkFrom && checkFromaAddPartner && checkPass){
        $("#errorUsername").html("");
        $("#errorRePasswords").html("");
        $("#errorCodePartner").html("");
        const formData = new FormData();
        if (!selectedFile) {
            alert('Vui lòng chọn ảnh trước!');
            return;
        }

        var dataBody = JSON.stringify({
            partnerName : partnerNameRegister,
            userName : username,
            password : password,
            role : "PARTNER",
            status : "1",
            partnerCode : code,
            partnerDetail : "dgjagd",
            partnerAddress : addressRegister,
            partnerTax : taxRegister,
            partnerEmail : email,
            goLiveDate: dateGoLive,
            partnerUser : fullNameRegister,
            partnerPhone : phoneRegister
        });
        formData.append("data", dataBody.toString());
        formData.append("file", selectedFile); // Thay bằng file thực tế
        fetch(`${localdomain}/admin_service/partner/add`, {
            method: "POST",
            headers :{
                "Authorization": `Bearer ${token}`
            },
            body: formData // Dữ liệu gửi đi
        }).then(response => {
            if (!response.ok) {
                if (response.status === 500) {
                    customLogout();
                }
                throw new Error('Network response was not ok');
            }
            return response.json();
        }).then(data => {
            console.log(data)
            if (data.success) {
                alertGloable(data.message, "success");
            } else {
                alertGloable(data.message, "false");
            }
        })
            .catch(error => {
                console.error('There has been a problem with your fetch operation:', error);
            });
        setTimeout(reloadListService, 1100);
    }else {
        alertGloable("Gặp lỗi kiểm tra lại những trường thông tin đã nhập", "false");
    }
});
function reloadListService() {
    customGetPage(`/partners/listPartner?size=${100}&page=${0}`, "#content_box");
}

$(document).ready(function () {
  $(".btn-selectService").click(function () {
        $(".box-checkbox-service").toggleClass("hien");
  });
});
$(".btn-addPartnerBack").click(function () {
    if (role === 'ADMIN'){
        customGetPage(`/partners/listPartner?size=${100}&page=${0}`, "#content_box");
    }else if (role === 'PARTNER'){
        customGetPage(`/partners/infoUser?id=${userId}&startDate=${getFirstDayOfMonth()}&endDate=${getLastDayOfMonth()}`, "#content_box");
    }
    
})
$("#info-topLeft-prev").click(function(){
    customGetPage(`/partners/listPartner?size=${100}&page=${0}`, "#content_box");
});

$(document).ready(function (){
    const imageInput = document.getElementById('imageInput');
    const imagePreview = document.getElementById('content-productCategoryImg-span');

    $(".btn-selectImg").click(function () {
        $("#imageInput").click();
    });
    imageInput.addEventListener('change', function (event) {
        const file = event.target.files[0]; // Lấy file được chọn
        if (file) {
            const reader = new FileReader();
            selectedFile = file;
            reader.addEventListener('load', function () {
                imagePreview.innerHTML = `<img src="${reader.result}" id="imgProductCategoryUpload" alt="Ảnh xem trước">`;
            });

            reader.readAsDataURL(file); // Đọc file dưới dạng URL

        } else {
            imagePreview.innerHTML = '<span>Chưa có ảnh</span>';
        }

    });
    $('#info-topLeft-prev').click(function () {
        customGetPage(`/partners/listPartner?size=${100}&page=${0}`, "#content_box");
    });
    $("#select-status").change(function (){
        let idStatus = $(this).val();
        let idPartner = $("#info-topLeft-prev").attr("data-id");
        if (idPartner !== "" && idStatus !== "") {
            fetch(`${localdomain}/api/status-partner/add`, {
                method: "POST",
                headers:{
                    "Content-Type": "application/json",
                    "Authorization": `Bearer ${token}`
                },
                body : JSON.stringify({
                    idStatus : idStatus,
                    idPartner : idPartner
                })
            }).then(res => {
                if (!res.ok){
                    console.log("res :" + res);
                }
                return res.json();
            }).then(data => {
                console.log(data);
                if (data.success){
                    alertGloable(data.message, "success");
                    getCountDevTest(1, "partnerChildLinkDevTestCount");
                    getCountDevTest(2, "partnerChildLinkDuyetCount");
                    getCountDevTest(3 , "partnerChildLinkGoliveCount");
                }else {
                    alertGloable(data.message, "false");
                }
            }).catch(err => {
                console.log(err);
            })
        }else {
            if (idPartner === ""){
                alert("Lỗi cập nhật, Không tìm thấy đơn vị ");
                return;
            }
            if (idStatus === ""){
                alert("Lỗi cập nhật, Không tìm thấy trạng thái ");
                return;
            }

        }
    });
});
