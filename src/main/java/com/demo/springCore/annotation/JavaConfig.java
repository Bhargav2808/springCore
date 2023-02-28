package com.demo.springCore.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.demo.springCore.annotation")
public class JavaConfig {
	
	@Bean
	public Students getStudents() {
		Students student = new Students();
		return student;
	}
}
