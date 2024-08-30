package com.study.java_study.ch19_익명클래스;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class AbstractCar {
//  @Getter
    private String model;
//  @Getter 부분부분 Getter를 걸수 있다
    private String color;

    public abstract  void createCar();
    public abstract void showCar();
}
