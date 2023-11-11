package com.qortmdcks.crud6.repository;

import com.qortmdcks.crud6.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
