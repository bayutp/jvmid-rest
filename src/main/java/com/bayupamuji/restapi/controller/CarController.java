package com.bayupamuji.restapi.controller;

import com.bayupamuji.restapi.domain.Car;
import com.bayupamuji.restapi.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/cars")
public class CarController {
    @Autowired
    private CarRepository carRepository;

    @GetMapping("/getCars")
    public Iterable<Car> getCars() {
        return carRepository.findAll();
    }

    @GetMapping("getCarById/{id}")
    public Optional<Car> getCarById(@PathVariable("id") String id) {
        return carRepository.findById(Long.parseLong(id));
    }

    @PostMapping("/addCar")
    public Car addCar(@RequestBody Car car) {
        return carRepository.save(car);
    }

    @DeleteMapping("deleteCar/{id}")
    public void deleteCarById(@PathVariable("id") Long id) {
        carRepository.deleteById(id);
    }
}
