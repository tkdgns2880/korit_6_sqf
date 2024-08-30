package com.study.java_study.ch17_컬렉션;

import java.util.*;

public class StringHashSetMain { // Hashset<> = HS, TS
    public static void main(String[] args) {
        HashSet<String> strSet = new HashSet<>();

        // 추가
        strSet.add("정상훈");
        strSet.add("정상일");
        strSet.add("정상이");
        strSet.add("정상삼");

        System.out.println(strSet);

        for(String name : strSet) {
            System.out.println(Objects.hash(name));
        }
        strSet.addAll(List.of("정상훈", "정상일", "정상이"));
        ArrayList<String> strList = new ArrayList<>();
        strList.addAll(strSet);

//        Comparator<String> stringComparator = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return String.CASE_INSENSITIVE_ORDER.compare(o1, o2);
//            }
//        };
//        strList.sort(stringComparator);
        // 밑에 코드를 풀어 놓은 코드
        strList.sort((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o1, o2));

        System.out.println(strList);


    }
}
