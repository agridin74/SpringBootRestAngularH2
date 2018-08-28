package com.example.flower;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlowerSpringBootRestH2Application {
	private static Logger logger = LoggerFactory.getLogger(FlowerSpringBootRestH2Application.class);
	public static void main(String[] args) {
		SpringApplication.run(FlowerSpringBootRestH2Application.class, args);
		logger.info("Start example =====>>>>");
	}
}
