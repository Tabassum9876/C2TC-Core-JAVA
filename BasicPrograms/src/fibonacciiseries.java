import java.util.Scanner;
public class fibonacciiseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");

int n1=0;
int n2=1;
int n3=0;
int inputNumber =sc.nextInt();

while(n3 <inputNumber)
{
n3 =n1+n2;
n1 =n2;
n2 =n3;
}

if(n3 == inputNumber)
{
System.out.println("Number belongs to Fibonacci series");
}
else
{
System.out.println("Number does'nt belongs to Fibonacci series");
}

	}

}
