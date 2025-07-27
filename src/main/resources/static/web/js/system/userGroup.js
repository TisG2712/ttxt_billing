$(document).ready(function() {
        // Sửa thành class đúng của nút bạn dùng
        /*
        $(".btn-addNewUserGroup").click(function() {
            // Cách đúng để mở modal trong Bootstrap 5
            var myModal = new bootstrap.Modal(document.getElementById('modalUserGroup'));
            myModal.show();
        });
        */
        $(".btn-addNewUserGroup").click(function() {
           $(".modal-addService").addClass("show")
        });
        $(".btn-close-addService").click(function () {
            $(".modal-addService").removeClass("show");
        })
        $(".modal-addService").click(function () {
            $(this).removeClass("show");
        })
        $("#modal-content1").click(function (e) {
            e.stopPropagation();
        })

        // Nút edit chỉnh sửa pop-up
        $(".edit-icon").click(function() {
            $(".modal-editUserGroup").addClass("show")
        });
        $("btn-close-editUserGroup").click(function() {
            $(".modal-editUserGroup").removeClass("show")
        });
        $(".modal-editUserGroup").click(function () {
            $(this).removeClass("show");
        })
        $("#modal-content1").click(function (e) {
            e.stopPropagation();
        })

        // Lắng nghe sự kiện click cho tất cả nút
        document.querySelectorAll('.updateStatus').forEach(button => {
          // Lấy ID của nút (để làm key lưu vào localStorage)
          const itemId = button.getAttribute('data-id');

          // Kiểm tra nếu đã có trạng thái lưu trước đó => Cập nhật giao diện
          const savedStatus = localStorage.getItem(`toggleState_${itemId}`);
          if (savedStatus) {
            button.setAttribute('data-status', savedStatus);
            button.classList.toggle('fa-toggle-off', savedStatus === '0');
            button.classList.toggle('fa-toggle-on', savedStatus === '1');
          }

          // Xử lý khi click
          button.addEventListener('click', function() {
            const currentStatus = this.getAttribute('data-status');
            const newStatus = currentStatus === '0' ? '1' : '0';

            // Cập nhật giao diện
            this.setAttribute('data-status', newStatus);
            this.classList.toggle('fa-toggle-off');
            this.classList.toggle('fa-toggle-on');

            // Lưu vào localStorage
            localStorage.setItem(`toggleState_${itemId}`, newStatus);
          });
        });

        // Sự kiện cho icon xóa thông tin

          const trashIcons = document.querySelectorAll('.fa-trash');

          trashIcons.forEach(function(icon) {
            icon.addEventListener('click', function() {
              if (confirm("Bạn có chắc chắn muốn xóa không?")) {
                console.log("Xóa dữ liệu...");
                // Ví dụ: icon.parentElement.remove(); // nếu muốn xóa phần tử cha chứa icon
              } else {
                console.log("Hủy xóa.");
              }
            });
          });
});
