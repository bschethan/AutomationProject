package practice;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String text = scan.next();
		
		System.out.println(text);
		
		String unique ="";
		
		for(char ch:text.toCharArray()) {
			
			if(!unique.contains(String.valueOf(ch))) {
				unique+=ch;
			}
			
		}
		
		System.out.println(unique);

	}

}
