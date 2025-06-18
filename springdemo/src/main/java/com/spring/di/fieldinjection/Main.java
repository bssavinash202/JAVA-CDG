package com.spring.di.fieldinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
	
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		MusicPlayer mp = context.getBean(MusicPlayer.class);
		mp.playMusic();
	}
}
