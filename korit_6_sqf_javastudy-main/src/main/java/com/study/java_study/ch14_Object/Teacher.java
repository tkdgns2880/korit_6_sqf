package com.study.java_study.ch14_Object;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor

//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data // 위에 명령어가 다 포함
public class Teacher {
    private String name;
    private int age;
}
