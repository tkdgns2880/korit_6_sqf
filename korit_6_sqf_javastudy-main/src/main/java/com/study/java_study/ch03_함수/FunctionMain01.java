package com.study.java_study.ch03_함수;

public class FunctionMain01 {

    public static void main(String[] args) {
        Function01 function01 = new Function01();

        int result = function01.add(10, 2);
        int result2 = function01.add(100, 50);
        int result3 = function01.sub(5, 2);
        int result4 = function01.sub(10, 5);


        System.out.println(result);
        System.out.println(result2);
    }

}
