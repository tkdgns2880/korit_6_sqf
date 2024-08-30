package com.study.java_study.ch01_변수와_자료형;

public class Operation01 {
    public static void main(String[] args) {
        // 연산자

        // 산술연산자
        int num1 = 10 + 20;
        int num2 = 9 / 2;
        System.out.println(num2);
        int num3 = 9 % 2; // 숫자를 모르는 경우 2로 나누었을때 홀수( 1 ), 짝수( 0 )를 알수 있다
        System.out.println(num3);
        boolean num4 = 5 % 2 == 0;

        System.out.println("//////////////");

        // 증감연산
        int i = 0;
        System.out.println(i);
        i++;
        System.out.println(i);
        i = i + 1;
        System.out.println(i);
        ++i;
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i++); // 뒤에(기호) ++ 붙이면 다음 명령때 추가하여 출력된다
        System.out.println(i);
        System.out.println(--i);
        System.out.println(i--); // 뒤에(기호) -- 붙이면 다음 명령때 추가하여 출력된다
        System.out.println(i);

        // 논리연산자
        // ture -> 1
        // false -> 0
        // && -> AND(곱하기)
        // || -> OR(합하기)
        // ! -> NOT(부정)
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(true || true); // true에 값을 입력하지 않아도 0 이 아니면 true
        System.out.println(false || false);
        System.out.println(!(true && true)); // ! 부정이 앞에 붙으면 값이 같을때 false 값이 다를때 true

        // 관계연산자
        System.out.println(3 > 2 && 1 == 1);
        System.out.println(1 != 1);

        // 조건연산자
        System.out.println(3 > 2 ? "참" : "거짓"); // ? 앞에 3 > 2(조건식) 값에 "참" "거짓" 출력
        System.out.println(3 > 2 ? 10 : 20);
        int x = 10;
        int y = 2;
        String result = x % y == 0 ? "y의 배수입니다." : "y의 배수가 아닙니다.";
        String result2 = "" + 10 / 2;
        System.out.println(result);
        System.out.println(result2);
        System.out.println("\"" + result2 + "\""); // " 문자(\") " 를 넣어야 오류가 안남

        // 복합대입연산자
        int number = 10;
        number += 5; // number = 10 에 5를 더한거 number = number + 5;
        number -= 1;
        number *= 2;
        number /= 2;
        number %= 2;

    }
}
