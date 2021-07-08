package arrayJava;

import java.util.Arrays;

public class ArraySort1 {
// sort a numeric array and a string array ...
	public static void main(String[] args) {
		
		int a[] = {9, 3, 8, 5, 2};
	    String    b[] = {"java", "c","xyz"};
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
       Arrays.sort(b);
       System.out.println(Arrays.toString(b));
	}

}
