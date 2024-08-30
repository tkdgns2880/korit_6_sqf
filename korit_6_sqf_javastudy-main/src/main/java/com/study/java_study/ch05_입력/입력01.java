package com.study.java_study.ch05_입력;

import java.util.Scanner;

public class 입력01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        /*
        next() 메소드 특징
        1. 공백과 줄바꿈(엔터)은 무시한다.
        2. 버퍼를 사용한다. -> 스페이스바 엔터 esc
         */
        String a = scanner.next(); // nextInt() = 숫자를 넣고 쓸때.
        System.out.println("에이: " + a);


        System.out.print("b: ");
        String b = scanner.nextLine(); // nextLine() = 스페이스바 엔터 까지 포함
        System.out.println("비: " + b);
    }
}
