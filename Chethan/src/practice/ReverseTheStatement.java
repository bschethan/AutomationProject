package practice;

public class ReverseTheStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String statement = "I Love Java Coding"; //I evoL
		
		
		String[] name = statement.split(" ");
		
		for(String nn:name) {
			String n = nn;
			System.out.print(" ");
			for(int i=n.length()-1;i>=0;i--) {
				
				System.out.print(n.charAt(i));
				
			}
			
		}
	}

}
