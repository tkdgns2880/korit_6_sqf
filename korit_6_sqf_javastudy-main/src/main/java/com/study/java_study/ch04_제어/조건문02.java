package com.study.java_study.ch04_제어;

public class 조건문02 {
    public static void main(String[] args) {
        String text = new String("");
        String name = "김준일";       //값의 자료형 String
        String phone = "01099881916";    //값의 자료형 null

        //        System.out.println(text.length());
        //        System.out.println(name.length());
        //        System.out.println(phone.length());

        StringUtils stringUtils = new StringUtils();

        if(stringUtils.isEmpty(name)) {
            System.out.println("name이 비어있습니다.");
            return;
        } // else if -> if 만 따로 쓰는게 시스템에 좋다. 필요할때만 else if 사용.
        if(stringUtils.isEmpty(phone)) {
            System.out.println("phone이 비어있습니다.");
            return;
        }
        if(stringUtils.isEmpty(text)) {
            System.out.println("text가 비어있습니다.");
            return; // 마지막 문장에는 return 을 쓸 필요가 없다.
        }

    }
}
