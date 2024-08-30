package com.study.java_study.ch14_Object;

import java.util.Objects;

/*
   Object 클래스(최상위 클래스)

 */
public class ObjectMain { // 모든 클래스 위에 extends Object 상속되어 있다.
    public static void main(String[] args) {
        Object object = new Object();
        Student student = new Student("정상훈", 31);
        Student student2 = new Student("정상훈", 31);
        // Object 의 핵심
        Object[] objects = new Object[3];
        objects[0] = new Object();
        objects[1] = "test";
        objects[2] = new Student("정상훈", 31);
        //
        System.out.println(student.toString()); // .toString() 변수명만 입력해도 생략 가능
        String str = "데이터";
//      String str = new String("데이터"); String 에 String 을 부르는 작업
        System.out.println(str.equals(false));

        String studentData = student.toString();

        System.out.println(student.equals(student2));

        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());

        System.out.println(student.hashCode() == student2.hashCode());
        System.out.println(Objects.hash("정상훈"));
        System.out.println(Objects.hash("정상훈"));


    }
}
