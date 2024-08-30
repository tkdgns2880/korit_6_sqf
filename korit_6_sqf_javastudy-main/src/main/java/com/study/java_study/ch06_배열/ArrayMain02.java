package com.study.java_study.ch06_배열;

public class ArrayMain02 {
    public static void main(String[] args) {
        // main 에서 a 에 바로 코드를 넣어서 주소가 똑같다.
        // new 를 추가하여 b 코드에 넣었기 때문에 주소가 다르다.
        // 배열은 설정한 뒤 늘리거나 줄일수 없다.
        String a = "정상훈"; // 999
        String b = new String("정상훈"); // 200 -> 999

        System.out.println(a);
        System.out.println(b);

        System.out.println(a == "정상훈");
        System.out.println(b == "정상훈");

        String[] names = new String[2]; // 2개를 나눠서 넣는 코드
        names[0] = "정상훈";
        names[1] = new String("정상훈");

        String[] names2 = new String[] {"정상훈", new String("정상훈")}; // 2개를 한번에 넣고 풀어낸 코드
        // String[] names2 = new String[] 안에 숫자를 넣으면 안된다.

        System.out.println(names[0] == names2[0]);
        System.out.println(names[1] == names2[1]);
        System.out.println(names[1] == names2[1]);
        System.out.println(names == names2);

        int n = 10;

        n = n + 1;
        n++;
        n += 1;
        // int n = 10; (n = n + 1;) (n++;) (n += 1;) 셋다 같은 코드이다.

        System.out.println(new String[2]);
        System.out.println(new String[] {"a", "b"});
        // System.out.println({"a", "b"}); 생성이 안되는 코드.
    }
}
