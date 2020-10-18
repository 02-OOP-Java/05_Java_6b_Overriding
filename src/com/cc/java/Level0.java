package com.cc.java;

public class Level0 extends Level1{

	private int points = 10;
	
	public void play() {
		if (LevelManager.isPlayerInLevel0()) {
			System.out.println("Hi, I have " + points + " points!");
		} else {
			super.play();
		}
	}
}
