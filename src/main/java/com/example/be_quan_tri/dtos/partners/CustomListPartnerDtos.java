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
public class CustomListPartnerDtos {
    private Long partnerId;
    private String partnerName;
    private String partnerCode;
    private String partnerUser;
    private LocalDateTime createdAt;
    private Long idStatus;
    private String statusDetail;

}
