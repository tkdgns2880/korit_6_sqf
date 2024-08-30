package com.study.rest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.expression.TypedValue;

@Configuration
// Bean 을 사용하기 위해서는 Configuration 안에서만 사용이 가능하다
// 여러개의 Bean 을 중복하여 사용가능
public class TestConfig {

    @Bean
    // 빈을 걸면 컴퍼먼트 이름이 TypedValue 이된다 자동으로 컨테이너에 저장된다
    public TypedValue typedValue() {
        return new TypedValue(null);
    }
}
