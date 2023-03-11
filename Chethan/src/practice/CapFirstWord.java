package practice;

import java.util.Arrays;

public class CapFirstWord {

	public static void main(String[] args) {
		
		String name = "i love my india"; //I Love My India
		capName(name);
		
	}

	
	public static void capName(String name) {
		
		char[] name1 = name.toCharArray();
		
		boolean space = true;
		
		for(int a=0;a<name1.length;a++) {
			
			if(Character.isLetter(name1[a])) {
				
				if(space) {
					
				name1[a]=Character.toUpperCase(name1[a]);
				space=false;
				}
				
			}else
			{
				space=true;
			}
			
		}
		
		String lastName = String.valueOf(name1);
		
		System.out.println(lastName);
		
	}
}
