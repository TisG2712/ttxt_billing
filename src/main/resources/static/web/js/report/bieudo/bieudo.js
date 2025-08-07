// Biểu đồ trạng thái dịch vụ môi trường kiểm thử
$(document).ready(function () {
  const testEnvChartEl = document.getElementById('testEnvServiceStatus');
  if (testEnvChartEl) {
    const testEnvCtx = testEnvChartEl.getContext('2d');

    const testEnvServiceStatusChart = new Chart(testEnvCtx, {
      type: 'bar',
      data: {
        labels: ['Service A', 'Service B', 'Service C', 'Service D'],
        datasets: [{
          label: 'Số lần hoạt động theo trạng thái',
          data: [12, 19, 8, 14],
          backgroundColor: [
            'rgba(75, 192, 192, 0.6)',
            'rgba(54, 162, 235, 0.6)',
            'rgba(255, 206, 86, 0.6)',
            'rgba(255, 99, 132, 0.6)'
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
              text: 'Số lần hoạt động'
            }
          },
          x: {
            title: {
              display: true,
              text: 'Dịch vụ kiểm thử'
            }
          }
        },
        plugins: {
          legend: {
            display: false
          },
          tooltip: {
            callbacks: {
              label: function (ctx) {
                return ` ${ctx.dataset.label}: ${ctx.parsed.y}`;
              }
            }
          }
        }
      }
    });
  }
});
// Biểu đồ trạng thái dịch vụ môi trường vận hành
$(document).ready(function () {
  const proEnvChartEl = document.getElementById('proEnvServiceStatus');
  if (proEnvChartEl) {
    const proEnvCtx = proEnvChartEl.getContext('2d');

    const proEnvServiceStatusChart = new Chart(proEnvCtx, {
      type: 'doughnut',
      data: {
        labels: ['Đang chạy', 'Ngưng hoạt động', 'Bảo trì'],
        datasets: [{
          label: 'Trạng thái dịch vụ',
          data: [60, 25, 15], // Bạn có thể thay đổi số liệu cho phù hợp
          backgroundColor: [
            'rgba(75, 192, 192, 0.7)',
            'rgba(255, 99, 132, 0.7)',
            'rgba(255, 206, 86, 0.7)'
          ],
          borderColor: [
            'rgba(75, 192, 192, 1)',
            'rgba(255, 99, 132, 1)',
            'rgba(255, 206, 86, 1)'
          ],
          borderWidth: 1
        }]
      },
      options: {
        responsive: true,
        maintainAspectRatio: false,
        plugins: {
          legend: {
            position: 'bottom'
          },
          tooltip: {
            callbacks: {
              label: function (ctx) {
                let label = ctx.label || '';
                let value = ctx.parsed;
                return ` ${label}: ${value}%`;
              }
            }
          }
        }
      }
    });
  }
});
// Biểu đồ các đơn vị chia sẻ nhiều dịch vụ nhất
$(document).ready(function () {
  const topSharingEl = document.getElementById('topSharingOrganizations');
  if (topSharingEl) {
    const ctx = topSharingEl.getContext('2d');

    const topSharingOrganizationsChart = new Chart(ctx, {
      type: 'line',
      data: {
        labels: ['Đơn vị A', 'Đơn vị B', 'Đơn vị C', 'Đơn vị D', 'Đơn vị E'], // Tên đơn vị
        datasets: [{
          label: 'Số lượng dịch vụ chia sẻ',
          data: [45, 30, 25, 20, 15], // Số lượng dịch vụ từng đơn vị chia sẻ
          fill: false,
          borderColor: 'rgba(75, 192, 192, 1)',
          backgroundColor: 'rgba(75, 192, 192, 0.2)',
          tension: 0.3, // Độ cong của đường line
          pointRadius: 5,
          pointHoverRadius: 7,
        }]
      },
      options: {
        responsive: true,
        maintainAspectRatio: false,
        plugins: {
          legend: {
            position: 'top'
          },
          tooltip: {
            callbacks: {
              label: function (ctx) {
                return `${ctx.dataset.label}: ${ctx.parsed.y} dịch vụ`;
              }
            }
          }
        },
        scales: {
          y: {
            beginAtZero: true,
            title: {
              display: true,
              text: 'Số dịch vụ'
            }
          },
          x: {
            title: {
              display: true,
              text: 'Đơn vị'
            }
          }
        }
      }
    });
  }
});


