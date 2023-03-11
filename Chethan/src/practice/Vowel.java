package practice;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//findVowel();
		//fibonacci();
		//palindrom();	
		//factorial();
		//removeWhiteSpace();
		arraySort();
	}
	
	public static void findVowel() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Eneter the Text");
		String name = scan.next();
		
		//name.toLowerCase().matches(".*[aeiou].*");
		System.out.println(name.toLowerCase().matches(".*[aeiou].*"));
	}
	
	public static void  fibonacci() {
		//11235813
		
		int i=1;
		int j =1;
		int k=2;
		int a=0;
		while(a<10) {
		int l= j+k;
		j=k;
		k=l;
		a++;
		System.out.print(" "+l);
		}
		

	}
	
	public static void  palindrom() {
		String name = "malayalam";
		int len = name.length();
		
		for(int i=0;i<len/2;i++) {
		
			if(name.charAt(i)!=name.charAt((len-1)-i)) {
				System.out.println("false");
			}else
			System.out.println("True");
		}
	}
	
	public static void  factorial() {
		
		//4 = 4*3*2*1
		int fact=4, temp=1;
		for(int i=0;i<4;i++) {
		
			//tem=tem*(fact-i)
			temp = temp*(fact-i); // 1*3 =3 .  3*3 =9, 9*2=18 
		}
		System.out.println(temp);
	}
	
	public static void  removeWhiteSpace() {
		
		String name = "C H E THAN";
		StringBuffer str = new StringBuffer();
		char[] input = name.toCharArray();
		
		for(char ch:input) {
			if(!Character.isWhitespace(ch)) {
				str.append(ch);
			}
		}
		System.out.println(str);
	}
	
	public static void  arraySort() {
		
		int[] a = {1,13,4,15};
		int[] b = {100,113,4,25};
		int[] c = new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				if(b[i]>b[j]) {
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		
	}
	
}
