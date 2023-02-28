package com.demo.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Student.class);
        Student student1 = (Student)context.getBean("student1");
        Student student2 = (Student) context.getBean("student2");
        System.out.println(student1);
        System.out.println(student2);
    }
    
    
}
