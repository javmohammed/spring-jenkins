package com.spring.jenkins.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty" ,"html:target/cucumber","json:target/cucumber.json"}) 
class SpringBootAppTests {
	
	public static Logger logger = LoggerFactory.getLogger(SpringBootAppTests.class);

	@Test
	void contextLoads() {
		logger.info("Test Case Executed ......");
		assertEquals(true, true);
	}
	
	@Test
	void secondTestCase() {
		logger.info("Second Test Case Executed ......");
		assertEquals(true, true);
	}
	

}
