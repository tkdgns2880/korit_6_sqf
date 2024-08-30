package com.study.java_study.ch04_제어;

import java.util.Scanner;

public class While02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("개수: ");
        int count = scanner.nextInt();

        int i = 0;
        while(i < count) { // i < count 를 대입시켜 입력한 숫자만큼 출력한다.
            if(i % 2 == 0) {
                System.out.println("짝수 입니다.");
                i++;
                // continue; 를 입력할때 i++; 를 입력시키지 않을시 숫자가 변하지 않아 짝수로 생각하고 무한반복.
            }
            System.out.println("홀수 입니다.");
            i++; // i 가 0 에서 1 씩 증가를 시켜서 답이 다르다.
            // 반복문 for while 횟수를 입력시 for 문으로 작성하는게 좋다.
            System.out.println("//////////////////////////////////////");

            for(int j = 0; j < count; j++) {
                if(i % 2 == 0) {
                    System.out.println("짝수 입니다.");
                    continue;
                }
                System.out.println("홀수 입니다.");
            }
        }
    }
}
