package com.study.java_study.ch21_스트림;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        // Stream
        /*
           생성(사용) 절차
           1. 배열 생성 -> 스트림(Stream)으로 변환
           2. List 생성 -> 스트림(Stream)으로 변환
           3. generate 메소드 -> 스트림(Stream) 생성
           4. 범위 지정 -> 스트림(Stream) 생성
           5. 빌더 -> 스트림(Stream) 생성

           중간(가공) 절차
           1. map(Function)
           2. filter(Predicate)
           3. sorted(Comparator)

           최종(결과) 절차
           1. collect -> stream 을 List 변환
           2. forEach -> 반복 사용
         */

        Stream<Integer> st1 = Arrays.stream(new Integer[] {1, 2, 3, 4, 5}); // 스트림 생성
        List<Integer> numberList = st1.map(n -> n * 2) // 가공
                .peek(n -> System.out.println(n)) // 가공(기타 스트림 메소드) 추가
                .collect(Collectors.toList()); // 최종 결과
        // 스트림이 실행될때 중간 점검할때 사용
        numberList.forEach(n -> System.out.println("n: " + n));

        List<Integer> filttringNumberList = numberList.stream()
                .map(n -> n / 2)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(filttringNumberList);

        List<Integer> sortedNumberList = numberList.stream()
                .sorted((o1, o2) -> o2 - o1)
                // sorted 오름차순(o1 - o2) 내림차순(o2 - o1) 정렬하는 메서드
                .collect(Collectors.toList());
        System.out.println(sortedNumberList);

        Stream<String> nameStream = Stream.<String>builder()
                .add("정상훈")
                .add("정상일")
                .add("정상이")
                .add("정상삼")
                .add("정상사")
                .build();
//      nameStream.sorted().forEach(name -> System.out.println(name));
        nameStream.sorted((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o2, o1))
                // 문자를 정렬 할 때 String.CASE_INSENSITIVE_ORDER.compare(o2, o1)를 사용한다
                .forEach(name -> System.out.println(name));

        List<Phone> phoneList = List.of(
                Phone.builder().number(1).model("아이폰").build(),
                Phone.builder().number(2).model("갤럭시").build(),
                Phone.builder().number(3).model("샤오미").build()
        );
        phoneList.stream()
                .map(phone -> Phone.builder()
                .number(phone.getNumber() * 2)
                .model(phone.getModel())
                .build())
                .forEach(phone -> System.out.println(phone));

        phoneList.stream()
                .filter(phone -> phone.getNumber() % 2 != 0)
                .forEach(phone -> System.out.println(phone));

        phoneList.stream()
                .sorted((o1, o2) -> o2.getNumber() - o1.getNumber())
                .forEach(phone -> System.out.println(phone));
        // 숫자로 정렬하는 방법

        phoneList.stream()
                .sorted((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o1.getModel(), o2.getModel()))
                .forEach(phone -> System.out.println(phone));
        // .forEach(System.out :: println); 이렇게도 사용
        // 문자로 정렬하는 방법
    }
}
