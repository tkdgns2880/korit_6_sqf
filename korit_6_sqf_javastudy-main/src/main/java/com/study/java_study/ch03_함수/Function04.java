package com.study.java_study.ch03_함수;

public class Function04 {

    void add(int a, int b) {
        System.out.println(a + b);
    }
    //    int add(int a, int b){
//        System.out.println(a + b); 리턴자료형이 아닌거는 오버로딩 x

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
// 오버로딩 매개변수 갯수가 다르거나 자료가 다르다.

    void add(int a, String b) {
        int c = Integer.parseInt(b);
        System.out.println(a + c);
    }

}
