package practice;

public class Pyramid {

	public static void main(String[] args) {

//			 1
//		    2 3
//		   3 4 5
//		  4 5 6 7
//		 5 6 7 8 9
		
		for(int i=1;i<5;i++) { //print number of rows

			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=5;k>i;k--) {
				
				System.out.print(" "+k);
			}
			System.out.println();
		}
		int num=0;
		for(int i=1;i<5;i++) { //print number of rows

			for(int j=i;j<5;j++) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++) {
				System.out.print(num+" ");
				num=num+1;
			}
		
			System.out.println();
		}
		
		}
			

	}
	


