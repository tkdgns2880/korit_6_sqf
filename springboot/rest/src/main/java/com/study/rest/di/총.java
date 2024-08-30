package com.study.rest.di;

import org.springframework.stereotype.Component;

@Component
public class 총 implements 무기{

    @Override // 단축키 ctrl + i
    public void 공격() {
        System.out.println("총을 쏩니다");
    }
}
