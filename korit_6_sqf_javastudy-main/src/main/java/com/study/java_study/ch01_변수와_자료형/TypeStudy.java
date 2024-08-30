package com.study.java_study.ch01_변수와_자료형;

public class TypeStudy {

    public static void main(String[] args) {
        // [ 일반 자료형 ]
        // 1. 논리
        boolean a = false;
        boolean b = true;

        // 2. 숫자(정수)
        int c = 1000; // int c = 1000000000; 불가능
        long d = 1000000000l; // long 코드 입력 후 마지막 숫자 뒤에 l 입력

        // 3. 숫자(실수)
        double e = 3.14;

        // 4. 문자
        char f = '가'; // char 한글자만 입력 ' ' // '가' = AC00

        // 5. 문자열
        String g = "가나"; // String(대문자) 두글자이상 입력 " "

        System.out.println((char)((int)f + 1)); // 형변환

        //형변환 문자(char) -> 정수(int, long) -> 실수(double)

        double num = 3.14;
        System.out.println(num);
        int num2 = (int)num;  // 명시적 형변환 (다운 캐스팅)
        System.out.println(num2);
        double num3 = num2; // 명시적 통제 (업 캐스팅)
        System.out.println(num3);

    }

}
