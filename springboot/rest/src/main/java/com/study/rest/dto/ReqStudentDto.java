package com.study.rest.dto;

import lombok.Data;
import lombok.ToString;

//@ToString // ToString 으로 안에 있는 객체를 불러온다
@Data // Dto 파일은 무조건 Data 를 달아준다
public class ReqStudentDto {
    private String schoolName;
    private String department;
    private int grade;
    private String name;
} // 두개를 연결하기 위한 인터페이스
