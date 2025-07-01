package com.example.be_quan_tri.dtos.reports;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReportGroupPartner {

    private Long id;
    private String groupName;
    private Long totalRequest;
    private Long totalSuccess;
    private Long totalMoney;


}