$(document).ready(function () {
  const topIntegratedEl = document.getElementById('topIntegratedServices');
  if (topIntegratedEl) {
    const ctx = topIntegratedEl.getContext('2d');

    const topIntegratedServicesChart = new Chart(ctx, {
      type: 'line', // Area Chart = line chart + fill: true
      data: {
        labels: ['Dịch vụ A', 'Dịch vụ B', 'Dịch vụ C', 'Dịch vụ D', 'Dịch vụ E'], // Tên dịch vụ
        datasets: [{
          label: 'Số hệ thống tích hợp',
          data: [50, 40, 30, 25, 20], // Số lượng tích hợp
          fill: true,
          backgroundColor: 'rgba(153, 102, 255, 0.2)',  // Vùng được tô
          borderColor: 'rgba(153, 102, 255, 1)',         // Viền line
          tension: 0.4,
          pointRadius: 5,
          pointHoverRadius: 7
        }]
      },
      options: {
        responsive: true,
        maintainAspectRatio: false,
        plugins: {
          legend: {
            position: 'top'
          },
          tooltip: {
            callbacks: {
              label: function (ctx) {
                return `${ctx.dataset.label}: ${ctx.parsed.y} hệ thống`;
              }
            }
          }
        },
        scales: {
          y: {
            beginAtZero: true,
            title: {
              display: true,
              text: 'Số lượng tích hợp'
            }
          },
          x: {
            title: {
              display: true,
              text: 'Dịch vụ'
            }
          }
        }
      }
    });
  }
});

$(document).ready(function () {
  const topUsingEl = document.getElementById('topUsingOrganizations');
  if (topUsingEl) {
    const ctx = topUsingEl.getContext('2d');

    const topUsingOrganizationsChart = new Chart(ctx, {
      type: 'line', // Area Chart dạng spline
      data: {
        labels: ['Tháng 1', 'Tháng 2', 'Tháng 3', 'Tháng 4', 'Tháng 5', 'Tháng 6'],
        datasets: [
          {
            label: 'Đơn vị A',
            data: [40, 50, 60, 55, 70, 80],
            fill: true,
            backgroundColor: 'rgba(255, 99, 132, 0.2)',
            borderColor: 'rgba(255, 99, 132, 1)',
            tension: 0.5, // Tension tạo spline
            pointRadius: 4
          },
          {
            label: 'Đơn vị B',
            data: [30, 35, 45, 50, 55, 60],
            fill: true,
            backgroundColor: 'rgba(54, 162, 235, 0.2)',
            borderColor: 'rgba(54, 162, 235, 1)',
            tension: 0.5,
            pointRadius: 4
          }
        ]
      },
      options: {
        responsive: true,
        maintainAspectRatio: false,
        plugins: {
          legend: {
            position: 'top'
          },
          tooltip: {
            callbacks: {
              label: function (ctx) {
                return `${ctx.dataset.label}: ${ctx.parsed.y} lượt sử dụng`;
              }
            }
          }
        },
        scales: {
          y: {
            beginAtZero: true,
            title: {
              display: true,
              text: 'Số lượt sử dụng'
            }
          },
          x: {
            title: {
              display: true,
              text: 'Thời gian (tháng)'
            }
          }
        }
      }
    });
  }
});

