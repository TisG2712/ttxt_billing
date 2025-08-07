$(document).ready(function() {
  // Dashboard tổng quan về Hiệu Suất Hệ Thống
  const ctx1 = document.getElementById('systemPerformanceChart');
  if (ctx1) {
    const systemPerformanceChart = new Chart(ctx1.getContext('2d'), {
      type: 'line',
      data: {
        labels: ['T2', 'T3', 'T4', 'T5', 'T6', 'T7', 'CN'],
        datasets: [{
          label: 'Hiệu suất (%)',
          data: [95, 96, 94, 97, 98, 99, 97],
          borderColor: 'rgba(75, 192, 192, 1)',
          backgroundColor: 'rgba(75, 192, 192, 0.2)',
          fill: true,
          tension: 0.3
        }]
      },
      options: {
        responsive: true,
        maintainAspectRatio: false,
        scales: {
          y: {
            min: 90,
            max: 100,
            ticks: {
              callback: value => value + '%'
            }
          }
        },
        plugins: {
          tooltip: {
            callbacks: {
              label: ctx => ctx.parsed.y + '%'
            }
          }
        }
      }
    });
  }


});
