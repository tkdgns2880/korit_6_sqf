package com.study.rest.dto;

import com.study.rest.entity.Color;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

public class ColorDto {

    @Builder
    @Data
    public static class ColorInfo{
        private int colorId;
        private String colorName;
    }
    public static List<ColorInfo> tocolorList(List<Color> colorList) {
        return colorList.stream().map(Color::toColorDto).collect(Collectors.toList());
    }
}
