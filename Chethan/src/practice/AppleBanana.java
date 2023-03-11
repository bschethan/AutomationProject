package practice;

import java.util.ArrayList;

public class AppleBanana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] friut = {"Appple","Orange","Banana","Mango","Chethan","Megha","aaa"};
		
		for(int i=0;i<friut.length;i++) {
			
			char[] ch = friut[i].toCharArray();
			ArrayList<Character> ar = new ArrayList<Character>();
			
			for(int j=0;j<ch.length;j++) {
				
				char a = ch[j];
				if(!ar.contains(a)) {
					ar.add(a);
				}else {
					System.out.println(friut[i]);
					break;
				}
			}
		}
	}

}
