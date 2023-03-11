package practice;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    String name = "Your request is 1233445";
	    
	    //System.out.println(name);
	    
	    char namearr[] = name.toCharArray();
	    
	    ArrayList<Character> ar = new ArrayList<Character>();
	   
	    for(int i=0;i<namearr.length;i++) {
	    	
	    	char a = namearr[i];
	    	
	    	if(Character.isDigit(a)) {
	    		
	    		//System.out.print(a);
	    		int aa = a*10;
	    	}
	    	
	    }
	    //{apple, orange, banana, ….} //{apple, banana,}
	
	ArrayList<String> s = new ArrayList<String>();
	s.add("apple"); //1
	s.add("orange");
	s.add("banana"); //2
	ArrayList<Character> sa = new ArrayList<Character>();
	
	for(int i=0;i<s.size();i++) {
		
		char[] aaa = s.get(i).toCharArray();
		
		for(int j=0;j<aaa.length;j++) {
			
			char te = aaa[j];
		
			if(!sa.contains(te)) {
				
				sa.add(te);
			}
			else
				System.out.println(aaa);
			
		}
		
		
			
			//System.out.print(sa);
	}
	
	
	
	}
	
	
	

}
