package com.study.rest.controller;

import com.study.rest.dto.ReqGetListDto;
import com.study.rest.dto.ReqRegisterComputerDto;
import com.study.rest.dto.ReqUpdateComputerDto;
import com.study.rest.service.ComputerServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/api/v1")
// RequestMapping 을 class 위에다 붙여 놓으면 주소값앞에 붙는다
public class ComputerController {

    @Autowired
    private ComputerServiceImpl computerService;

    @PostMapping("/computer")
    public ResponseEntity<?> registerApi(@RequestBody ReqRegisterComputerDto reqDto) {
        log.info("{}", reqDto);
        return ResponseEntity.ok().body(computerService.registerComputer(reqDto));
        // ok와 body만 사용할거면 ok(body()); 를 사용해도 된다
    }
    @PutMapping("/computer/{computerId}")
    public ResponseEntity<?> modifyApi(@PathVariable int computerId, @RequestBody ReqUpdateComputerDto reqUpdateComputerDto) {
        return ResponseEntity.ok().body(computerService.updateComputer(reqUpdateComputerDto));
    }
    @GetMapping("/computers")
    public ResponseEntity<?> getListApi(ReqGetListDto reqDto) {
        // get 요청에는 @RequestBody 사용하지 않는다
        log.info("{}", reqDto);
        return ResponseEntity.ok().body(computerService.getComputerList(reqDto));
    }
    // http://localhost8080:/api/v1/computer/3
    @GetMapping("/computer/{computerId}")
    // ResponseEntity 를 사용하면 웹 주소에 객체를 안에 넣을수 있다
    public ResponseEntity<?> getApi(@PathVariable int computerId) {
        log.info("{}", computerId);
        return ResponseEntity.ok().body(computerService.getComputer(computerId));
    }
    @DeleteMapping("/computer/{computerId}")
    public ResponseEntity<?> removeApi(@PathVariable int computerId) {
        return ResponseEntity.ok().body(computerService.deleteComputer(computerId));
    }
}
