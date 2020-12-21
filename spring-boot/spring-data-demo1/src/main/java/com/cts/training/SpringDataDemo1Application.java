package com.cts.training;

import com.cts.training.entity.Address;
import com.cts.training.entity.Trainee;
import com.cts.training.repo.AddressRepository;
import com.cts.training.repo.TraineeRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringDataDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataDemo1Application.class, args);
	}

	@Bean
	public CommandLineRunner oneToOneMappingDemo(TraineeRepository traineeRepository,
			AddressRepository addressRepository) {
		return args -> {
			log.info("################# oneToOneMappingDemo ################");

			Address a1 = new Address(1, "Mumbai", "MH", "400412");

			Trainee t1 = new Trainee();
			t1.setEmail("rahul.s");
			t1.setFullName("Rahul S");
			t1.setAddress(a1);

			a1.setTrainee(t1);

			addressRepository.save(a1);
			// traineeRepository.save(t1);

			log.info("################# oneToOneMappingDemo ################");
		};
	}

	@Bean
	public CommandLineRunner runner2() {
		return args -> {
			log.info("Runner 2");
		};
	}

}
