package com.cc.java;

public class Level1 extends Level2{

	private int points = 100;
	
	public void play() {
		if (LevelManager.isPlayerInLevel1()) {
			System.out.println("Hi, I have " + points + " points!");
		} else {
			super.play();
		}	
	}
	
	
	
	
	
}
