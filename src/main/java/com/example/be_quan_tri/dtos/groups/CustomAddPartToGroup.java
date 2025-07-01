package com.example.be_quan_tri.dtos.groups;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomAddPartToGroup {

    private Long idGroup;
    private ArrayList<Long> data;

}
