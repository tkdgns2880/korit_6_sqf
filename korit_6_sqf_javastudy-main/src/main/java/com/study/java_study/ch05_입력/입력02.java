package com.study.java_study.ch05_입력;

import java.util.Scanner;

public class 입력02 {
    public static void main(String[] args) {
        String name = null;     //next()
        int age = 0;            //nextInt()
        String address = null;  //nextLine()
        String gender = null;   //next()
        String phone = null;    //nextLine()

        // 선언은 한번만 사용. String

        /*
        이름: 정상훈
        나이: 31
        주소: 부산 남구 전포대로
        성별: 남
        연락처: 010-7131-9648
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("name: ");
        name = scanner.next(); // 엔터가 남는다.
        System.out.print("age: ");
        age = scanner.nextInt(); // 엔터를 날린다.
        scanner.nextLine(); // 남은 엔터를 한번 지워준다.
        System.out.print("address: ");
        address = scanner.nextLine(); // 엔터를 남길시 Line 줄바꿈 허용
        System.out.print("gender: ");
        gender = scanner.next();
        scanner.nextLine(); // next() 다음은 Line() 으로 엔터를 한번 지워줘야 다음행으로 안넘어간다.
        System.out.print("phone: ");
        phone = scanner.nextLine();

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("주소: " + address);
        System.out.println("성별: " + gender);
        System.out.println("연락처: " + phone);
    }
}
