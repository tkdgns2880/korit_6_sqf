package com.study.rest.entity;

import lombok.Builder;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Builder
@Getter
public class Car {
    private String model;
    private String color;
}
