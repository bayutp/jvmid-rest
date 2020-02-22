package com.bayupamuji.restapi.repository;

import com.bayupamuji.restapi.domain.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {

}
