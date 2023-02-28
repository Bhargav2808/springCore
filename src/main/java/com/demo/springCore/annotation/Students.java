package com.demo.springCore.annotation;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("first")
public class Students {
	
	public void study() {
		System.out.println("Reading a book");
	}
}
