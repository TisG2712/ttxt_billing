$(document).ready(function () {
    $(".btn-close-popup-list-group").click(function () {
        $("#box-partner-item").removeClass("active");
    });

    $(".btn-add-partner-to-group").click(function () {
        let arr;
        let iGroup = $(this).attr("data-idGroup");
        getCheckedValues();


        function getCheckedValues() {
            const checkboxes = document.querySelectorAll('input[name="option"]:checked');
            let checkedValues = [];
            checkboxes.forEach((checkbox) => {
                checkedValues.push(checkbox.value);
            });
            arr = checkedValues;
        }
        var header = {
            "Content-type": "application/json"
        }
        var bodyData = JSON.stringify({

            "idGroup": iGroup,
            "data": arr
        })
        fetch(`${localdomain}/api/partner-to-group/addCategoryPartToGroup`, {
            method: "POST",
            headers: header,
            body: bodyData // Dữ liệu gửi đi
        }).then(response => {
            if (!response.ok) {
                if (response.status === 500) {
                    customLogout();
                }
                throw new Error('Network response was not ok');
            }
            return response.json();
        }).then(data => {
            console.log(data);
            if (data.success) {
                alertGloable(data.message, "success");
                router(`/partners/listGroupPartner?idGroup=${iGroup}&size=${100}&page=${0}`);
                getCountGroupPartner(iGroup, `group-` + iGroup);
            } else {
                alertGloable(data.message, "false");
            }
        })
            .catch(error => {
                console.error('There has been a problem with your fetch operation:', error);
            });
    })
});