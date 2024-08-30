package com.study.rest.controller;

import com.study.rest.di.A;
import com.study.rest.di.B;
import com.study.rest.di.C;
import com.study.rest.di.D;
import com.study.rest.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DiAndIoc {

    @Autowired
    private C c;

    @Autowired
    @Qualifier("ts")
    // 대소문자 구분 잘하기
    private TestService testService1;

    @Autowired
    @Qualifier("newTestServiceImpl")
    // Qualifier 하나의 인터페이스 에서 2개의 객체를 따로 쓰기 위해서 사용
    private TestService testService2;

    /*
    * IOC 사용하기 위한 컴퍼먼스
    * @
    * */
    // DI(객체조립) - 유연성을 높이고 결합도를 낮춘다
    // IOC - 제어의 역전 객체주입(DI)을 스프림 프레임워크가 대신한다
    // IOCContainer - componant(단위요소, JSX, 객체)들이 들어가있다
    // bean(ioc 객체, 하나의 컴포먼트) -> @Component
    // 클래스에 기능을 담당하는 객체에는 @Component 를 걸어 @Autowired 객체의 기능을 가져온다

    @ResponseBody
    @GetMapping("/di")
    public Object di() {
        // A가 B를 의존하는 관계
        B b = new B();
        A a = new A(b);
        a.aCall();
        return null;
    }

    @ResponseBody
    @GetMapping("/ioc")
    public Object ioc(){
        c.cCall();
        return null;
    }
//    @ResponseBody
//    @Autowired
//    @GetMapping("/ioc")
//    public Object ioc(C c, D d){
//        c.cCall();
//        return null;
//    }
//    @ResponseBody
//    @GetMapping("/ioc")
//    public Object ioc(@Autowired C c){
//        c.cCall();
//        return null;
//    } @Autowired 사용하는 방법
    @ResponseBody
    @GetMapping("/test")
    public Object startTest(@RequestParam String type) {
        if("old".equals(type)) {
            testService1.test();
        } else {
            testService2.test();
        }
        return null;
    }
}
