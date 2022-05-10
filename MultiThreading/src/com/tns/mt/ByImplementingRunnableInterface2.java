package com.tns.mt;


class Google2 implements Runnable
{
	public void run() {
		for(int i=0;i<5;i++) {	
			
		System.out.println("Google thread ID is"+ " "+Thread.currentThread().getId());
	}
}
}
class Meet2 implements Runnable {
	public void run() {
		for(int i=0;i<5;i++) {	
		
		System.out.println("Meet thread ID is"+ " "+Thread.currentThread().getId());
	}
}
}

public class ByImplementingRunnableInterface2 {

	public static void main(String[] args) {
		Google2 g=new Google2();
		Thread t=new Thread(g);
		t.start();	
		Meet2 m=new Meet2();
		Thread t1=new Thread(m);
		t1.start();
		
	
		
		
	}

}
