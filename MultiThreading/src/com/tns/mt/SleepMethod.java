package com.tns.mt;

class Eclipse3 extends Thread{
	public void run() {
		for(int i=0;i<8;i++) {	
		System.out.println("Eclipse thread ID is"+ " "+Thread.currentThread().getId());
		try
		{
			sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	}
}
public class SleepMethod {

	public static void main(String[] args) {
		Eclipse3 e=new Eclipse3();
		e.start();
		
	}

}
