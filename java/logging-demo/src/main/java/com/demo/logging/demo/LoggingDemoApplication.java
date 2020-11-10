package com.demo.logging.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class LoggingDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(LoggingDemoApplication.class, args);
	}

}
