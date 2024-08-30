package com.study.java_study.ch04_제어;

public class For01 {

    public static void main(String[] args) {
        // 지정한 횟수만큼 순서대로 반복할때 For 문
        for(int i = 0; i < 10000; i++) { // i = 초기문 < = 조건문 ++ = 후처리
            System.out.println(i + 1);
        }
        for(int i = 0; i < 10000; i++) {
            System.out.println(10000 - i);
        }
    }

}
