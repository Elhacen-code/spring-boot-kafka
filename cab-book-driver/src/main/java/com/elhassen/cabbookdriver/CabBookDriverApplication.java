package com.elhassen.cabbookdriver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CabBookDriverApplication {

	private static Logger logger = LoggerFactory.getLogger(CabBookDriverApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(CabBookDriverApplication.class, args);
		logger.info("This is my information !");
		logger.debug("I'm here ...");
	}
}