$(document).ready(function () {
  const usageEl = document.getElementById('serviceUsageOverTime');
  if (usageEl) {
    const ctx = usageEl.getContext('2d');

    const serviceUsageOverTimeChart = new Chart(ctx, {
      type: 'line',
      data: {
        labels: ['Tháng 1', 'Tháng 2', 'Tháng 3', 'Tháng 4', 'Tháng 5', 'Tháng 6'],
        datasets: [
          {
            label: 'Dịch vụ A',
            data: [20, 30, 45, 60, 70, 80],
            fill: true,
            backgroundColor: 'rgba(75, 192, 192, 0.4)',
            borderColor: 'rgba(75, 192, 192, 1)',
            tension: 0.4,
            stack: 'stack1'
          },
          {
            label: 'Dịch vụ B',
            data: [10, 15, 25, 35, 45, 50],
            fill: true,
            backgroundColor: 'rgba(255, 159, 64, 0.4)',
            borderColor: 'rgba(255, 159, 64, 1)',
            tension: 0.4,
            stack: 'stack1'
          },
          {
            label: 'Dịch vụ C',
            data: [5, 10, 15, 20, 25, 30],
            fill: true,
            backgroundColor: 'rgba(153, 102, 255, 0.4)',
            borderColor: 'rgba(153, 102, 255, 1)',
            tension: 0.4,
            stack: 'stack1'
          }
        ]
      },
      options: {
        responsive: true,
        maintainAspectRatio: false,
        interaction: {
          mode: 'index',
          intersect: false
        },
        plugins: {
          legend: {
            position: 'top'
          },
          tooltip: {
            mode: 'index',
            intersect: false
          }
        },
        scales: {
          x: {
            stacked: true,
            title: {
              display: true,
              text: 'Thời gian (tháng)'
            }
          },
          y: {
            stacked: true,
            beginAtZero: true,
            title: {
              display: true,
              text: 'Số lượt sử dụng'
            }
          }
        }
      }
    });
  }
});


$(document).ready(function () {
  const lineEl = document.getElementById('topRequestedServices');
  if (lineEl) {
    const ctx = lineEl.getContext('2d');

    const topRequestedServicesChart = new Chart(ctx, {
      type: 'line',
      data: {
        labels: ['Tháng 1', 'Tháng 2', 'Tháng 3', 'Tháng 4', 'Tháng 5', 'Tháng 6'],
        datasets: [
          {
            label: 'Dịch vụ A',
            data: [120, 150, 170, 130, 180, 200],
            borderColor: 'rgba(75, 192, 192, 1)',
            borderWidth: 2,
            borderDash: [10, 5],
            fill: false,
            tension: 0.4,
            pointRadius: 4
          },
          {
            label: 'Dịch vụ B',
            data: [90, 110, 95, 140, 160, 170],
            borderColor: 'rgba(255, 99, 132, 1)',
            borderWidth: 2,
            borderDash: [6, 4],
            fill: false,
            tension: 0.4,
            pointRadius: 4
          }
        ]
      },
      options: {
        responsive: true,
        maintainAspectRatio: false,
        plugins: {
          legend: {
            position: 'bottom'
          },
          title: {
            display: true,
            text: 'Top dịch vụ có yêu cầu sử dụng nhiều nhất'
          }
        },
        scales: {
          y: {
            beginAtZero: true,
            title: {
              display: true,
              text: 'Số yêu cầu'
            }
          },
          x: {
            title: {
              display: true,
              text: 'Thời gian (tháng)'
            }
          }
        }
      }
    });
  }
});


$(document).ready(function () {
  const usageRatioEl = document.getElementById('usageRatioBetweenOrganizations');
  if (usageRatioEl) {
    const ctx = usageRatioEl.getContext('2d');

    const usageRatioChart = new Chart(ctx, {
      type: 'bar',
      data: {
        labels: [
          'Sở Tài chính',
          'Sở Y tế',
          'Sở Giáo dục',
          'Sở GTVT',
          'Sở Công Thương'
        ],
        datasets: [{
          label: 'Tỷ lệ sử dụng (%)',
          data: [30, 50, 40, 20, 60],
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
          borderWidth: 1,
          categoryPercentage: 1.0,
          barPercentage: 0.6
        }]
      },
      options: {
        responsive: true,
        maintainAspectRatio: false,
        plugins: {
          legend: {
            display: false
          },
          tooltip: {
            callbacks: {
              label: function(context) {
                return `Tỷ lệ: ${context.parsed.y}%`;
              }
            }
          }
        },
        scales: {
          x: {
            title: {
              display: true,
              text: 'Đơn vị'
            }
          },
          y: {
            beginAtZero: true,
            max: 100,
            title: {
              display: true,
              text: 'Tỷ lệ (%)'
            }
          }
        }
      }
    });
  }
});

