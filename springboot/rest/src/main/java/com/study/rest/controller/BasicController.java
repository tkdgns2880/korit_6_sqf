package com.study.rest.controller;

import com.study.rest.dto.*;
import com.study.rest.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


// REST API
@Slf4j // 로그를 찍는 포제이
@RestController // 무조건 응답이 데이터
// @RestController 뷰(html) 파일이 필요가 없다
public class BasicController {

    @Autowired
    private ProductService productService;

    /**
     * REST API
     * 데이터 통신을 위한 HTTP 요청 방식
     * HTTP(프로토콜)을 조금 더 잘 쓰기 위해서 정의된 개념
     * 1. 요청에 대한 동작은 무조건 메소드에 따라 정의하자
     *     - 데이터 추가(등록)은 POST 요청으로 하자,
     *          그리고 POST 요청은 JSON 데이터로 요청하자
     *     - 데이터 조회는 GET 요청으로 하자,
     *          그리고 GET 요청은 QueryString(params) 으로 요청하자
     *          예) 주소? key1 = value1 & key2 = value2
     *     - 데이터 수정은 PUT, Patch 요청으로 하자, JSON 으로 요청하자
     *     - 데이터 삭제는 DELETE 요청으로 하자, params 으로 요청하자
     *     (추가, 수정) (조회, 삭제)
     * ///////////////////////////////////////////////////////////////////////
     *     PUT 요청과 PATCH 요청의 차이점
     *     PUT 요청 : 공백 또는 NULL 인 데이터도 수정함
     *     PATCH 요청 : 공백 또는 NULL 인 데이터는 수정을 하지 않음(부분요청)
     *
     * 2. 주소(URL) 요청 메세지(Resource) 자원 작성법
     *     - URL 은 가능한 동사를 사용하지 않는다
     *     - 계층 구조로 작성한다
     *          예) /집/주방/가스레인지, /식당/주방/가스레인지
     *     - 요청 메소드 마다 작성하는 방법이 다르다
     *       (주소는 같지만 요청에 따라 동작이 달라진다)
     *          상품 등록(POST) /product
     *          상품 하나(단건) 조회(GET) /product/1(id, key)
     *          상품 여러개(다건) 조회(GET) /products(전체조회),
     *              /products ? page = 1 & count = 30(한페이지에 30개씩조회)
     *          상품 수정(PUT) /product/1(id, key)
     *          상품 삭제(DELETE) /product/1(id, key)
     *
     * 3. 주소는 가능한 대문자를 사용하지 않는다
     *
     *
     */

//    private final Logger logger = LoggerFactory.getLogger(BasicControl.class); -> log.info 사용하는 생성자 코드
    // log,info 를 사용하기 위해서는 lombook를 다운받아야 한다

    @CrossOrigin
    @PostMapping("/basic/student") // 추가할때 쓰는 PostMapping
    public ResponseEntity<?> basicPost(@RequestBody ReqStudentDto reqStudentDto) {
//      요청때 @RequestBody 는 JSON으로 받을때만 받아온다
        log.info("Student : {}", reqStudentDto); // @Slf4j 사용하는 문법
        return ResponseEntity.badRequest().body(null); // ok() -> 상태코드 200
        // 리턴 뒤에는 객체 형태로 리턴해줘야한다
    }// API 코드

    // C(controller) <--> S(service) <--> R(register) <--> DB(데이터베이스)
    // Dto -> 요청과 응답용으로만 사용하는게 Dto 이다
    @CrossOrigin
    @PostMapping("/api/v1/product")
    public ResponseEntity<?> registerProduct(@RequestBody ProductDto.Register register) {
//        log.info("{}", reqProductDto);
        return ResponseEntity.ok().body(productService.registerProduct(register));
    }

    @CrossOrigin
    @GetMapping("/api/v1/sizes")
    public ResponseEntity<?> sizeListApi() {
        return ResponseEntity.ok().body(productService.getSizeListAll());
    }
    @CrossOrigin
    @GetMapping("/api/v1/colors")
    public ResponseEntity<?> colorListApi() {
        return ResponseEntity.ok().body(productService.getColorListAll());
    }
    @CrossOrigin
    @PostMapping("/api/v1/size")
    public ResponseEntity<?> registerSizeApi(@RequestBody ReqRegisterSizeDto reqRegisterSizeDto) {
    log.info("{}", reqRegisterSizeDto);
        return ResponseEntity.ok().body(productService.registerSize(reqRegisterSizeDto));
    }
    @CrossOrigin
    @PostMapping("/api/v1/color")
    public ResponseEntity<?> registerColorApi(@RequestBody ReqRegisterColorDto reqRegisterColorDto) {
        log.info("{}", reqRegisterColorDto);
        return ResponseEntity.ok().body(productService.registerColor(reqRegisterColorDto));
    }
}
