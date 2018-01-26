package com.curso.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.CarDao;
import com.curso.model.Car;
 

 
@Service("carService")
public class CarServiceImp implements CarService {
 
    @Autowired
    CarDao carDao;
 
    public void create(Car car) {
        carDao.create(car);
    }
 
    public void update(Car car) {
        carDao.update(car);
    }
 
    public void delete(Car car) {
        carDao.delete(car);
    }
 
    public List < Car > findAll() {
        return carDao.findAll();
    }
 
    public Car find(Car car) {
        return carDao.find(car);
    }
 
    public void deleteAll() {
        carDao.deleteAll();
    }
}
