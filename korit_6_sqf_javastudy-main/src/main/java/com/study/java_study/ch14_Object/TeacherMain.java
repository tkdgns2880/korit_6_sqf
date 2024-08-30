package com.study.java_study.ch14_Object;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("정상훈", 31);
        Teacher teacher2 = new Teacher("정상훈", 31);
        System.out.println(teacher1);

        System.out.println(teacher1.hashCode() == teacher2.hashCode());
        System.out.println(teacher1.equals(teacher2));
    }
}
