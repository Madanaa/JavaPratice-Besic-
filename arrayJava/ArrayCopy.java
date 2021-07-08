package arrayJava;

import java.util.Scanner;

public class ArrayCopy {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a[] = new int [5];
		int b[] = new int [5];
				System.out.println("Enter array elements");
	// use for input run time obj of scanner class
	for (int i = 0; i < 5; i++)
	{
	a[i] =sc.nextInt();
	}
		System.out.println("First Elements");
		for (int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}
		System.out.println("2nd Elements");
		for (int i = 0; i < 5; i++) {
			
			b[i] = a[i];
			
		System.out.println(b[i]);

	}
	}
}
