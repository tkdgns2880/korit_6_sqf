package com.study.java_study.ch06_배열;

public class ArrayMain01 {

    public static void main(String[] args) {
        int[] nums = new int[100];
        // 배열은 [] 써서 생성한다. 숫자의 순서는 0부터 시작된다.
        // 배열을 쓰는 이유는 반복.

        for(int i = 0; i < 100; i++) {
            nums[i] = (i + 1) * 10;
        }
        for(int num : nums) { // 처음부터 끝까지 반복할때 사용하는 코드.
            System.out.println(num);
        }
        for(int i = 0; i < nums.length; i++) {
            if(i % 2 == 0) {
                continue;
            }
            int num = nums[i];
            System.out.println(num);
        }
    }
}
