package practice;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		
		if(num%2==0) {
			System.out.println("Even");
		}else
			System.out.println("Odd");
	}

}
