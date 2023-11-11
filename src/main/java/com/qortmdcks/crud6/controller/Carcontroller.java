package com.qortmdcks.crud6.controller;

import com.qortmdcks.crud6.payload.CarDto;
import com.qortmdcks.crud6.service.CarService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/car")
public class Carcontroller {
    private CarService carService;

    public Carcontroller(CarService carService){
        this.carService = carService;
    }

    @PostMapping
    public ResponseEntity<CarDto> createCar(@Valid @RequestBody CarDto carDto){
        return new  ResponseEntity<>(carService.createCar(carDto), HttpStatus.OK);
    }

}
