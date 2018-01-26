package com.curso.dao;

import java.util.List;

import com.curso.model.Car;

public interface CarDao {
 
    public void create(Car car);
 
    public void update(Car car);
 
    public void delete(Car car);
 
    public void deleteAll();
 
    public Car find(Car car);
 
    public List < Car > findAll();
}
