package com.study.rest.controller;

import com.study.rest.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CarController {

    /*
    * 요청 GET - /car?model=K5
    *
    * CarEntity     -> model, color //
    * CarRepository -> Car findCarByModel(String model)
    *       -> List<Car>
                -> index0: Car(model : "쏘나타", color : "화이트")
                -> index1: Car(model : "k5", color : "블랙")
    * CarService    -> Car getCar(String model)
    * CarController -> Car getCar(@RequestParam String model)
    *
    * CarController > CarService > CarRepository 의존관계
    *       - 의존성이 없는것부터 차례대로 만들어라
    * */
    @Autowired
    private CarService carService;

    @ResponseBody
    @GetMapping("/car")
    public Object getCar(@RequestParam String model) {
        return carService.getCar(model);
    }
}
