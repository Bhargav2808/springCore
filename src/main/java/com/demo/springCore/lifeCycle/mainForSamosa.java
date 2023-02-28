package com.demo.springCore.lifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainForSamosa {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/demo/springCore/lifeCycle/lcconfig.xml");
		Samosa s = (Samosa)context.getBean("samosa");
		System.out.println(s);
		
		context.registerShutdownHook();
	}
}
