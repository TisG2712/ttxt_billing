package com.example.be_quan_tri.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@Data
@NoArgsConstructor
@Builder
public class GloableValue {

    private static Pageable pageable;
    public static Pageable pageAndId(String size, String page){
        int sizeInt = Integer.parseInt(size);
        int pageInt = Integer.parseInt(page);
        pageable = PageRequest.of(pageInt, sizeInt);
        return pageable;
    }

    public static Pageable pageSort(String size, String page, Sort sort){
        int sizeInt = Integer.parseInt(size);
        int pageInt = Integer.parseInt(page);
        pageable = PageRequest.of(pageInt, sizeInt, sort);
        return pageable;
    }

}
