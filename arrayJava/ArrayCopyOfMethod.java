package arrayJava;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopyOfMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a[] = new int [5];
		System.out.println("Enter Array");
		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Copy of aaray a into b ");
		int b[] = Arrays.copyOf(a, 5);
         for (int i = 0; i < 5; i++) {
        	 System.out.println(b[i]);
         }
	}

}
