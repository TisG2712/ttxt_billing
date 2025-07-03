$(document).ready(function() {
        // Sửa thành class đúng của nút bạn dùng
        $(".btn-addNewUserGroup").click(function() {
            // Cách đúng để mở modal trong Bootstrap 5
            var myModal = new bootstrap.Modal(document.getElementById('modalUserGroup'));
            myModal.show();
        });

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
});
