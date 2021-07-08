package arrayJava;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		//String a[] = {"Ram","Seeta","Jai"};
		int a[][] ={{3,5},{8,8}};
		System.out.println("toString"+Arrays.toString(a));
		System.out.println("asList"+Arrays.asList(a));
		System.out.println(Arrays.deepToString(a));

	}

}
