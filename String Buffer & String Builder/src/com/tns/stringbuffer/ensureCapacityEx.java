package com.tns.stringbuffer;

public class ensureCapacityEx {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer();
		System.out.println(s.capacity());     //default 16
		s.append("Hello");
		System.out.println(s.capacity());      //now 16
		s.append("Java is my favourite language");
		System.out.println(s.capacity());        // (oldcapacity*2)+2 i.e  (16*2)+2=34  
		s.ensureCapacity(10);                 //now no change
		System.out.println(s.capacity());        // 34 
		s.ensureCapacity(50);
		System.out.println(s.capacity());        //  70  
		
	}

}
