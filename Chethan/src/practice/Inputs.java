package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inputs {

	public static void main(String[] args) throws IOException {
		
		/*
		 * InputStreamReader r = new InputStreamReader(System.in); BufferedReader in =
		 * new BufferedReader(r); String a = in.readLine(); int aa =
		 * Integer.parseInt(a); System.out.println(aa);
		 */
		
		//reverse the number
		
		int reverse = 0;
		int number = 1234;
		
		while(number != 0) {
			int numb = number%10;					//4
			reverse = reverse*10+numb;	//40+
			number=number/10;					//123
			
		}
		
		
		System.out.println(reverse);
		System.out.println(number);
		
	}

}
