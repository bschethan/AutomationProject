package practice;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "CHETHAAN";
		TreeMap<Character,Integer> map = new TreeMap<Character,Integer>();
		for(int i=name.length()-1;i>=0;i--) 
		{
			
			char ch = name.charAt(i);
			if(!map.containsKey(ch)) {
				map.put(ch, 1);
			}else
				map.put(ch, map.get(ch)+1);
		}
		

		System.out.println(map.descendingKeySet());
		System.out.println(map.descendingMap());
		
		for(Entry<Character, Integer> en: map.entrySet()) {
			System.out.println(en.getKey()+" "+en.getValue());
		}
	}

}
//odd charecter
//