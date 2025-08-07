$(document).ready(function () {
  const retentionChartEl = document.getElementById('customerRetentionChart');
  if (retentionChartEl) {
    const retentionCtx = retentionChartEl.getContext('2d');

    const customerRetentionChart = new Chart(retentionCtx, {
      type: 'polarArea',
      data: {
        labels: [
          'Khách hàng trung thành',
          'Khách hàng quay lại',
          'Khách hàng mới tiềm năng',
          'Khách hàng có nguy cơ rời bỏ'
        ],
        datasets: [{
          label: 'Tỷ lệ giữ chân khách hàng',
          data: [35, 25, 20, 15],
          backgroundColor: [
            'rgba(54, 162, 235, 0.6)',
            'rgba(255, 206, 86, 0.6)',
            'rgba(75, 192, 192, 0.6)',
            'rgba(255, 99, 132, 0.6)'
          ]
        }]
      },
      options: {
        responsive: true,
        maintainAspectRatio: false,
        plugins: {
          legend: {
            position: 'right'
          },
          tooltip: {
            callbacks: {
              label: function (ctx) {
                return `${ctx.label}: ${ctx.formattedValue}%`;
              }
            }
          }
        }
      }
    });
  }
});