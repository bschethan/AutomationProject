package practice;

public class LargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,5,15,85,754,41};
		
		int max=1;
		
		for(int i=0;i<arr.length;i++) {
			
			int a = max;
			int b = arr[i];
			
		if( a < b ) {
			
			max=arr[i];
			
			}
		
		
		}
		System.out.println(max);
	}

}
