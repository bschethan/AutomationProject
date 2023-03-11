package practice;

public class Fibonnaci {
	
	public static void main(String[] args) {
		
	//0 1 1 2 3 5 8 13
		
		
		int a =0;
		int b =1;
		int c =1;
		int fibo=0;
		System.out.print(a+" "+b+" "+c);
		
		for(int i=1;i<5;i++) {
			
			fibo=b+c;
			System.out.print(" "+fibo);
			b=c;
			c=fibo;
		}
	
			
		
	}
	

}
