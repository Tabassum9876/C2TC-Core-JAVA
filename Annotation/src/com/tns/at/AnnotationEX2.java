package com.tns.at;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.text.Annotation;


//This 2 called as Meta Annotation 
@Target(ElementType.TYPE)    //Whenever we want to create our annotation we have to specify this annotations
@Retention(RetentionPolicy.RUNTIME)

@interface SmartPhone4   
{
 String OS() default "Symbian";
 int version() default 1;
}

@SmartPhone(os="Android",version=6)
class NokiaASeries1
{
     String model;
     int size;
     
	public NokiaASeries1(String model, int size) {
		this.model = model;
		this.size = size;
	}
}

public class AnnotationEX2 {

	private static SmartPhone s;

	public static void main(String[] args) {
		NokiaASeries1 obj=new NokiaASeries1("Fire",5);
		
	    Class c=obj.getClass();
	    Annotation an=(Annotation)c.getAnnotation(SmartPhone.class);
	    System.out.println(s.os());			
	}

}
