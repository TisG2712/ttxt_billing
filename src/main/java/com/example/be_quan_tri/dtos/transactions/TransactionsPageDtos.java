package com.example.be_quan_tri.dtos.transactions;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class TransactionsPageDtos {

    private Long id;
    private String orgCode;
    private String serviceCodeRequest;
    private String idRequest;
    private String transactionId;
    private Timestamp timeRequest;
    private String statusCode;
    private String serviceCode;

}
