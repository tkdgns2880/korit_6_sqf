package com.study.rest.dto;

import com.study.rest.entity.Size;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;


public class SizeDto {

    @Builder
    @Data
    public static class SizeInfo {
        private int sizeId;
        private String sizeName;
    } /// 위에는 단건 조회때 사용하는 코드

    public static List<SizeInfo> toSizeList(List<Size> sizeList) {
        return sizeList.stream().map(Size::toSizeDto).collect(Collectors.toList());
    } // Size::toDto -> entity 폴더 안에 있는 Size 파일 안에 있는 toDto를 객체로 지정하는 문법


//    @Builder
//    @Data
//    public static class ListResponse {
//        List<Info> sizeList;
//    } /// 위에는 다건 조회때 사용하는 코드 (단건조회)도 재사용한다
}
