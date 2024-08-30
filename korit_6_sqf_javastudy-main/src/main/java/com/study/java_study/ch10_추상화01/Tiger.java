package com.study.java_study.ch10_추상화01;

public class Tiger extends Animal{
    private int power;

    public Tiger() {
        super();
        System.out.println("호랑이 객체 생성");
    }
    public Tiger(String name, int age, int power) {
        // 부모 객체 extends Animal 를 생성할때 name, age 를 넘겨 받았다.
        super(name, age);
        this.power = power;
    }
    // 재정의 -> 상속관계에서만 가능 똑같은 메소드를 넣을수 있다
    @Override // @ -> 어노테이션 @Override(재정의) : 없어도 동작하고 있어도 동작을 한다
    public void move() {
        System.out.println("호랑이가 네발로 뛰어갑니다.");
        super.move(); // 상속관계가 갖고 있는 메소드를 다시 실행시킬수 있다.
    }
    public void hunt() {
        System.out.println("호랑이가" + power + "의 힘으로 사냥을 합니다.");
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "power=" + power +
                "} " + super.toString();
    }
}
