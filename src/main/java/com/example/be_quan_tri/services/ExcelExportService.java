package com.example.be_quan_tri.services;

import com.example.be_quan_tri.dtos.partners.CustomReportDetailDtos;
import com.example.be_quan_tri.dtos.partners.CustomReportDto;
import com.example.be_quan_tri.dtos.reports.ReportGroupPartner;
import com.example.be_quan_tri.dtos.reports.fomatReportServiceDtos;
import com.example.be_quan_tri.dtos.transactions.TransactionDtos;
import com.example.be_quan_tri.dtos.transactions.TransactionExportDtos;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.util.List;

@Service
public class ExcelExportService {
    public void exportDataToExcelPartnerReport(HttpServletResponse response, List<CustomReportDto> dataList) throws IOException {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Data Sheet");
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        // Tạo header cho bảng dữ liệu
        Row headerRow = sheet.createRow(0);
        Cell cellHeader1 = headerRow.createCell(0);
        cellHeader1.setCellValue("STT");
        Cell cellHeader2 = headerRow.createCell(1);
        cellHeader2.setCellValue("Mã KH");
        Cell cellHeader3 = headerRow.createCell(2);
        cellHeader3.setCellValue("Tổng transaction");
        Cell cellHeader4 = headerRow.createCell(3);
        cellHeader4.setCellValue("Tổng transaction thành công");
        Cell cellHeader5 = headerRow.createCell(4);
        cellHeader5.setCellValue("Thành tiền");
        // Tiếp tục cho các cột khác...
        Long totalAmount = 0L;
        // Thêm dữ liệu vào các hàng tiếp theo
        int rowCount = 1;
        for (CustomReportDto entity : dataList) {
            Row row = sheet.createRow(rowCount++);
            row.createCell(0).setCellValue(rowCount - 1);
            row.createCell(1).setCellValue(entity.getPartnerCode());
            row.createCell(2).setCellValue(decimalFormat.format(entity.getTotalRequests()));
            row.createCell(3).setCellValue(decimalFormat.format(entity.getTotalSuccessfulRequests()));
            row.createCell(4).setCellValue(decimalFormat.format(entity.getTotalCost()) + " VND");
            // Tiếp tục cho các trường khác...

            totalAmount += entity.getTotalCost();
        }
        // Tạo dòng cuối cùng để hiển thị tổng tiền
        Row totalRow = sheet.createRow(rowCount);
        Cell totalLabelCell = totalRow.createCell(0);
        totalLabelCell.setCellValue("Tổng cộng");

        // Hợp nhất các ô từ cột đầu tiên đến cột thứ ba trong dòng cuối cùng
        sheet.addMergedRegion(new CellRangeAddress(rowCount, rowCount, 0, 3));

        Cell totalAmountCell = totalRow.createCell(4);
        totalAmountCell.setCellValue(decimalFormat.format(totalAmount)+ " VND");
        // Thiết lập response để tải về file Excel
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        response.setHeader("Content-Disposition", "attachment; filename=data.xlsx");

        // Ghi file Excel vào response
        ServletOutputStream outputStream = response.getOutputStream();
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
    }

