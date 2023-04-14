package com.in28minutes.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class Pacman implements GamingConsole {
	public void up() {
		System.out.println("jump pacman");
	}
	
	public void down() {
		System.out.println("down into a hole pacman");
	}
	
	public void left() {
		System.out.println("stop pacman");
	}
	
	public void right() {
		System.out.println("accelerate pacman");
	}
}
