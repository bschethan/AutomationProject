package practice;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a ="ABC";
		
		String b ="CBA";
		
		a.replace(a, b);
		b.replace(b, a);
		
		
		int num1 =10;
		int num2 =20;
		
		num1=num1+num2; //30
		num2=num1-num2; //30-20=10
		
		num1=num1-num2; //30-10=20
		
//		System.out.println(num1);
//		System.out.println(num2);
		
		
		String name="Hello";
		String name2="Tv";
		
		
		System.out.println(name.toLowerCase().matches(".*[aeiou].*"));
		System.out.println(name2.toLowerCase().matches(".*[aeiou].*"));
		
		
	}
	
	

}
