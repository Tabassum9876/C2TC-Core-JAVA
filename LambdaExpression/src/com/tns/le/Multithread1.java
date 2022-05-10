package com.tns.le;

class Eclipse implements Runnable{
	public void run() {
		System.out.println("I am a Run Method");
	}
}
public class Multithread1 {

	public static void main(String[] args) {
		Eclipse e=new Eclipse();
		Thread t=new Thread(e);
		t.start();
		
	}

}
