package assignmentque;

import java.util.ArrayList;

public class Copyele_arraylist {
	public static void main(String []args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("rakhi");
		arr.add("pakhi");
		arr.add("aditya");
		arr.add("pankaj");
		arr.add("mahadev");
		arr.add("mamta");
		ArrayList<String>arr1 = new ArrayList<>();
		for(String val : arr) {
			arr1.add(val);
		}
		System.out.println(arr1);
	}

}
