package practice;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(checkPalindromeString("CHETHAN"));
		
		//checkPalindromeString("CHETHAN");
		
		System.out.println(checkPalindromeString("ABA"));
	}

	
	public static boolean checkPalindromeString(String input) {
		
		boolean result = true;
		int len=input.length();
		for(int i=0;i<len/2;i++) {
		
			if(input.charAt(i)!=input.charAt(len-i-1)) {
				result=false;
			}
			
		}
		return result;
	}
}
