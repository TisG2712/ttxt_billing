package com.example.be_quan_tri.dtos.reports;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReportDetailGroupPartner {

    private String partnerCode;
    private Long tota;

}
