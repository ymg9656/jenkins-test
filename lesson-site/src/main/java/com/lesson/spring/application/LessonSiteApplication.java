package com.lesson.spring.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

@SpringBootApplication(scanBasePackages= {"com.lesson"})
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class,SecurityAutoConfiguration.class })
public class LessonSiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(LessonSiteApplication.class, args);
	}
}
