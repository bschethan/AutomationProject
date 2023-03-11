package practice;

import java.util.HashMap;
import java.util.Map.Entry;

public class RepeatedNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,3,4,2,2,3,2,7,2};
		
		int len = arr.length;
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for(int i=0;i<len;i++) {
			
			int a = arr[i];
			
			if(!map.containsKey(a)) {
				
				map.put(a, 1);
			}else
				map.put(a, map.get(a)+1);
			
		}
		
		//map.getKey(), Map.getValue();
		
		for(Entry<Integer, Integer> en: map.entrySet()) {
			System.out.println(en.getKey()+" "+en.getValue());
		}

	}

}
