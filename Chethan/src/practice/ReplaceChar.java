package practice;

public class ReplaceChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "CHETHAN";
		
		char[] a = name.toCharArray();
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]=='A') {
				
				a[i]='C';
				
			}else if(a[i]=='C') {
				
				a[i]='A';
			}
			
		}
		
		String aa =  String.valueOf(a);
		
		System.out.println(aa);

	}

}
