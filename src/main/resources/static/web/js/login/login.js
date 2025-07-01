$(document).ready(function () {
    console.log(sessionStorage.getItem("userName"))
    if (sessionStorage.getItem("userName")) {
        window.location.href = `${localdomain}/dashboard?idPart=`;
    }
    $("#form-login").on("submit", function (event) {
        event.preventDefault();
        let username = $("#username").val();
        let password = $("#password").val();
        var headers = {
            'Content-Type': 'application/json',
        };
        var bodyData = JSON.stringify({
            "username": username,
            "password": password
        });
        customPost(`${localdomain}/login`, headers, bodyData, "login");
    })
    
    $(".btn-login-vneid").click(function (){
        window.location.href = "https://sso-sandbox.gmedical.vn:3443/realms/gmedical/protocol/openid-connect/auth?response_type=code&client_id=sub-gmedical-sandbox-01&scope=openid&redirect_uri=http://gmedicaladmin-sandbox.gtelcds.vn/dashboard?idPart="
    });
});