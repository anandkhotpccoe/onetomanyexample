package com.example.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onetomany.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {

}
