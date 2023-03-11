package practice;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String name = "Race";
		String name1="Care";
		
		String str = name.toLowerCase();
		String str1 = name1.toLowerCase();
		
		char[] str11 = str.toCharArray();
		char[] str12 = str1.toCharArray();
		
		Arrays.sort(str11);
		Arrays.sort(str12);
		
		

			
		boolean result = Arrays.equals(str11, str12);
		
		
		System.out.println(result);
	}

}
