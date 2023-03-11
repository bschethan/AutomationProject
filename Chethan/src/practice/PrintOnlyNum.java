package practice;

public class PrintOnlyNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Your request is 1233445";
		
		//String digits = name.replaceAll("[^0-9]", "");
		
		String digits = name.replaceAll("[^a-z]", "");
		
		System.out.println("your passport number is --"+digits);
	}

}
