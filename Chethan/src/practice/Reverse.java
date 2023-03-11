package practice;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input = "MALAYNAYALAM";
		
		boolean flag = true;
		for(int i=0;i<input.length()/2;i++) {
			
			if(input.charAt(i)!=input.charAt(input.length()-1-i)) {
				flag = false;
			}
			
		}

		if(flag==true) {
			System.out.println("YES");
		}else
			System.out.println("NO");
	}

}
