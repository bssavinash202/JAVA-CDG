package com.spring.di.constInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee emp = (Employee) context.getBean("employee");
		emp.showInfo();
	}
}