$(document).ready(function () {
  const mixChartEl = document.getElementById('requestRatioByStatus');
  if (mixChartEl) {
    const ctx = mixChartEl.getContext('2d');

    const requestRatioByStatusChart = new Chart(ctx, {
      data: {
        labels: ['Thành công', 'Đang xử lý', 'Lỗi', 'Từ chối'],
        datasets: [
          {
            type: 'bar',
            label: 'Số lượng yêu cầu',
            data: [1500, 700, 300, 100],
            backgroundColor: 'rgba(54, 162, 235, 0.7)',
            borderColor: 'rgba(54, 162, 235, 1)',
            borderWidth: 1,
            yAxisID: 'y',
          },
          {
            type: 'line',
            label: 'Tỷ lệ (%)',
            data: [65, 20, 10, 5],
            borderColor: 'rgba(255, 99, 132, 1)',
            backgroundColor: 'rgba(255, 99, 132, 0.2)',
            fill: true,
            yAxisID: 'y1',
            tension: 0.3,
            pointRadius: 4,
            pointHoverRadius: 6
          }
        ]
      },
      options: {
        responsive: true,
        maintainAspectRatio: false,
        interaction: {
          mode: 'index',
          intersect: false
        },
        stacked: false,
        plugins: {
          tooltip: {
            callbacks: {
              label: function(context) {
                return context.dataset.label + ': ' + context.parsed.y + (context.dataset.label.includes('%') ? '%' : '');
              }
            }
          },
          legend: {
            position: 'top'
          },
          title: {
            display: true,
            text: 'Tỷ lệ yêu cầu dịch vụ theo trạng thái'
          }
        },
        scales: {
          y: {
            type: 'linear',
            position: 'left',
            title: {
              display: true,
              text: 'Số lượng'
            },
            beginAtZero: true
          },
          y1: {
            type: 'linear',
            position: 'right',
            grid: {
              drawOnChartArea: false
            },
            title: {
              display: true,
              text: 'Tỷ lệ (%)'
            },
            min: 0,
            max: 100
          }
        }
      }
    });
  }
});

$(document).ready(function () {
  const bubbleChartEl = document.getElementById('criticalServiceStatus');
  if (bubbleChartEl) {
    const ctx = bubbleChartEl.getContext('2d');

    const criticalServiceStatusChart = new Chart(ctx, {
      type: 'bubble',
      data: {
        datasets: [
          {
            label: 'Thành công',
            data: [{ x: 10, y: 80, r: 15 }],
            backgroundColor: 'rgba(75, 192, 192, 0.6)',
            borderColor: 'rgba(75, 192, 192, 1)',
            borderWidth: 1
          },
          {
            label: 'Lỗi',
            data: [{ x: 30, y: 20, r: 20 }],
            backgroundColor: 'rgba(255, 99, 132, 0.6)',
            borderColor: 'rgba(255, 99, 132, 1)',
            borderWidth: 1
          },
          {
            label: 'Đang xử lý',
            data: [{ x: 20, y: 50, r: 10 }],
            backgroundColor: 'rgba(255, 205, 86, 0.6)',
            borderColor: 'rgba(255, 205, 86, 1)',
            borderWidth: 1
          }
        ]
      },
      options: {
        responsive: true,
        maintainAspectRatio: false,
        plugins: {
          title: {
            display: true,
            text: 'Trạng thái yêu cầu dịch vụ'
          },
          tooltip: {
            callbacks: {
              label: function (context) {
                const label = context.dataset.label || '';
                const data = context.raw;
                return `${label}: (${data.x}, ${data.y}) - size ${data.r}`;
              }
            }
          }
        },
        scales: {
          x: {
            title: {
              display: true,
              text: 'Thời gian xử lý (giả lập)'
            },
            beginAtZero: true
          },
          y: {
            title: {
              display: true,
              text: 'Số lượng yêu cầu'
            },
            beginAtZero: true
          }
        }
      }
    });
  }
});

