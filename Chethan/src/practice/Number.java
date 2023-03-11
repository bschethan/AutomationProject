package practice;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] l = {2,100,3,4,5,9,9,9,3,4};
		int max=l[0];
		for(int i=0;i<l.length-1;i++) {
			
		
			if(max<l[i+1]) {
					
				max=l[i];
			}
				
		}
		System.out.println(max);	
	}

}
