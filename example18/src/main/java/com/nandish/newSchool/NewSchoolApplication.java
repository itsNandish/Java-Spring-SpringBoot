package com.nandish.newSchool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@SpringBootApplication
public class NewSchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewSchoolApplication.class, args);
	}
}
