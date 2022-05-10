package com.tns.le;


interface Lamda{
	public void demo();
}
public class Multithread2 {

	public static void main(String[] args) {
		new Thread(()->{System.out.println("I am a Run Method");}).start();
		
	}

}
