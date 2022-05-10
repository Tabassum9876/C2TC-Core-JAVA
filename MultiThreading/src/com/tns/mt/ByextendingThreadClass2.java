package com.tns.mt;

class Eclipse2 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {	
		System.out.println("Eclipse thread ID is"+ " "+Thread.currentThread().getId());
	}
}
}

class PPT2 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("PPT thread ID is"+ " "+Thread.currentThread().getId());
	}
}
}
public class ByextendingThreadClass2 {

	public static void main(String[] args) {
		Eclipse2 e=new Eclipse2();
		e.start();
		PPT2 p=new PPT2();
		p.start();	
		
	}

}
