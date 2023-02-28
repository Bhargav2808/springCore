package com.demo.springCore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainForPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/demo/springCore/ci/ciconfig.xml");
		Person p = (Person) context.getBean("p1");

		System.out.println(p);

	}

}
