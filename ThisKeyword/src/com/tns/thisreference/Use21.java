package com.tns.thisreference;

class hello
{
	hello()
	{
		this(8);
		System.out.println("Hello friends");
	}
	hello(int x){
		System.out.println(x);
	}
}
public class Use21 {

	public static void main(String[] args) {
		
		hello d=new hello();
		
	}

}
