package com.tns.mt;

class Eclipse extends Thread{
	public void run() {
		System.out.println("Eclipse thread ID is"+ " "+Thread.currentThread().getId());
	}
}

class PPT extends Thread{
	public void run() {
		System.out.println("PPT thread ID is"+ " "+Thread.currentThread().getId());
	}
}
class Zoom extends Thread{
	public void run() {
		System.out.println("Zoom thread ID is"+ " "+Thread.currentThread().getId());
	}
}


public class ByextendingThreadClass {

	public static void main(String[] args) {
		Eclipse e=new Eclipse();
		e.start();
		PPT p=new PPT();
		p.start();
		Zoom z=new Zoom();
		z.start();
		
	}

}
