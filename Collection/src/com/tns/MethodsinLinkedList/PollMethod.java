package com.tns.MethodsinLinkedList;

import java.util.LinkedList;

public class PollMethod {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add("GEM");
		list.add(4);
		list.add("GREY");
		list.add(8);
		System.out.println("THe initial list is:"+list);
		System.out.println(list.poll());
	    System.out.println("The Linked List is:"+list);
	}
	}


