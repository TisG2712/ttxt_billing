package com.example.be_quan_tri.dtos.groups;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class RequestUpdateGroupDtos {

    private Long idGroup;
    private String editNameGroup;

}
