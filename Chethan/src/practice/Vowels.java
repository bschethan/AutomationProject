package practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] list = {"a","e","i","o","u"};
		
		List<String> list1 = Arrays.asList(list);
		
		String name = "meghana";
		
		for(int b=0;b<name.length();b++) {
		
			char aa = name.charAt(b);
		int i=0;
		while(list1.size()>i) {
			
			char a = list1.get(i).charAt(0);
			i++;
			if(a==aa) {
				System.out.println(aa);
			}
		}
		
		}
		}
	}
	
		
		
		
		
	


