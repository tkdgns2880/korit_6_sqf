package com.study.rest.dto;

import lombok.Data;

@Data
public class ReqProductDto {
    private String productName;
    private int price;
    private int sizeId; // ID가 넘어 올거라 INT 값을 넣어준다
    private int colorId;
}
