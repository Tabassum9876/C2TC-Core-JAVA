package com.tns.thisreference;

class s2
{
	void m(s2 a)
	{
		System.out.println("method is invoked");
		
	}
	void p()
	{
		m(this);
		System.out.println("method is invoked");
	}
}
public class Use3 {

	public static void main(String[] args) {
	s2 s1=new s2();
	s1.p();
	}

}
