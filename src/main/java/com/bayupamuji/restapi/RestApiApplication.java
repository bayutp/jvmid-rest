package com.bayupamuji.restapi;

import com.bayupamuji.restapi.domain.Car;
import com.bayupamuji.restapi.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CarRepository repository){
		return (args -> {
			repository.save(new Car("toyota","city car","white","bensin",2010));
			repository.save(new Car("datsun","city car","blue","bensin",2011));
			repository.save(new Car("honda","city car","red","bensin",2012));
			repository.save(new Car("honda","city car","white","bensin",2013));
			repository.save(new Car("daihatsu","city car","red","bensin",2014));
			repository.save(new Car("daihatsu","city car","white","bensin",2015));
			repository.save(new Car("datsun","city car","blue","bensin",2016));
			repository.save(new Car("datsun","city car","white","bensin",2017));
			repository.save(new Car("toyota","city car","black","bensin",2018));
			repository.save(new Car("nissan","city car","white","bensin",2019));
			repository.save(new Car("honda","city car","white","bensin",2020));
		});
	}
}
