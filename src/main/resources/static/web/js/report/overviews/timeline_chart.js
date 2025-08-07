$(document).ready(function () {
  const ctx = document.getElementById('serverResourceChart').getContext('2d');
  if (ctx) {
    const serverResourceChart = new Chart(ctx, {
        type: 'line',
        data: {
          labels: [
            '2025-08-01T08:00:00',
            '2025-08-01T09:00:00',
            '2025-08-01T10:00:00',
            '2025-08-01T11:00:00',
            '2025-08-01T12:00:00',
            '2025-08-01T13:00:00'
          ],
          datasets: [{
            label: 'CPU Usage (%)',
            data: [45, 55, 60, 50, 70, 65],
            fill: false,
            borderColor: 'rgba(75, 192, 192, 1)',
            tension: 0.3,
            pointRadius: 5
          }]
        },
        options: {
          responsive: true,
          maintainAspectRatio: false,
          scales: {
            x: {
              type: 'time',
              time: {
                unit: 'hour',
                displayFormats: {
                  hour: 'HH:mm'
                },
                tooltipFormat: 'MMM D, HH:mm'
              },
              title: {
                display: true,
                text: 'Thời gian'
              }
            },
            y: {
              beginAtZero: true,
              max: 100,
              title: {
                display: true,
                text: 'Mức sử dụng (%)'
              }
            }
          },
          plugins: {
            tooltip: {
              callbacks: {
                label: context => `${context.parsed.y}% CPU`
              }
            }
          }
        }
      });
  }
});