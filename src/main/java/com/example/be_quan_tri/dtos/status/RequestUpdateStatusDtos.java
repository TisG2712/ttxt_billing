package com.example.be_quan_tri.dtos.status;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class RequestUpdateStatusDtos {

    private Long idStatus;
    private String editTitleStatus;

}
