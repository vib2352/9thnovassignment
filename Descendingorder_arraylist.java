package assignmentque;

import java.util.ArrayList;
import java.util.Collections;

public class Descendingorder_arraylist {
	public static void main(String []args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		arr.add(60);
		
		Collections.sort(arr,Collections.reverseOrder());
		for(Integer i : arr) {
			System.out.println(i+ " ");
		}
		
	}

}
