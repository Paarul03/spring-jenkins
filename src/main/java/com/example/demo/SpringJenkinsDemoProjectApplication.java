package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;



@SpringBootApplication
public class SpringJenkinsDemoProjectApplication {

	public static Logger log = LoggerFactory.getLogger(SpringJenkinsDemoProjectApplication.class);
	
	@PostConstruct 
	public void intt()
	{
		log.info("Application started successfully..");
	}
	
	public static void main(String[] args) {
		log.info("Application executed....");
		SpringApplication.run(SpringJenkinsDemoProjectApplication.class, args);
	}

}
