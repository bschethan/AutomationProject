package practice;
import java.util.*;
public class dance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] aa = {1,2,3,4,5};
		int[] bb = {2,3,4};
		
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		for(Integer in : aa) {
			list1.add(in);
		}
		for(Integer in : bb) {
			list2.add(in);
		}
		
//		System.out.println(list1);
//		System.out.println(list2);
		
		for(int i=0;i<list1.size();i++) {
		if(!list2.contains(list1.get(i))) {
			System.out.println(list1.get(i));
		}
		}
	}
}
