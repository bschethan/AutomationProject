package numbersRelated;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UglyNumbers {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//ugly numbers are positive numbers whose only prime factors are 2, 3 or 5
	     InputStreamReader r=new InputStreamReader(System.in);    

		BufferedReader read = new BufferedReader(r);
		System.out.println("Enter Number");
		int input = read.read();
		int x = 0;
		while ( input != 1) {
		if(input%2==0) {
			input /= 2;
			}
		else if(input%3==0) {
			input /= 3;
			}
		else if(input%5==0) {
			input /= 5;
			}else
			{
				System.out.print("It is not an ugly number.");
				x = 1;
				break;
			}
		}
		
        if (x==0)
		System.out.print("It is an ugly number.");
		System.out.print("\n");
	}
}
