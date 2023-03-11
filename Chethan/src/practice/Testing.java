package practice;

import java.util.ArrayList;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String s= "Endorsements";  //Unique Charecter = U2N1I1Q1E1

		char[] text =s.toCharArray();	
		ArrayList<Character> list = new ArrayList<Character>();
		//System.out.println(text.length);
		int count=0;	
		for(int i=0;i<=text.length-1;i++){

			
			
			if(!list.contains(text[i]))
			{
				list.add(text[i]);
			}else {
				count++;
			}
			
			
			}
    	
		for(int i=0;i<list.size();i++) {
			
			System.out.print(list.get(i)+""+count);
			
				}
			}
		}



//div



	


