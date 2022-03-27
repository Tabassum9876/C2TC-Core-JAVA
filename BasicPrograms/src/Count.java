//Total number of characters in a string
public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="TABASSUM BANU";  //8+1+4=13
		int count=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)!=' ') {
				count++;
			}
			
		}
		System.out.println(count);
		
	}

}

