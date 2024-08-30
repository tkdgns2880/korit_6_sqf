package com.study.rest.service;

import org.springframework.stereotype.Service;

@Service("ts") // 컴퍼먼트 이름을 정해줄수 있다
public class TestServiceImpl implements TestService {

    @Override
    public void test() {
        System.out.println("기존 단위 테스트 실행");
    }
}
