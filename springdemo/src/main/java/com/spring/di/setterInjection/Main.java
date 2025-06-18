package com.spring.di.setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Movie movie = (Movie) context.getBean("movieBean");
		movie.showMovieInfo();
	}
}
