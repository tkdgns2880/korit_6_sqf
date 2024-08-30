package com.study.java_study.ch07_클래스02;

public class StudyB { // private 를 사용시 외부에서는 볼수만 있다.

    private String name;
    private int age;

    public StudyB() {
        // public StudyB(String name, int age) {
        //        this.name = name;
        //        this.age = age;
        // 위에 코드를 사용할시 따로 하나를 더 만들어야한다.
    }

    public StudyB(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        System.out.println(name);
        System.out.println(age);
    } // 정해진 절차되로 데이터를 받을수 있다.
}
