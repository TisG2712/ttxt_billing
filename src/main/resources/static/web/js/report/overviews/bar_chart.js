$(document).ready(function () {
  // Dashboard tổng quan về Trạng Thái Dịch Vụ
  const ctx1 = document.getElementById('serviceStatusChart');
  if (ctx1) {
    const serviceStatusChart = new Chart(ctx1.getContext('2d'), {
      type: 'bar',
      data: {
        labels: ['Đang hoạt động', 'Tạm ngưng', 'Lỗi', 'Bảo trì'],
        datasets: [{
          label: 'Số lượng dịch vụ',
          data: [120, 30, 10, 15],
          backgroundColor: [
            'rgba(75, 192, 192, 0.7)',
            'rgba(255, 206, 86, 0.7)',
            'rgba(255, 99, 132, 0.7)',
            'rgba(153, 102, 255, 0.7)'
          ],
          borderColor: [
            'rgba(75, 192, 192, 1)',
            'rgba(255, 206, 86, 1)',
            'rgba(255, 99, 132, 1)',
            'rgba(153, 102, 255, 1)'
          ],
          borderWidth: 1
        }]
      },
      options: {
        responsive: true,
        maintainAspectRatio: false,
        scales: {
          y: {
            beginAtZero: true,
            title: {
              display: true,
              text: 'Số lượng (dịch vụ)'
            }
          },
          x: {
            title: {
              display: true,
              text: 'Trạng thái dịch vụ'
            }
          }
        },
        plugins: {
          legend: {
            display: false
          },
          tooltip: {
            callbacks: {
              label: context => `${context.parsed.y} dịch vụ`
            }
          }
        }
      }
    });
  }
// Dashboard tổng quan về Bảo Mật
  const ctx2 = document.getElementById('securityChart');
  if (ctx2) {
    const securityChart = new Chart(ctx2.getContext('2d'), {
      type: 'bar',
      data: {
        labels: ['Xâm nhập', 'DDoS', 'Lỗi xác thực', 'Truy cập trái phép', 'Malware'],
        datasets: [{
          label: 'Số sự cố',
          data: [5, 3, 8, 2, 6],
          backgroundColor: [
            'rgba(255, 99, 132, 0.7)',
            'rgba(54, 162, 235, 0.7)',
            'rgba(255, 206, 86, 0.7)',
            'rgba(75, 192, 192, 0.7)',
            'rgba(153, 102, 255, 0.7)'
          ],
          borderColor: [
            'rgba(255, 99, 132, 1)',
            'rgba(54, 162, 235, 1)',
            'rgba(255, 206, 86, 1)',
            'rgba(75, 192, 192, 1)',
            'rgba(153, 102, 255, 1)'
          ],
          borderWidth: 1
        }]
      },
      options: {
        responsive: true,
        maintainAspectRatio: false,
        scales: {
          y: {
            beginAtZero: true,
            title: {
              display: true,
              text: 'Số lượng (sự cố)'
            }
          },
          x: {
            title: {
              display: true,
              text: 'Loại sự cố'
            }
          }
        },
        plugins: {
          legend: {
            display: false
          },
          tooltip: {
            callbacks: {
              label: context => `${context.parsed.y} sự cố`
            }
          }
        }
      }
    });
  }
  // Dashboard tổng quan về Hiệu Suất Cơ Sở Dữ Liệu
  const ctx3 = document.getElementById('dbPerformanceChart');
  if (ctx3) {
    const dbPerformanceChart = new Chart(ctx3.getContext('2d'), {
      type: 'bar',
      data: {
        labels: ['Query Time', 'Connections', 'Cache Hit (%)', 'CPU (%)', 'Storage Used (%)'],
        datasets: [{
          label: 'Chỉ số hiệu suất',
          data: [1.8, 120, 89, 65, 75], // dữ liệu mẫu
          backgroundColor: [
            'rgba(54, 162, 235, 0.7)',   // Query Time
            'rgba(255, 206, 86, 0.7)',   // Connections
            'rgba(75, 192, 192, 0.7)',   // Cache Hit
            'rgba(255, 99, 132, 0.7)',   // CPU
            'rgba(153, 102, 255, 0.7)'   // Storage
          ],
          borderColor: [
            'rgba(54, 162, 235, 1)',
            'rgba(255, 206, 86, 1)',
            'rgba(75, 192, 192, 1)',
            'rgba(255, 99, 132, 1)',
            'rgba(153, 102, 255, 1)'
          ],
          borderWidth: 1
        }]
      },
      options: {
        responsive: true,
        maintainAspectRatio: false,
        scales: {
          y: {
            beginAtZero: true,
            title: {
              display: true,
              text: 'Giá trị chỉ số'
            }
          },
          x: {
            title: {
              display: true,
              text: 'Thông số hiệu suất'
            }
          }
        },
        plugins: {
          legend: {
            display: false
          },
          tooltip: {
            callbacks: {
              label: context => {
                const label = context.label;
                const value = context.parsed.y;
                if (label.includes('%')) {
                  return `${label}: ${value}%`;
                } else if (label === 'Query Time') {
                  return `${label}: ${value}s`;
                } else {
                  return `${label}: ${value}`;
                }
              }
            }
          }
        }
      }
    });
  }


});