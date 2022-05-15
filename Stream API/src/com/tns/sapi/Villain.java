package com.tns.sapi;

public class Villain  implements Actor{

	public static void main(String[] args) {
		
	}

	@Override
	public void act() {
		System.out.println("I can act");	
	}

	@Override
	public void speak() {
		System.out.println("I can speak");	
		
	}
	public void rude() {
		System.out.println("I cab berude");
	}

}
