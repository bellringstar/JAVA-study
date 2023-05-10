package com.in28minutes.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class PackManGame implements GamingConsole{

	@Override
	public void up() {
		System.out.println("PackMan up");
		
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("PackMan down");
		
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("PackMan left");
		
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("PackMan right");
		
	}

}
