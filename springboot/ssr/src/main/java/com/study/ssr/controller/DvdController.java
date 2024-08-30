package com.study.ssr.controller;

import com.study.ssr.model.Dvd;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

// MVC 패턴
// Controller -> GetMapping -> 뷰네임

@Controller
public class DvdController {

    @GetMapping("/dvds")
    public String dvdListPage(Model model) {
        Dvd dvd = Dvd.builder()
                .title("테스트")
                .producer("테스트 제작사")
                .publisher("테스트 발행사")
                .build();
        Dvd dvd2 = Dvd.builder()
                .title("테스트2")
                .producer("테스트 제작사2")
                .publisher("테스트 발행사2")
                .build();
        Dvd dvd3 = Dvd.builder()
                .title("테스트3")
                .producer("테스트 제작사3")
                .publisher("테스트 발행사3")
                .build();
        model.addAttribute(dvd); // 객체
        model.addAttribute("names", List.of("정상훈", "정상일", "정상이")); // 리스트
        model.addAttribute("dvdList", List.of(dvd, dvd2, dvd3)); // 리스트
        model.addAttribute("title", "테스트 제목"); // 리터럴
        return "views/dvd_list"; // 리턴이 스트링이면 무조건 views/dvd_list 뷰네임 dvd_list-html (파일명)
    } // 리턴은 무조건 String

//    @GetMapping("/dvds")
//    public ModelAndView dvdListPage() {
//        ModelAndView mav = new ModelAndView();
//        mav.setViewName("views/dvd_list");
//        return mav;
//    } 위에 코드랑 동일한 코드

    @ResponseBody
    // ResponseBody -> 데이터응답으로 변환시켜준다(문자열)
    // 응답데이터가 바로 리턴해준다
    @GetMapping("/dvds/body")
    public String getViewName() {
        return "views/dvd_list";
    } // 클라이언트 - 디스페치서블릿 - html - 응답

    @ResponseBody // ResponseBody 를 사용하지 않으면 뷰응답으로 변해버린다
    // ResponseBody 객체로 응답하면 JSON으로 변환시켜 응답한다(자동변환)
    @GetMapping("/dvd")
    public Object getDvd() {
        Dvd dvd = Dvd.builder()
                .title("테스트")
                .producer("테스트 제작사")
                .publisher("테스트 발행사")
                .build();
        Dvd dvd2 = Dvd.builder()
                .title("테스트2")
                .producer("테스트 제작사2")
                .publisher("테스트 발행사2")
                .build();
        Dvd dvd3 = Dvd.builder()
                .title("테스트3")
                .producer("테스트 제작사3")
                .publisher("테스트 발행사3")
                .build();
        return List.of(dvd, dvd2, dvd3);
    }
}
