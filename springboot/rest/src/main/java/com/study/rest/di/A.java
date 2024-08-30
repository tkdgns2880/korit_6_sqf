package com.study.rest.di;

import lombok.AllArgsConstructor;

@AllArgsConstructor // 생성자로 객체를 불러올때 사용
public class A {

    private B b;

    public void aCall() {
        System.out.println("A 객체에서 메소드 호출");
        b.bCall();
    }
}
