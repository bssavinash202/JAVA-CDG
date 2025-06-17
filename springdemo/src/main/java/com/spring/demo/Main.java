package com.spring.demo;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

	public static void main(String[] args) {
//		//using applicationcontext
		System.out.println("using application context");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		//creating object without new keyword using spring context
//		MyBean bean = (MyBean) context.getBean("myBean");
//		bean.setMessage("Hello Avinash Spring..!");
//		System.out.println(bean.getMesage());
		
		//using beanFactory
		System.out.println();
		System.out.println("using bean factory");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new ClassPathResource("spring.xml"));
		
//		MyBean mybean = (MyBean) factory.getBean("myBean");
//		mybean.setMessage("Hello Avinash Spring..!");
//		System.out.println(mybean.getMesage());
	}

}
