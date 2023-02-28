package com.demo.springCore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.springCore.Student;

public class mainForAB {
	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("com/demo/springCore/ref/refconfig.xml");
	        B b = (B)context.getBean("bref");
	        A a = (A) context.getBean("aref");
	        System.out.println(b);
	        System.out.println(a);
	}
}
