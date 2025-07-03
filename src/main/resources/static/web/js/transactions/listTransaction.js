$(document).ready(function () {
    if (role === "ADMIN") {
    
    } else if (role === "PARTNER") {
        $(".admin_role").addClass("an")
        $("#box-partnerName").addClass("an");
    }
    document.getElementById("startDateWeek").addEventListener("change", function () {
        const startOfWeek = new Date(this.value);
        const endOfWeek = new Date(startOfWeek);
        endOfWeek.setDate(startOfWeek.getDate() + 6);
        const endDate = endOfWeek.toISOString().split("T")[0];
        document.getElementById("endDateWeek").value = endDate;
    });
    $("#startDate").attr("value", getConvertLocalDateTimeNew2(getFirstDayOfMonth()));
    $("#endDate").attr("value", getConvertLocalDateTimeNew2(getLastDayOfMonth()));
    $("#findDate").attr("value", getCurrentLocalDateTime());
    $("#startDateWeek").attr("value", dautuanht());
    $("#endDateWeek").attr("value", cuoituanht());
    $(".nextPageTransaction").click(function () {
        let size = $(this).attr("data-size");
        let page = $(this).attr("data-page");
        let startDateFrom = null;
        let endDateFrom = null;
        let startDate = null;
        let endDate = null;
        let partnerCode = $("#partnerName").val();
        let statusPartner = $("#statusPartner").val();
        let findTypeTransaction = $("#findTypeTransaction").val();
        switch (findTypeTransaction) {
            case "optional" :
                startDateFrom = $("#startDate").val();
                endDateFrom = $("#endDate").val();
                startDate = getConvertLocalDateTimeNew(startDateFrom);
                endDate = getConvertLocalDateTimeNew(endDateFrom);
                break;
            case "week" :
                startDate = $("#startDateWeek").val() + "T00:00:00";
                endDate = $("#endDateWeek").val() + "T00:00:00";
                break;
            
        }
        if (role === "ADMIN") {
            customGetPage(`${localdomain}/transactions/loadTransaction?id=&startDate=${startDate}&endDate=${endDate}&page=${page}&size=${size}&status=${statusPartner}&partnerCode=${partnerCode}`, "#loadTransaction")
        } else if (role === "PARTNER") {
            customGetPage(`${localdomain}/transactions/loadTransaction?id=${userId}&startDate=${startDate}&endDate=${endDate}&page=${page}&size=${size}&status=${statusPartner}&partnerCode=${partnerCode}`, "#loadTransaction")
        }
    })
    
    $(".prevPageTransaction").click(function () {
        let size = $(this).attr("data-size");
        let page = $(this).attr("data-page");
        let startDateFrom = null;
        let endDateFrom = null;
        let startDate = null;
        let endDate = null;
        let partnerCode = $("#partnerName").val();
        let statusPartner = $("#statusPartner").val();
        let findTypeTransaction = $("#findTypeTransaction").val();
        switch (findTypeTransaction) {
            case "optional" :
                startDateFrom = $("#startDate").val();
                endDateFrom = $("#endDate").val();
                startDate = getConvertLocalDateTimeNew(startDateFrom);
                endDate = getConvertLocalDateTimeNew(endDateFrom);
                break;
            case "week" :
                startDate = $("#startDateWeek").val() + "T00:00:00";
                endDate = $("#endDateWeek").val() + "T00:00:00";
                break;
            
        }
        if (role === "ADMIN") {
            customGetPage(`${localdomain}/transactions/loadTransaction?id=&startDate=${startDate}&endDate=${endDate}&page=${page}&size=${size}&status=${statusPartner}&partnerCode=${partnerCode}`, "#loadTransaction")
        } else if (role === "PARTNER") {
            customGetPage(`${localdomain}/transactions/loadTransaction?id=${userId}&startDate=${startDate}&endDate=${endDate}&page=${page}&size=${size}&status=${statusPartner}&partnerCode=${partnerCode}`, "#loadTransaction")
        }
        
    })
    $(".btn-timkiemTransaction").click(function () {
        let startDateFrom = null;
        let endDateFrom = null;
        let startDate = null;
        let endDate = null;
        let partnerCode = $("#partnerName").val();
        let statusPartner = $("#statusPartner").val();
        let findTypeTransaction = $("#findTypeTransaction").val();
        switch (findTypeTransaction) {
            case "optional" :
                startDateFrom = $("#startDate").val();
                endDateFrom = $("#endDate").val();
                startDate = getConvertLocalDateTimeNew(startDateFrom);
                endDate = getConvertLocalDateTimeNew(endDateFrom);
                break;
            case "week" :
                startDate = $("#startDateWeek").val() + "T00:00:00";
                endDate = $("#endDateWeek").val() + "T00:00:00";
                break;
            
        }
        if (role === "ADMIN") {
            customGetPage(`${localdomain}/transactions/loadTransaction?startDate=${startDate}&endDate=${endDate}&page=0&size=10&status=${statusPartner}&partnerCode=${partnerCode}&id=`, "#loadTransaction");
            
        } else if (role === "PARTNER") {
            customGetPage(`${localdomain}/transactions/loadTransaction?startDate=${startDate}&endDate=${endDate}&page=0&size=10&status=${statusPartner}&partnerCode=${partnerCode}&id=${userId}`, "#loadTransaction")
        }
        
    });
    
    $(".btn-exportData").click(async function () {
        const loadingSpinner = document.getElementById('loading-spinner');
        loadingSpinner.style.display = 'flex';
        let startDateFrom = null;
        let endDateFrom = null;
        let startDate = null;
        let endDate = null;
        let partnerCode = $("#partnerName").val();
        let statusPartner = $("#statusPartner").val();
        let findTypeTransaction = $("#findTypeTransaction").val();
        switch (findTypeTransaction) {
            case "optional" :
                startDateFrom = $("#startDate").val();
                endDateFrom = $("#endDate").val();
                startDate = getConvertLocalDateTimeNew(startDateFrom);
                endDate = getConvertLocalDateTimeNew(endDateFrom);
                break;
            case "week" :
                startDate = $("#startDateWeek").val() + "T00:00:00";
                endDate = $("#endDateWeek").val() + "T00:00:00";
                break;

        }
        if (role === "ADMIN") {
            try {
                const response = await fetch(`${localdomain}/reports/exportDataTransaction?startDate=${startDate}&endDate=${endDate}&page=0&size=10&status=${statusPartner}&partnerCode=${partnerCode}&id=`,
                    {
                        method: 'GET',
                        headers: {
                            'Authorization': `Bearer ${token}`
                        }
                    }
                );
                if (!response.ok) throw new Error("Lỗi khi tải file!");
                const blob = await response.blob();
                const url = window.URL.createObjectURL(blob);

                // Tạo link ảo để tải file
                const a = document.createElement("a");
                a.href = url;
                a.download = "report.xlsx";
                document.body.appendChild(a);
                a.click();
                document.body.removeChild(a);
                window.URL.revokeObjectURL(url);

            } catch (error) {
                console.error("Lỗi:", error);
                alert("Không thể tải file Excel!");
            } finally {
                loadingSpinner.style.display = "none"; // Ẩn loading khi hoàn tất
            }
        } else if (role === "PARTNER") {

            try {
                const response = await fetch(`${localdomain}/reports/exportDataTransaction?startDate=${startDate}&endDate=${endDate}&page=0&size=10&status=${statusPartner}&partnerCode=${partnerCode}&id=${userId}`,
                    {
                        method: 'GET',
                        headers: {
                            'Authorization': `Bearer ${token}`
                        }
                    });
                if (!response.ok) throw new Error("Lỗi khi tải file!");
                const blob = await response.blob();
                const url = window.URL.createObjectURL(blob);

                // Tạo link ảo để tải file
                const a = document.createElement("a");
                a.href = url;
                a.download = "report.xlsx";
                document.body.appendChild(a);
                a.click();
                document.body.removeChild(a);
                window.URL.revokeObjectURL(url);

            } catch (error) {
                console.error("Lỗi:", error);
                alert("Không thể tải file Excel!");
            } finally {
                loadingSpinner.style.display = "none"; // Ẩn loading khi hoàn tất
            }
        }

    });
    
    $(".view-transaction").click(function () {
        let transactionId = $(this).attr("data-id");
        $("#info-transaction-box").addClass("hien");
        customGetPage(`${localdomain}/transactions/load-info-transaction?transactionId=${transactionId}`, "#info-transaction-box");
    });
    
    $("#partnerName").keyup(function () {
        let valuePartnerName = $(this).val();
        customGetPage(`${localdomain}/partners/valuePartnerName?valuePartnerName=${valuePartnerName}`, "#box-searchPartner");
    });
    
    $("#findTypeTransaction").change(function () {
        let id = $(this).val();
        switch (id) {
            
            case "week":
                $(`#week`).addClass("active");
                $(`#optional`).removeClass("active");
                break;
            case "optional":
                $(`#optional`).addClass("active");
                $(`#week`).removeClass("active");
                
                break;
            default:
                $(`#week`).removeClass("active");
                $(`#optional`).removeClass("active");
                break;
        }
        
        
    })
    $(".inputPage").change(function () {
        let page = $(this).val();
        let size = "10";
        let startDateFrom = null;
        let endDateFrom = null;
        let startDate = null;
        let endDate = null;
        let partnerCode = $("#partnerName").val();
        let statusPartner = $("#statusPartner").val();
        let findTypeTransaction = $("#findTypeTransaction").val();
        switch (findTypeTransaction) {
            case "optional" :
                startDateFrom = $("#startDate").val();
                endDateFrom = $("#endDate").val();
                startDate = getConvertLocalDateTimeNew(startDateFrom);
                endDate = getConvertLocalDateTimeNew(endDateFrom);
                break;
            case "week" :
                startDate = $("#startDateWeek").val() + "T00:00:00";
                endDate = $("#endDateWeek").val() + "T00:00:00";
                break;
            
        }
        if (role === "ADMIN") {
            customGetPage(`${localdomain}/transactions/loadTransaction?id=&startDate=${startDate}&endDate=${endDate}&page=${page}&size=${size}&status=${statusPartner}&partnerCode=${partnerCode}`, "#loadTransaction")
        } else if (role === "PARTNER") {
            customGetPage(`${localdomain}/transactions/loadTransaction?id=${userId}&startDate=${startDate}&endDate=${endDate}&page=${page}&size=${size}&status=${statusPartner}&partnerCode=${partnerCode}`, "#loadTransaction")
        }
    });
    
    $("#endDate").datetimepicker({
        dateFormat: "dd/mm/yy",
        timeFormat: "HH:mm:ss",
        changeMonth: true,
        changeYear: true,
        showButtonPanel: true,
        showSecond: true
    });
    $("#startDate").datetimepicker({
        dateFormat: "dd/mm/yy",
        timeFormat: "HH:mm:ss",
        changeMonth: true,
        changeYear: true,
        showButtonPanel: true,
        showSecond: true
    });
});