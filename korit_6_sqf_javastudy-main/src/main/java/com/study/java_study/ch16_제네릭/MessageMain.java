package com.study.java_study.ch16_제네릭;

public class MessageMain {
    public static void main(String[] args) {
        // 제네릭 와일드 카드 : 기호 -> ?
        // 와일드 카드를 쓸려면 다운캐스팅을 해야한다

        Message<?> m1;
        Message<String> m2 = null;

        m1 = new Message<>("10");
        String s = (String) m1.getMessage();

        // 와일드 카드 제약
        Message<? extends String> m3 = new Message<>("10");
        // String 을 상속시킨 코드
        // extends 자신을 포함 하위 애들만 가능 (하행)
        Message<? super String> m4 = new Message<>(new Object());
        // super 자신을 포함 상위 애들만 가능(상행)

        String s2 = m3.getMessage();
    }
}
