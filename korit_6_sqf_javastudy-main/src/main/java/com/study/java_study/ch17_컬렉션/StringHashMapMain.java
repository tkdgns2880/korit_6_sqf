package com.study.java_study.ch17_컬렉션;

import java.util.*;

// of는 정해진 데이터 값만 입력이 가능하다
//   추가로 데이터 값을 넣기 위해서는 new ArrayList() addAll 사용
public class StringHashMapMain { // Map<> = HM, TM
    // Map 키와 값의 한 쌍으로 이루어지는 데이터의 집합으로, 순서가 없음.
    //  이때 키는 중복을 허용하지 않지만, 값은 중복될 수 있음.
    public static void main(String[] args) {
        HashMap<Integer, String> strMap = new HashMap<>();

        strMap.put(10, "정상훈");
        strMap.put(11, "정상일");
        strMap.put(12, "정상이");
        strMap.put(13, "정상삼");

        System.out.println(strMap);

        System.out.println(strMap.get(11));

        Map<String, String> lang = Map.of(
                "java", "자바",
                "c", "C",
                "python", "파이썬",
                "js", "자바스크립트"
        );
        System.out.println(lang);

        System.out.println(lang.get("java"));

        Set<Map.Entry<String, String>> entries = lang.entrySet();

        for(Map.Entry<String, String> entry : entries) {
            // String key, String value -> Map.Entry<String, String> entry
            System.out.println("key: " + entry.getKey());
            System.out.println("value: " + entry.getValue());
        }
//        Map<String, List<Book>> bookList = Map.of(
//                "1열람실", ["Book1", "Book2", "Book3"],
//        "2열람실", ["Book4", "Book5", "Book6"]
//        );
//        bookList.get("1열람실").get(1);
    }
}
