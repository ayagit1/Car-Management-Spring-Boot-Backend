package com.getarrays.carmanagement.service;

import com.getarrays.carmanagement.exception.UserNotFoundException;
import com.getarrays.carmanagement.model.Car;
import com.getarrays.carmanagement.repo.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CarService {
    private final CarRepo carRepo;

    @Autowired
    public CarService(CarRepo carRepo) {
        this.carRepo = carRepo;
    }

    public Car addCar(Car car){
        car.setOwnerCode(UUID.randomUUID().toString());
        return carRepo.save(car);
    } //deals with jpa repo

    public List<Car> findAllCars(){
        return carRepo.findAll();
    }

    public Car updateCar(Car car){
        return carRepo.save(car);

    }

    public Car findCarById(Long id){
        return carRepo.findCarById(id).orElseThrow(()->new UserNotFoundException("Information by id" + id + " not found"));
    }

    public void deleteCar(Long id){
        carRepo.deleteCarById(id);
    }


}
