package practice;

import java.util.*;
import java.util.Map;

public class DuplicatesInArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] num = {'A','B','A','C','D','E','F'};
		
		
		HashMap<Character,Integer> numMap = new HashMap<Character,Integer>();
		
		for(int i=0;i<num.length;i++) {
			
			char n = num[i];
			
			if(!numMap.containsKey(n)) {
				
				numMap.put(n, 1);
			}else
			{
				numMap.put(n, numMap.get(n)+1);
			}
		}
		/*
		 * Set<Integer> in = numMap.keySet();
		 * 
		 * Iterator<Integer> it = in.iterator();
		 * 
		 * while(it.hasNext()) {
		 * 
		 * // System.out.println(it.next()); }
		 */
		
		for(Map.Entry<Character,Integer> entry:numMap.entrySet()) {
			System.out.println(entry.getKey()+ "  "+entry.getValue());
		}
		
	}

}
