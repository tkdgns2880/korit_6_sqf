package com.study.ssr.controller;

import com.study.ssr.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NameController {

    @GetMapping("/name")
    public ModelAndView namePage() {
        ModelAndView mavname = new ModelAndView();
        mavname.setViewName("views/name");
        mavname.addObject(Student.builder().name("정상훈").age(31).build());
        return mavname;

    }
}
// MVC (디자인패턴)
/*
* Model
*   A, R, S -> setAttribate, getAttribate
* View
*   JSP -> HTML
* Controller
*   Servlet -> URL, Method
* */