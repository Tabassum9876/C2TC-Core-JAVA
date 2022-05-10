package com.tns.mt;

class GoogleMeet1 extends Thread{
	public void run() {
		System.out.println("GoogleMeet1 thread ID is"+ " "+Thread.currentThread().getId());
		System.out.println("GoogleMeet1 thread Priority is"+ " "+Thread.currentThread().getPriority());
		
	}
}

class Classroom1 extends Thread{
	public void run() {
		System.out.println("Classroom1 thread ID is"+ " "+Thread.currentThread().getId());
		System.out.println("Classroom1 thread Priority is"+ " "+Thread.currentThread().getPriority());
		
	}
}

public class ConstantsinThread {

	public static void main(String[] args) {
		GoogleMeet1  gm=new GoogleMeet1();
		gm.start();
		gm.setPriority(Thread.MIN_PRIORITY);
		Classroom1 c=new Classroom1();
		c.start();
		c.setPriority(Thread.MAX_PRIORITY);	
		
		
	}

}
