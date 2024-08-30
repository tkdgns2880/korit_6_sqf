package com.study.java_study.ch10_추상화01;

public class Animal {
    private String name;
    private int age;

    public Animal() {
        super(); // Animal 객체 생성자 호출
        System.out.println("동물 객체 생성");
    }
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void move() {
        System.out.println("동물이 움직입니다.");

    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
