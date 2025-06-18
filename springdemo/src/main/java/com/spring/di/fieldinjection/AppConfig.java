package com.spring.di.fieldinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.di.fieldinjection")
public class AppConfig {
	
	@Bean
	public Song song() {
		return new Song("Lovely","Sad");
	}
	@Bean
	public Singer singer() {
		return new Singer("Billy ellish");
	}
}