    public void exportDataToExcelCategory(HttpServletResponse httpServletResponse, List<fomatReportServiceDtos> totalDataService) throws IOException {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Data Sheet");
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        // Tạo header cho bảng dữ liệu
        Row headerRow = sheet.createRow(0);
        Cell cellHeader1 = headerRow.createCell(0);
        cellHeader1.setCellValue("STT");
        Cell cellHeader2 = headerRow.createCell(1);
        cellHeader2.setCellValue("Tên danh mục");
        Cell cellHeader3 = headerRow.createCell(2);
        cellHeader3.setCellValue("Dịch vụ");
        Cell cellHeader4 = headerRow.createCell(3);
        cellHeader4.setCellValue("Total Transaction");
        Cell cellHeader5 = headerRow.createCell(4);
        cellHeader5.setCellValue("Tổng thành công");
        Cell cellHeader6 = headerRow.createCell(5);
        cellHeader6.setCellValue("Thành tiền");
        // Tiếp tục cho các cột khác...
        Long totalAmount = 0L;
        Long totalTransaction = 0L;
        Long totalTransactionSuccess = 0L;
        // Thêm dữ liệu vào các hàng tiếp theo
        int rowCount = 1;
        for (fomatReportServiceDtos entity : totalDataService) {
            Row row = sheet.createRow(rowCount++);
            row.createCell(0).setCellValue(rowCount - 1);
            row.createCell(1).setCellValue(entity.getSateServiceName());
            row.createCell(2).setCellValue(entity.getServiceName());
            row.createCell(3).setCellValue(decimalFormat.format(entity.getTotalTransaction()));
            row.createCell(4).setCellValue(decimalFormat.format(entity.getTotalTransactionSuccess()));
            row.createCell(5).setCellValue(decimalFormat.format(entity.getTotalMoney()) + " VND");
            // Tiếp tục cho các trường khác...

            totalAmount += entity.getTotalMoney();
            totalTransaction += entity.getTotalTransaction();
            totalTransactionSuccess += entity.getTotalTransactionSuccess();
        }
        // Tạo dòng cuối cùng để hiển thị tổng tiền
        Row totalRow = sheet.createRow(rowCount);
        Cell totalLabelCell = totalRow.createCell(0);
        totalLabelCell.setCellValue("Tổng cộng");

        // Hợp nhất các ô từ cột đầu tiên đến cột thứ ba trong dòng cuối cùng
        sheet.addMergedRegion(new CellRangeAddress(rowCount, rowCount, 0, 2));

        Cell totalAmountCell = totalRow.createCell(3);
        totalAmountCell.setCellValue(totalTransaction);
        Cell totalAmountCellTransaction = totalRow.createCell(4);
        totalAmountCellTransaction.setCellValue(totalTransactionSuccess);
        Cell totalAmountCellTransactionSuccess = totalRow.createCell(5);
        totalAmountCellTransactionSuccess.setCellValue(decimalFormat.format(totalAmount) + " VND");
        // Thiết lập response để tải về file Excel
        httpServletResponse.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        httpServletResponse.setHeader("Content-Disposition", "attachment; filename=data.xlsx");

        // Ghi file Excel vào response
        ServletOutputStream outputStream = httpServletResponse.getOutputStream();
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
    }

    public void exportDataToExcelService(HttpServletResponse httpServletResponse, List<CustomReportDetailDtos> totalDataService) throws IOException {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Data Sheet");
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        // Tạo header cho bảng dữ liệu
        Row headerRow = sheet.createRow(0);
        Cell cellHeader1 = headerRow.createCell(0);
        cellHeader1.setCellValue("STT");
        Cell cellHeader2 = headerRow.createCell(1);
        cellHeader2.setCellValue("Tên dịch vụ");
        Cell cellHeader3 = headerRow.createCell(2);
        cellHeader3.setCellValue("Tổng transaction");
        Cell cellHeader4 = headerRow.createCell(3);
        cellHeader4.setCellValue("Tổng transaction thành công");
        Cell cellHeader5 = headerRow.createCell(4);
        cellHeader5.setCellValue("Thành tiền");

        // Tiếp tục cho các cột khác...
        Long totalAmount = 0L;
        Long totalTransaction = 0L;
        Long totalTransactionSuccess = 0L;
        // Thêm dữ liệu vào các hàng tiếp theo
        int rowCount = 1;
        for (CustomReportDetailDtos entity : totalDataService) {
            Row row = sheet.createRow(rowCount++);
            row.createCell(0).setCellValue(rowCount - 1);
            row.createCell(1).setCellValue(entity.getServiceName());
            row.createCell(2).setCellValue(decimalFormat.format(entity.getTotalRequest()));
            row.createCell(3).setCellValue(decimalFormat.format(entity.getTotalSuccessfulRequests()));
            row.createCell(4).setCellValue(decimalFormat.format(entity.getTotalCost()) + "VND");
            // Tiếp tục cho các trường khác...

            totalAmount += entity.getTotalCost();
            totalTransaction += entity.getTotalRequest();
            totalTransactionSuccess += entity.getTotalSuccessfulRequests();
        }
        // Tạo dòng cuối cùng để hiển thị tổng tiền
        Row totalRow = sheet.createRow(rowCount);
        Cell totalLabelCell = totalRow.createCell(0);
        totalLabelCell.setCellValue("Tổng cộng");

        // Hợp nhất các ô từ cột đầu tiên đến cột thứ ba trong dòng cuối cùng
        sheet.addMergedRegion(new CellRangeAddress(rowCount, rowCount, 0, 1));

        Cell totalAmountCell = totalRow.createCell(2);
        totalAmountCell.setCellValue(totalTransaction);
        Cell totalAmountCellTransaction = totalRow.createCell(3);
        totalAmountCellTransaction.setCellValue(totalTransactionSuccess);
        Cell totalAmountCellTransactionSuccess = totalRow.createCell(4);
        totalAmountCellTransactionSuccess.setCellValue(decimalFormat.format(totalAmount) + " VND");
        // Thiết lập response để tải về file Excel
        httpServletResponse.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        httpServletResponse.setHeader("Content-Disposition", "attachment; filename=data.xlsx");

        // Ghi file Excel vào response
        ServletOutputStream outputStream = httpServletResponse.getOutputStream();
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
    }



