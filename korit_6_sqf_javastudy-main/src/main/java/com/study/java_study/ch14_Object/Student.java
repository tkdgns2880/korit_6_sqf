package com.study.java_study.ch14_Object;

import java.util.Objects;

/* 순서 (꼭 필요는 없음)
변수정의선언
생성자
getter and setter
equals
hashCode
toString
 */
public class Student { // 모든 클래스 위에 extends Object 상속되어 있다.
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj.getClass() == this.getClass()) {
            Student student = (Student) obj; // 다운캐스팅
            return Objects.equals(student.name, name) && Objects.equals(student.age, age);
        }
        return false;
    }

    @Override
    public int hashCode() { // hashCode -> 주소값
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
