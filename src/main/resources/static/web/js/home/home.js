$(document).ready(function () {
    if (username == null || username === "undefined") {
        backLogin();
    }else {
        customGetPage(`${localdomain}/admin/navLeft`, "#left-side-menu");
    }
    if (role === "ADMIN"){
        customGetPage(`${localdomain}/admin/dashboard?idPart=`, "#content_box");
    }else if(role === "PARTNER"){
        $("#logo-dv").attr("src", `data:image/png;base64,${logo}`);
        customGetPage(`${localdomain}/admin/dashboardUser?userId=${userId}&startDate=${getFirstDayOfMonth()}&endDate=${getLastDayOfMonth()}`, "#content_box");
    }
});