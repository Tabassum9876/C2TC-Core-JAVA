package com.tns.mt;

class counter{
	int count;
	public synchronized void increment() {
		count++;
	}
}
public class Synchronization {

	public static void main(String[] args) throws Exception {
		counter c=new counter();
		Thread t=new Thread(new Runnable() {
			public void run() {
				c.increment();
			}
		});
		t.start();
		t.join();
		Thread t2=new Thread(new Runnable() {
			public void run() {
				c.increment();
			}
		});
		t2.start();
		t.join();
		System.out.println(c.count);
	}

}
