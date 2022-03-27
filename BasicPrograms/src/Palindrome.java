
public class Palindrome {

	public static void main(String[] args) {
		
		int num=454, reverse=0,temp=0;
		temp=num;
	
		while(num>0) {
			int remainder = num %10; //modulus=get remainder
	    	reverse = reverse*10 + remainder;
			num=num/10;
			}
		System.out.println(temp);
		System.out.println(num);
		System.out.println(reverse);
		
		if(temp==reverse) {
			System.out.println("I am palindrome");
		}
		else
			System.out.println("I am not a palindrome");
	}
	
			

	}
