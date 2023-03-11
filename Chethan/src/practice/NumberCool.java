package practice;

public class NumberCool {
	
	
	public static int capName() {
		int[] num = {10,23,32,54,56,12,56,87,85,4};
		int max = num[0];
		int max2 = num[0];
		for(int i=1;i<num.length;i++) {

			if(max<num[i]) {
				max = num[i];
			}
			if(num[i]!=max && max2<num[i]) {
				max2 = num[i];
			}
		}

		System.out.println(max2);
		
		
		
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		capName();
	}

}
