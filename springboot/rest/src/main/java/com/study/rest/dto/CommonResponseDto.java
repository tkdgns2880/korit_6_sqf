package com.study.rest.dto;

import com.study.rest.entity.Computer;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CommonResponseDto {
    private String message;
    private int count;
    private boolean success;
    // 클래스명<T> 를 사용해서 만듬 private T data;

    public static CommonResponseDto ofDefault(int count) {
        return CommonResponseDto.builder()
                .message(count > 0 ? "Successful" : "Failed")
                .count(count)
                .success(count > 0)
                .build();
    }
}
