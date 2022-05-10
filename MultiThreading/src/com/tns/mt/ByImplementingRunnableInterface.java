package com.tns.mt;

class Google implements Runnable
{
	public void run() {
		System.out.println("Google thread ID is"+ " "+Thread.currentThread().getId());
	}
}
class Meet implements Runnable {
	public void run() {
		System.out.println("Meet thread ID is"+ " "+Thread.currentThread().getId());
	}
}

public class ByImplementingRunnableInterface {

	public static void main(String[] args) {
		Google g=new Google();
		Thread t=new Thread(g);
		t.start();	
		Meet m=new Meet();
		Thread t1=new Thread(m);
		t1.start();
		
	}

}
