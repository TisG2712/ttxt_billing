package com.example.be_quan_tri.dtos.groups;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomDeletePartToGroup {
    private Long idGroup;
    private Long idPart;
}
