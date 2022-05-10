package com.tns.creatingownexception;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ListTooLargeException extends RuntimeException{
	ListTooLargeException(String message){
		System.out.println(message);
		
	}
}
public class UncheckedCustomException {
	public void analyze(List<String>data) {
		if(data.size()>50) {
			throw new ListTooLargeException("List can't exceed 50 items");
		}
	}

	public static void main(String[] args) {
		UncheckedCustomException uc=new UncheckedCustomException();
		List<String>data=new ArrayList<>(Collections.nCopies(100,"Customer Details"));
		uc.analyze(data);
		
	}

}
