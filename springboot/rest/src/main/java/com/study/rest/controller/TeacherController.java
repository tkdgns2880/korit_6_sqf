package com.study.rest.controller;

import com.study.rest.dto.ReqTeacherDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class TeacherController {

    @CrossOrigin
    @PostMapping("/basic/teacher")
    public ResponseEntity<?> teacherPost(@RequestBody ReqTeacherDto reqTeacherDto) {
        log.info("teacher : {}", reqTeacherDto);
        return ResponseEntity.badRequest().body(null);
    }
}
