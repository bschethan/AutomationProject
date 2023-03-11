package numbersRelated;

public class SwapNumbers {

	
	public static void swapNuber(int a,int b){

		a = a+b; //30
		b = a-b; //30-20=10;
		a = a-b;	
	
		System.out.println(a+""+b);
	}
	
	public static void reverseNum(int a){
		int reverse=0;
		while(a>0) {
			
			int reminder = a%10;
			
			reverse = reverse*10+reminder;
			System.out.println(reverse);
			a = a/10;
			//System.out.println(a);
			
		}
	}
		
		public static void factorial(int a){
			int factorial = a;
			for(int i=1;i<a;i++) {
				
				factorial =factorial*(a-i) ; //12

			}
			System.out.println(factorial);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//swapNuber(10,20);
		//reverseNum(1234);
		factorial(4);
	}

}
