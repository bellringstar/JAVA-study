package com.in28minutes.learnspringframework.game;

public class MarioGame implements GamingConsole {
	
	public void up() {
		System.out.println("Jump");
	}
	
	public void down() {
		System.out.println("GO into a hole");
	}
	public void left() {
		System.out.println("GO back");
	}
	public void right() {
		System.out.println("Accelerate");
	}

}