    public void exportDataToTransaction(HttpServletResponse httpServletResponse, List<TransactionExportDtos> transactions) throws IOException {

        SXSSFWorkbook workbook = new SXSSFWorkbook(100);

        int maxRowsPerSheet = 500000;
        int sheetIndex = 0;
        Sheet sheet = workbook.createSheet("Sheet" + sheetIndex);

        String[] headers = {"STT", "Org_code", "Service_code", "RequestId", "Transaction Id", "Time Request" , "Status"};

        createHeaderRow(sheet, headers);
        int rowIndex = 1;

        for (TransactionExportDtos data : transactions) {
            if (rowIndex >= maxRowsPerSheet) {
                sheetIndex++;
                sheet = workbook.createSheet("Sheet" + sheetIndex);
                rowIndex = 1;
            }
                Row row = sheet.createRow(rowIndex++);
                row.createCell(0).setCellValue(rowIndex - 1);
                row.createCell(1).setCellValue(data.getOrgCode());
                row.createCell(2).setCellValue(data.getServiceCode());
                row.createCell(3).setCellValue(data.getIdRequest());
                row.createCell(4).setCellValue(data.getTransactionId());
                row.createCell(5).setCellValue(data.getTimeRequest().toString());
                row.createCell(6).setCellValue(data.getStatusCode());
        }

        // Thiết lập response và xuất file Excel
        httpServletResponse.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        httpServletResponse.setHeader("Content-Disposition", "attachment; filename=transaction.xlsx");

        try (ServletOutputStream outputStream = httpServletResponse.getOutputStream()) {
            workbook.write(outputStream);
            outputStream.flush();
        } finally {
            workbook.dispose(); // Giải phóng bộ nhớ khi hoàn tất
        }

    }

    private static void createHeaderRow(Sheet sheet, String[] headers) {
        Row headerRow = sheet.createRow(0);
        CellStyle headerStyle = sheet.getWorkbook().createCellStyle();
        Font font = sheet.getWorkbook().createFont();
        font.setBold(true);
        headerStyle.setFont(font);

        for (int i = 0; i < headers.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(headers[i]);
            cell.setCellStyle(headerStyle);
        }
    }


    public void exportDataPartnerGroup(HttpServletResponse httpServletResponse, List<ReportGroupPartner> reportGroupPartners) throws IOException {

        SXSSFWorkbook workbook = new SXSSFWorkbook(100);
        Sheet sheet = workbook.createSheet("Data Sheet");

        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        // Tạo style cho tiêu đề
        CellStyle headerStyle = workbook.createCellStyle();
        Font headerFont = workbook.createFont();
        headerFont.setBold(true);
        headerStyle.setFont(headerFont);

        Row headerRow = sheet.createRow(0);
        String[] headers = {"STT", "Mã đơn vị", "Tổng transaction", "Tổng transaction thành công", "Thành tiền"};

        for (int i = 0; i < headers.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(headers[i]);
            cell.setCellStyle(headerStyle);
        }

        int rowCount = 1;
        for (ReportGroupPartner entity : reportGroupPartners) {
            Row row = sheet.createRow(rowCount++);
            row.createCell(0).setCellValue(rowCount - 1);
            row.createCell(1).setCellValue(entity.getGroupName());
            row.createCell(2).setCellValue(decimalFormat.format(entity.getTotalRequest()));
            row.createCell(3).setCellValue(decimalFormat.format(entity.getTotalSuccess()));
            row.createCell(4).setCellValue(decimalFormat.format(entity.getTotalMoney()) + " VND");
            // Tiếp tục cho các trường khác...

        }

        // Thiết lập response và xuất file Excel
        httpServletResponse.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        httpServletResponse.setHeader("Content-Disposition", "attachment; filename=transaction.xlsx");

        try (ServletOutputStream outputStream = httpServletResponse.getOutputStream()) {
            workbook.write(outputStream);
            outputStream.flush();
        } finally {
            workbook.dispose(); // Giải phóng bộ nhớ khi hoàn tất
        }

    }
}
