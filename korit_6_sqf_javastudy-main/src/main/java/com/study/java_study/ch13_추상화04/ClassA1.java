package com.study.java_study.ch13_추상화04;

public class ClassA1 extends ClassA{ // @Override 호출 -> ctrl + i
    @Override // 오버라이드
    public void print(InterfaceA interfaceA) { // interfaceA -> DI
        System.out.println("A1 클래스에서 print호출");
        interfaceA.test();
    }
}
// public void print() { 오버로딩
//        System.out.println("A1 클래스에서 print호출");