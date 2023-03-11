package practice;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HighestRepeatedCharecter {
	
	
	

	public static void main(String[] args) {
		
		String name = "Welcome to KPMG";
		
		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
		
		for(int i=name.length()-1;i>=0;i--) {
			
			char c = name.charAt(i);
			
			if(!map.containsKey(c))
			{
				map.put(c, 1);
			}else
				map.put(c, map.get(c)+1);
			
		}
		int max=0;
		//System.out.println(map.descendingMap());
		for(Entry<Character, Integer> ee : map.entrySet()) {
			
			int j = ee.getValue();
			
			for(Entry<Character, Integer> eee : map.entrySet()) {
				
				int jj = eee.getValue();
				if(j>jj) {
					
					 max = j;
				
				}else
					max = jj;
				
			}
			
		}
		
		System.out.println(max);
	}

}
