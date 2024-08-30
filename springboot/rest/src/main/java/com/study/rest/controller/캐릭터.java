package com.study.rest.controller;

import com.study.rest.di.무기;
import com.study.rest.di.방패;
import com.study.rest.di.칼;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class 캐릭터 {

    @Autowired
    @Qualifier("총")
    // 갖고오고싶은 객체 이름을 정해준다
    // "총", "칼" 만 변경해주면 객체의 기능을 사용할 수 있다
    private 무기 weapon;

    @Autowired
    @Qualifier("물리공격방패")
    private 방패 shield;

    @ResponseBody
    @GetMapping("/maple/attack")
    public Object mapleAttack() {
//      weapon = new 칼(); // 결합도가 높은 코드 DI가 아니다
        weapon.공격();
        return null;
    }
    @ResponseBody
    @GetMapping("/maple/defence")
    public Object mapleDefence() {
        shield.방어();
        return null;
    }
}
