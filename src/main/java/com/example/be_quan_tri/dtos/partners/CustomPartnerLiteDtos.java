package com.example.be_quan_tri.dtos.partners;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomPartnerLiteDtos {

    private Long id;
    private String partnerName;
    private String partnerCode;
    private String partnerDetail;
    private String partnerUser;

}
