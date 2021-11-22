package assignmentque;

import java.util.ArrayList;
import java.util.Arrays;

public class Compare_string_arrylist {
	public static void main (String [] args) {
		String s = "abcd";
		String t = "abcde";
		String split1[] = s.split("");
		ArrayList<String>str1 = new ArrayList<>(Arrays.asList(split1));
		String split2[] = t.split("");
		ArrayList<String>str2 = new ArrayList<>(Arrays.asList(split2));
		for(String val : str2) {
			if(!str1.contains(val)) {
				System.out.println(val);
			}
		}
		
		
	}

}
