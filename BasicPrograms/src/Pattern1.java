
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//*
		//**
	    //***
		
		//i  stars  n
		//0   1     3
		//1   2     3
		//2   3     3     stars=i+1;
		
		int stars;
		for(int i=0;i<3;i++)        //how many stars has to be printed
		{
			stars = i+1;
			
			for(int j=0;j<stars;j++)   //it is going to print the expected stars in the iteration
			{
				System.out.print("*");
			}
			System.out.print("\n");
	}

}
}