package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsDemoProjectApplicationTests {

	public static Logger log = LoggerFactory.getLogger(SpringJenkinsDemoProjectApplication.class);
	@Test
	void contextLoads() {
		log.info("Tested successfully...");
		assertEquals(true, true);
	}

}
