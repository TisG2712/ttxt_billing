$(document).ready(function () {
  // Biểu đồ 1: Log & Lỗi
  const canvas1 = document.getElementById('logErrorChart');
  if (canvas1) {
    const ctx1 = canvas1.getContext('2d');
    const logErrorChart = new Chart(ctx1, {
      type: 'pie',
      data: {
        labels: ['Error', 'Warning', 'Info', 'Debug'],
        datasets: [{
          label: 'Tỷ lệ log',
          data: [40, 25, 20, 15],
          backgroundColor: [
            'rgba(255, 99, 132, 0.7)',
            'rgba(255, 206, 86, 0.7)',
            'rgba(54, 162, 235, 0.7)',
            'rgba(153, 102, 255, 0.7)'
          ],
          borderColor: [
            'rgba(255, 99, 132, 1)',
            'rgba(255, 206, 86, 1)',
            'rgba(54, 162, 235, 1)',
            'rgba(153, 102, 255, 1)'
          ],
          borderWidth: 1
        }]
      },
      options: {
        responsive: true,
        plugins: {
          legend: { position: 'bottom' },
          tooltip: {
            callbacks: {
              label: context => {
                const label = context.label || '';
                const value = context.parsed;
                return `${label}: ${value}%`;
              }
            }
          }
        }
      }
    });
  }

  // Biểu đồ 2: Người dùng & Tương tác
  const canvas2 = document.getElementById('userInteractionChart');
  if (canvas2) {
    const ctx2 = canvas2.getContext('2d');
    const userInteractionChart = new Chart(ctx2, {
      type: 'doughnut',
      data: {
        labels: ['Người dùng hoạt động', 'Người dùng không hoạt động', 'Người dùng mới', 'Khách truy cập'],
        datasets: [{
          label: 'Tỷ lệ người dùng',
          data: [45, 25, 20, 10],
          backgroundColor: [
            'rgba(75, 192, 192, 0.7)',
            'rgba(201, 203, 207, 0.7)',
            'rgba(255, 159, 64, 0.7)',
            'rgba(255, 205, 86, 0.7)'
          ],
          borderColor: [
            'rgba(75, 192, 192, 1)',
            'rgba(201, 203, 207, 1)',
            'rgba(255, 159, 64, 1)',
            'rgba(255, 205, 86, 1)'
          ],
          borderWidth: 1
        }]
      },
      options: {
        responsive: true,
        plugins: {
          legend: { position: 'bottom' },
          tooltip: {
            callbacks: {
              label: context => {
                const label = context.label || '';
                const value = context.parsed;
                return `${label}: ${value}%`;
              }
            }
          }
        }
      }
    });
  }
});