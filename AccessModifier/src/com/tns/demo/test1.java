package com.tns.demo;

public class test1 {
	
    public int i = 10;                                  
	public void show() {
		System.out.println("In show method");
	}

	public static void main(String[] args) {
		test1 obj = new test1();
		obj.show();
		System.out.println(obj.i);
	  

	}
}

                                                 /*AccessModifiers types
                                                 1.private   - s1             (test-1)
                                                 2.default   - s1, s2         (test-1,2)
                                                 3.protected - s1, s2, s3     (test-1,2,3)
                                                 4.public    - s1,s2, s3, s4  (test-1,2,3,4)*/
