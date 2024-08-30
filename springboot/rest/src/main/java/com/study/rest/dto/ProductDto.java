package com.study.rest.dto;

import com.study.rest.entity.Product;
import lombok.Data;

public class ProductDto {

    @Data
    public static class Register {
        private String productName;
        private int price;
        private int sizeId;
        private int colorId;

        // Register 안에서 toEntity 를 사용해 문법이 간단해진다
        public Product toEntity() {
            return Product.builder()
                    .productName(productName)
                    .price(price)
                    .sizeId(sizeId)
                    .colorId(colorId)
                    .build();
        }
    }
}
