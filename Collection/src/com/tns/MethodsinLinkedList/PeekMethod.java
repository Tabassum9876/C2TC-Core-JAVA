package com.tns.MethodsinLinkedList;

import java.util.LinkedList;

public class PeekMethod {

	public static void main(String[] args) {
		LinkedList<Comparable> list=new LinkedList();
		list.addLast("Gem");
		list.addLast(4);
		list.addLast("GREY");
		list.addLast(8);
		System.out.println("THe initial list is:"+list);
	    System.out.println("Head of the list:"+list.peek());
	}

}
