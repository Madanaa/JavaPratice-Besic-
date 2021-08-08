package day_1;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray2 {
	static void reverse(Integer a[]) {
		Collections.reverse(Arrays.asList(a));
		System.out.println(Arrays.asList(a));
	}

	public static void main(String[] args) {
		Integer a[] = {1,7,9,4,2};
          reverse(a);
	}

}
