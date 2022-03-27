
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=987654 ,reverse=0;
		
		//loop
		//modulus is giving me last digit
		//storing the result of previous in reverse
		//perform division to num
		
		//logic for reversing
		while(num>0) {
		int remainder = num %10; //modulus=get remainder
		reverse = reverse*10 + remainder;//4; 45; 456
		num=num/10;
		}
		System.out.println(reverse);
	}

}
