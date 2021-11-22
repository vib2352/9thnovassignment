package assignmentque;
import java.util.*;

public class add_and_change_elementarrlist {
	public static void main(String[]args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("apeksha");
		arr.add("aarti");
		arr.add("rumi");
		arr.add("raksha");
		arr.add("diksha");
		arr.add("renuka");
		arr.set(3, "reshma");
		for(String val : arr) {
			System.out.println(val);
		}
	}

}
