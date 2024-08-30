package com.study.java_study.ch10_추상화01;

public class Dog extends Animal{ // extends Animal 확장 생성자
    private String breed;

    public Dog() { // extends Animal 확장 생성자 뒤에 출력
        super(); // super(); 만 생성할때는 항상 제일 위에 와야한다.
        System.out.println("강아지 객체 생성");
    }
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    // ctrl + o
    @Override
    public void move() {
        System.out.println("강아지가 네발로 움직입니다.");
    }
    public void bark() {
        System.out.println(breed + "종의 강아지가 짖습니다.");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
