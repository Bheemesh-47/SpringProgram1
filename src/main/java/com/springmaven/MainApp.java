package com.springmaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student s = (Student) ap.getBean("s1");
		System.out.println(s.getName());
	}
}
