package com.tns.le;

interface addition1{
	public int add();
}

public class LamdaExWithParameter4 {

	public static void main(String[] args) {
		addition1 ad=()->(50+20);{
			System.out.println(ad.add());
		};
	
		
	}

}
