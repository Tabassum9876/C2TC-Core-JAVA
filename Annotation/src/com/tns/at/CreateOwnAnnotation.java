package com.tns.at;
 

//If we want to create our own annotation then use @interface(at the rate symbol with interface)& infront use a name whatever u want
    //example @interfaceSmartPhone this defines u r creating your own annotation

@SmartPhone(os="Android",version=6)
class NokiaASeries
{
	
}
@interface SmartPhone     
{
   String os();
	int version();

}
//Marker Annotation
@interface SmartPhone1    //If we don't have any value then it is  called as MARKER ANNOTATION
{
	
}

//Single Value Annotation
@interface SmartPhone2    //If we have one field or one value then it is called as SINGLE VALUE ANNOTATION
{
 String OS();
}


//Multiple Value Annotation
@interface SmartPhone3    //If we have more than one field or value then it is called as MULTIPLE VALUE ANNOTATION
{
 String OS() default "Symbian";
 int version() default 1;
}

public class CreateOwnAnnotation {

	public static void main(String[] args) {
		
	}

}
