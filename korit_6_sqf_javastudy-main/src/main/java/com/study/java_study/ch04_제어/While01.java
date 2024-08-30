package com.study.java_study.ch04_제어;

import java.util.Random;
import java.util.Scanner;

public class While01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); // 랜덤으로 먼가를 스캔할때 사용.
        int num = random.nextInt(10); // 10을 입력시 0 ~ 9까지 중 랜덤한 숫자를 가져온다.
        // random.nextInt(10) + 1 을 입력시 1 ~ 10까지 중 랜덤한 숫자를 가져온다.
        while(true) {
            System.out.print("입력: ");
            int date = scanner.nextInt();
            if(num == date) {
                System.out.println("정답은: " + date + "입니다.");
                break;
            }
            System.out.println("틀렸습니다. 다시 입력하세요.");
        }
    }
}
