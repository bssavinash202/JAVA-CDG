package com.spring.di.fieldinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
	
	@Autowired
	private Song song;
	
	@Autowired
	private Singer singer;
	
	public void playMusic() {
		song.displaySongDetails();
		singer.sing();
		System.out.println("playing music... !");
	}
}
