$(document).ready(function () {
  const ctx = document.getElementById('devopsCiCdChart').getContext('2d');

  const devopsCiCdChart = new Chart(ctx, {
    type: 'bubble',
    data: {
      datasets: [
        {
          label: 'Pipeline A',
          data: [{ x: 5, y: 20, r: 15 }],
          backgroundColor: 'rgba(255, 99, 132, 0.6)'
        },
        {
          label: 'Pipeline B',
          data: [{ x: 10, y: 35, r: 10 }],
          backgroundColor: 'rgba(54, 162, 235, 0.6)'
        },
        {
          label: 'Pipeline C',
          data: [{ x: 15, y: 25, r: 20 }],
          backgroundColor: 'rgba(255, 206, 86, 0.6)'
        }
      ]
    },
    options: {
      responsive: true,
      maintainAspectRatio: false,
      scales: {
        x: {
          title: {
            display: true,
            text: 'Số lần chạy pipeline'
          },
          beginAtZero: true
        },
        y: {
          title: {
            display: true,
            text: 'Số lỗi gặp phải'
          },
          beginAtZero: true
        }
      },
      plugins: {
        tooltip: {
          callbacks: {
            label: (ctx) => {
              const { x, y, r } = ctx.raw;
              return `Chạy: ${x}, Lỗi: ${y}, Thời gian: ${r} phút`;
            }
          }
        }
      }
    }
  });
});

$(document).ready(function () {
  const customerChartEl = document.getElementById('customerOverviewChart');
  if (customerChartEl) {
    const customerCtx = customerChartEl.getContext('2d');

    const customerOverviewChart = new Chart(customerCtx, {
      type: 'bubble',
      data: {
        datasets: [
          {
            label: 'Khách hàng A',
            data: [{ x: 10, y: 5, r: 12 }],
            backgroundColor: 'rgba(75, 192, 192, 0.6)'
          },
          {
            label: 'Khách hàng B',
            data: [{ x: 15, y: 8, r: 18 }],
            backgroundColor: 'rgba(153, 102, 255, 0.6)'
          },
          {
            label: 'Khách hàng C',
            data: [{ x: 5, y: 12, r: 10 }],
            backgroundColor: 'rgba(255, 159, 64, 0.6)'
          }
        ]
      },
      options: {
        responsive: true,
        maintainAspectRatio: false,
        scales: {
          x: {
            title: {
              display: true,
              text: 'Số lần tương tác'
            },
            beginAtZero: true
          },
          y: {
            title: {
              display: true,
              text: 'Mức độ hài lòng'
            },
            beginAtZero: true
          }
        },
        plugins: {
          tooltip: {
            callbacks: {
              label: (ctx) => {
                const { x, y, r } = ctx.raw;
                return `Tương tác: ${x}, Hài lòng: ${y}, Mức độ ảnh hưởng: ${r}`;
              }
            }
          }
        }
      }
    });
  }
});
