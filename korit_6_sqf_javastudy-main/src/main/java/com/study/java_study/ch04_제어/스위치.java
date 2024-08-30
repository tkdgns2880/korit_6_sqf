package com.study.java_study.ch04_제어;

public class 스위치 {

    public static void main(String[] args) {
        String grade = "A";

        switch (grade) { // 원하는 코드를 찾을때 switch 를 활용하여 찾기.
            case "A":
                System.out.println("A등급");
                break;
            case "B":
                System.out.println("B등급");
                break;
            case "C":
                System.out.println("C등급");
                break;
            case "D":
                System.out.println("D등급");
                break;
            default:
                System.out.println("F등급");
        }
    }
}
