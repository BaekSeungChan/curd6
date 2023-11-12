package com.qortmdcks.crud6.service.Impl;

import com.qortmdcks.crud6.entity.Car;
import com.qortmdcks.crud6.payload.CarDto;
import com.qortmdcks.crud6.repository.CarRepository;
import com.qortmdcks.crud6.service.CarService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private CarRepository carRepository;
    private ModelMapper modelMapper;

    public CarServiceImpl(CarRepository carRepository, ModelMapper modelMapper){
        this.carRepository = carRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public CarDto createCar(CarDto carDto){
        Car car = modelMapper.map(carDto, Car.class);
        Car saveCar = carRepository.save(car);

        return modelMapper.map(saveCar, CarDto.class);
    }

    @Override
    public List<CarDto> getAllCar(){
        List<Car> cars = carRepository.findAll();

        return cars.stream().map((car) -> modelMapper.map(car, CarDto.class)).collect(Collectors.toList());


    }
}
