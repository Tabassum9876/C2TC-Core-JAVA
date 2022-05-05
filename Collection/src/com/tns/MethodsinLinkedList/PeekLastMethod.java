package com.tns.MethodsinLinkedList;

import java.util.LinkedList;

public class PeekLastMethod {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add("Gem");
		list.add(4);
		list.add("GREY");
		list.add(8);
		System.out.println("THe initial list is:"+list);
	    System.out.println("Head of the list:"+list.peekLast());

	}

}
