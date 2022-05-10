package com.tns.mt;


class GoogleMeet extends Thread{
	public void run() {
		System.out.println("GoogleMeet thread ID is"+ " "+Thread.currentThread().getId());
		System.out.println("GoogleMeet thread Priority is"+ " "+Thread.currentThread().getPriority());
		
	}
}

class Classroom extends Thread{
	public void run() {
		System.out.println("Classroom thread ID is"+ " "+Thread.currentThread().getId());
		System.out.println("Classroom thread Priority is"+ " "+Thread.currentThread().getPriority());
		
	}
}
class Zoom2 extends Thread{
	public void run() {
		System.out.println("Zoom2 thread ID is"+ " "+Thread.currentThread().getId());
		System.out.println("Zoom2 thread Priority is"+ " "+Thread.currentThread().getPriority());
		
	}
}

public class ThreadPriority {

	public static void main(String[] args) {
		GoogleMeet  gm=new GoogleMeet();
		gm.start();
		gm.setPriority(5);
		Classroom c=new Classroom();
		c.start();
		c.setPriority(10);	
		Zoom2 z=new Zoom2();
		z.start();
		z.setPriority(8);
		
		
	}

}
