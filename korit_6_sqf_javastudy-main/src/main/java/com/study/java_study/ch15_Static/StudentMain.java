package com.study.java_study.ch15_Static;
/*
   싱글톤 디자인 패턴
   1. 객체를 유일하게 하나만 생성하여 사용하는 기법
   2. 생성자가 private으로 외부에서는 생성 할 수 없다.
 */
public class StudentMain {
    public static void main(String[] args) {
        StudentService studentService = StudentService.getInstance();
        StudentService studentService2 = StudentService.getInstance();
//      StudentRepository studentRepository = StudentRepository.getInstance();

//      StudentRepository studentRepository = new StudentRepository();
//      studentRepository.add("정상훈");
//      studentService.addStudent(studentRepository);
        // 같은 객체 생성 코드 (안씀)

        studentService.addStudent();
        StudentRepository.getInstance().add("정상훈");
        studentService2.addStudent();

        studentService.getStudentData();
    }
}
