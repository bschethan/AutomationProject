package practice;

public class Swap2Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number =1234; int div=0; int res=1; int rem=1;
		
		while(number>0) {
			
			System.out.println(number);
			System.out.println("_____________________");
			
			div=div*10+number%10;;
			
			System.out.println(div);
			
			number = number/10;
		}
	}
}
