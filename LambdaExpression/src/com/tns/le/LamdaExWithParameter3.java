package com.tns.le;


interface addition{
	public int add(int a,int b);
}

public class LamdaExWithParameter3 {

	public static void main(String[] args) {
		addition ad=(int a,int b)->(a+b);{
			System.out.println(ad.add(10,20));
		};
	}

}
