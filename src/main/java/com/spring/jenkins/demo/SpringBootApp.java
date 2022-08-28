package com.spring.jenkins.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApp {
	
	public static Logger logger = LoggerFactory.getLogger(SpringBootApp.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application Started ......");
		logger.info("Second Commit ......");
	}

	public static void main(String[] args) {
		logger.info("Application Executed ......");
		SpringApplication.run(SpringBootApp.class, args);
	}

}
