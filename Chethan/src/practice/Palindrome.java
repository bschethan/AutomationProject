package practice;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String name = "RadarC";
		String name2 = "";
		
		for(int i=name.length()-1;i>=0;i--) {
			
			name2=name2+name.charAt(i);
			
		}
		if(name.equalsIgnoreCase(name2)) {
			System.out.println("Bro its palindrome");
		}else
			System.out.println("Bro its Not");
	}

}
