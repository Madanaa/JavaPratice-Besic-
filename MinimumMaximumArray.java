package day_1;

import java.util.Arrays;

public class MinimumMaximumArray {

	public static void main(String[] args) {
		int a[] = {1,-6,7,9,0};
		Arrays.sort(a);
		System.out.println(a[0]);
		System.out.println(a[a.length-1]);
	}

}
