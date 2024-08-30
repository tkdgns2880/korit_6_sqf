package com.study.rest.entity;

import com.study.rest.dto.ColorDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Color {
    private int colorId;
    private String colorName;

    public ColorDto.ColorInfo toColorDto() {
        return ColorDto.ColorInfo.builder()
                .colorId(colorId)
                .colorName(colorName)
                .build();
    }
}

