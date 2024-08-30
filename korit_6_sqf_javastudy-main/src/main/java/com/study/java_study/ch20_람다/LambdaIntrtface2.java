package com.study.java_study.ch20_람다;

import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaIntrtface2 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("안녕");
            System.out.println("잘가");
        };
        runnable.run();

        Function<String, Integer> fx = a -> String.format(a);
        String name = fx.apply("정상훈");
        System.out.println("이름: " + name);

        Function<String, Integer> fx2 = c -> Integer.parseInt(c);
        Integer number = fx2.apply("100");
        System.out.println("숫자: " + number);

        Consumer<String> loing = b -> {
            System.out.println(b + "서버에 접속하였습니다");
            System.out.println(b + "님 환영합니다");
        };
        loing.accept("정상훈");

        Supplier<Integer> plus = () -> {
            Integer result = number + 999;
            return result;
        };
        System.out.println(plus.get());
    }

}