$(document).ready(function () {
  const pieChartEl = document.getElementById('totalServiceRequests');
  if (pieChartEl) {
    const ctx = pieChartEl.getContext('2d');

    const totalServiceRequestsChart = new Chart(ctx, {
      type: 'doughnut',
      data: {
        labels: ['Thành công', 'Lỗi', 'Đang xử lý'],
        datasets: [{
          data: [60, 25, 15],
          backgroundColor: [
            'rgba(75, 192, 192, 0.7)',     // Thành công
            'rgba(255, 99, 132, 0.7)',     // Lỗi
            'rgba(255, 205, 86, 0.7)'      // Đang xử lý
          ],
          borderColor: [
            'rgba(75, 192, 192, 1)',
            'rgba(255, 99, 132, 1)',
            'rgba(255, 205, 86, 1)'
          ],
          borderWidth: 1
        }]
      },
      options: {
        responsive: true,
        maintainAspectRatio: false,
        rotation: -90,         // Bắt đầu từ phía dưới
        circumference: 180,    // Chỉ hiển thị nửa vòng (semi donut)
        plugins: {
          legend: {
            position: 'bottom'
          },
          title: {
            display: true,
            text: 'Tổng hợp số lượng yêu cầu dịch vụ'
          }
        }
      }
    });
  }
});

$(document).ready(function () {
  const donutEl = document.getElementById('top10IntegratedUsers');
  if (donutEl) {
    const ctx = donutEl.getContext('2d');

    // Tạo các gradient màu cho từng phần
    const gradient1 = ctx.createLinearGradient(0, 0, 0, 200);
    gradient1.addColorStop(0, '#36D1DC');
    gradient1.addColorStop(1, '#5B86E5');

    const gradient2 = ctx.createLinearGradient(0, 0, 0, 200);
    gradient2.addColorStop(0, '#FFB75E');
    gradient2.addColorStop(1, '#ED8F03');

    const gradient3 = ctx.createLinearGradient(0, 0, 0, 200);
    gradient3.addColorStop(0, '#C6FFDD');
    gradient3.addColorStop(1, '#FBD786');

    const gradient4 = ctx.createLinearGradient(0, 0, 0, 200);
    gradient4.addColorStop(0, '#f7797d');
    gradient4.addColorStop(1, '#FBD786');

    const gradient5 = ctx.createLinearGradient(0, 0, 0, 200);
    gradient5.addColorStop(0, '#a1c4fd');
    gradient5.addColorStop(1, '#c2e9fb');

    const top10IntegratedUsersChart = new Chart(ctx, {
      type: 'doughnut',
      data: {
        labels: [
          'Người dùng A', 'Người dùng B', 'Người dùng C', 'Người dùng D', 'Người dùng E'
        ],
        datasets: [{
          data: [25, 20, 15, 10, 30],
          backgroundColor: [
            gradient1,
            gradient2,
            gradient3,
            gradient4,
            gradient5
          ],
          borderWidth: 1
        }]
      },
      options: {
        responsive: true,
        maintainAspectRatio: false,
        cutout: '60%',
        plugins: {
          legend: {
            position: 'bottom',
            labels: {
              boxWidth: 20,
              padding: 15
            }
          },
          title: {
            display: true,
            text: 'Top 10 người dùng tích hợp nhiều nhất'
          }
        }
      }
    });
  }
});
