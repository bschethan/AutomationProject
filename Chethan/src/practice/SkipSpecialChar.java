package practice;

public class SkipSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "A$For&Apple";
		String output = "elppA$roF&A";
		String expected = "";
	
		for(int i=test.length()-1;i>=0;i--) {
			char ch = test.charAt(i);
			if(Character.isAlphabetic(ch)) {
				expected = expected+ch;
			}	else if(ch=='&') {
				ch = '$';
				expected = expected+ch;
			}	else if(ch=='$') {
				ch = '&';
				expected = expected+ch;
			}
			
		}
		System.out.println(expected);
	}
}
