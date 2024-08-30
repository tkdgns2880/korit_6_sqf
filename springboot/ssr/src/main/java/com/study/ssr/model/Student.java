package com.study.ssr.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Student {
    private String name;
    private int age;
}
/**
/ MVC 패턴을 사용하는 이유
 * model1 에서는 JSP -> 태그(뷰)와 자바코드(모델)을 한파일에 같이 사용했다
 *
 * model2 에서는 JSTL -> 태그(뷰)와 자바코드(모델)을 분리하여 사용했다
 *
 * MVC
 * 컨트롤러 -> 뷰모양은 똑같다 모델 데이터만 바뀐다 (뷰의 제사용성을 이용함)
 * 어떤뷰와 어떤모델을 어떻게 분활할지 어떻게 사용할지 그거를 컨트롤러가 제어를 하게 도와주는 역활을한다
 *
 * model -> 변할수 있는 모든 수(값)을 넣을수 있는 Map
 *
 *클라이언트 -> 요청url (HTTP프로토콜의 양식) -> 톰캣 -> 호출 -> (디스패처 서블릿)
 *      -> 호출 -> (핸들러맵핑) -> 호출해야하는 메소드 -> 디스패치 서블릿 -> model
 *          -> 컨트롤러 -> 뷰네임 -> 뷰리절브 -> 뷰(렌더링) -> 톰캣 -> 응답 -> 클라이언트
 * @Reapasebody - 컨트롤러에서 리스폰스바디를 사용하면 스트링 등 을 이용하여 뷰네임을 변경할 수 있다
 *
 * 객체들만 JOSN(제이슨)으로 리턴이된다
 *
 * 요청을하면 톰캣에서 httpServletReqwest, httpServletReapase 생성한다
 *
 * HTTP
 *      -> Reqwest
 *              1 header -> 정보 (메소드, URL, 서버IP, 서버POLT)
 *              2 body -> 데이터 (파라미터)
 *      -> Reapase
 *              1. header -> 정보 (쿠키정보, 응답컨텐츠)
 *              2. body -> 응답데이터 (JSOLL, HTML)
 *
 * 코드안에 메소드랑 코드가 없어도 메소드 이름만 알면 어디서든 호출할 수 있다
 */
