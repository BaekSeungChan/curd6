package com.qortmdcks.crud6.service;


import com.qortmdcks.crud6.payload.CarDto;

import java.util.List;

public interface CarService {

    CarDto createCar(CarDto carDto);

    List<CarDto> getAllCar();
    

}
