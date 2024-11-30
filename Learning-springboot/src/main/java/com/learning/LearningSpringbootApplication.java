package com.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearningSpringbootApplication {

	public static void main(String[] args) {

		ApplicationContext context= SpringApplication.run(LearningSpringbootApplication.class, args);
		Dev demo = context.getBean(Dev.class);
		demo.build();
	}

}
