package com.example.be_quan_tri.controllers.webcontrollers.transactions;

import com.example.be_quan_tri.dtos.GloableValue;
import com.example.be_quan_tri.dtos.transactions.CustomTransactionInfo;
import com.example.be_quan_tri.dtos.transactions.TransactionsPageDtos;
import com.example.be_quan_tri.entitys.Transactions;
import com.example.be_quan_tri.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

@Controller
@RequestMapping("transactions/")
public class TransactionWebControllers {

    @Autowired
    private TransactionService transactionService;

    @PreAuthorize("hasAnyRole('ADMIN', 'PARTNER')")
    @GetMapping("listTransaction")
    public String listPartner(
            @RequestParam("partnerCode") String partnerCode,
            @RequestParam("status") String status,
            @RequestParam("startDate") String startDate,
            @RequestParam("endDate") String endDate,
            @RequestParam("size") String size,
            @RequestParam("page") String page,
            @RequestParam("id") String idPartner,
            Model model) {
        LocalDateTime localDateTimeStart = LocalDateTime.parse(startDate);
        LocalDateTime localDateTimeEnd = LocalDateTime.parse(endDate);
        Long partnerId = !Objects.equals(idPartner, "") ? Long.valueOf(idPartner) : null;
        String codePartner = Objects.equals(partnerCode, "") || partnerCode == null ? null : partnerCode;
        String statusPartner = Objects.equals(status, "") || status == null ? null : status;
        int sizeInt = Integer.parseInt(size);
        int pageInt = Integer.parseInt(page);
        Pageable pageable = PageRequest.of(pageInt, sizeInt, Sort.by("timeRequest").descending());
        Page<TransactionsPageDtos> transactionPage = transactionService.getTransactionsPaginated(partnerId, codePartner, statusPartner,localDateTimeStart, localDateTimeEnd, pageable);
        model.addAttribute("transactionPage", transactionPage);
        return "dashboard/transactions/listTransaction";
    }

    @PreAuthorize("hasAnyRole('ADMIN', 'PARTNER')")
    @GetMapping("loadTransaction")
    public String loadTransaction(
            @RequestParam("partnerCode") String partnerCode,
            @RequestParam("status") String status,
            @RequestParam("startDate") String startDate,
            @RequestParam("endDate") String endDate,
            @RequestParam("size") String size,
            @RequestParam("page") String page,
            @RequestParam("id") String idPartner,
            Model model) {
        LocalDateTime localDateTimeStart = LocalDateTime.parse(startDate);
        LocalDateTime localDateTimeEnd = LocalDateTime.parse(endDate);
        Long partnerId = !Objects.equals(idPartner, "") ? Long.valueOf(idPartner) : null;
        String codePartner = Objects.equals(partnerCode, "") || partnerCode == null ? null : partnerCode;
        String statusPartner = Objects.equals(status, "") || status == null ? null : status;
        Page<TransactionsPageDtos> transactionPage = transactionService.getTransactionsPaginated(partnerId, codePartner, statusPartner,localDateTimeStart, localDateTimeEnd, GloableValue.pageAndId(size, page));
        model.addAttribute("transactionPage", transactionPage);
        return "dashboard/transactions/loadTransaction";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("load-info-transaction")
    public String loadInfoTransaction(
            @RequestParam("transactionId") String transactionId,
            Model model) {
        Long Id = Long.valueOf(transactionId);
        CustomTransactionInfo transactionPage = transactionService.getTransactionsInfo(Id);
        model.addAttribute("transactionPage", transactionPage);
        return "dashboard/transactions/loadInfoTransaction";
    }

}

