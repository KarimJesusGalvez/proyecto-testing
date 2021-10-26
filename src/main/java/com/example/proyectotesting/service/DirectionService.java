package com.example.proyectotesting.service;

import com.example.proyectotesting.entities.Direction;
import com.example.proyectotesting.entities.Direction;

import java.util.List;
import java.util.Optional;

public interface DirectionService {

    List<Direction> findAll();

    List<Direction> findByCityAndCountry(String city, String country);
    
    Direction save(Direction direction);

    Integer count();

    boolean deleteById(Long id);
}
