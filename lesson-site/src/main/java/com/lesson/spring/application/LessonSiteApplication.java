package com.lesson.spring.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.lesson.spring.sitemesh.SiteMeshConfig;

@SpringBootApplication
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class,SecurityAutoConfiguration.class })
public class LessonSiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(LessonSiteApplication.class, args);
	}
	
	/*@Bean
	public FilterRegistrationBean siteMeshFilter(){
		FilterRegistrationBean fitler = new FilterRegistrationBean();
		SiteMeshConfig siteMeshFilter = new SiteMeshConfig();
		fitler.setFilter(siteMeshFilter);
		return fitler;
	}*/
}
