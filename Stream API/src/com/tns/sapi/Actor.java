package com.tns.sapi;

public interface Actor {
	void act();
	void speak();
	default void dance() {
		System.out.println("I can Dance");
	}

}
