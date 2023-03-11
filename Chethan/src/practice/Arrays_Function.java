package practice;

public class Arrays_Function {
	
	public static void sortASC(int[] c) {
		for(int i=0;i<c.length;i++) {
			
			int temp =0;
			
			for(int j=i+1;j<c.length;j++) {

				if((c[i]>c[j])) {	
				
				temp = c[i];
				c[i] = c[j];
				c[j] = temp;
				}
			
			}
 		}
		System.out.println("Ascending Order");
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]);
		}
	}
	
	public static void sortDESC(int[] c) {
		for(int i=0;i<c.length;i++) {
			
			int temp =0;
			
			for(int j=i+1;j<c.length;j++) {

				if((c[i]<c[j])) {	
				
				temp = c[i];
				c[i] = c[j];
				c[j] = temp;
				}
			
			}
 		}
		System.out.println("Descending Order");
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,3,2,4};
		int[] b = {5,9,8,7};
		
		int[] c = new int[a.length+b.length];
		int pos = 0;
	
		for(int arr:a) {
			c[pos]=arr;
			pos++;
		}
		
		for(int arr:b) {
			c[pos]=arr;
			pos++;
		}
		System.out.println("Original Array");
		for(int arr:c) {
			
			System.out.print(arr);
		}
		System.out.println();
		sortASC(c);
		System.out.println();
		sortDESC(c);
	}
	
}
