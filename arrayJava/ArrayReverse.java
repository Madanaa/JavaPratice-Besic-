package arrayJava;

import java.util.Scanner;

public class ArrayReverse {
	// input a[5] = 10 20 30 40 50 ------> 50 40 30 20 10

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a[] = new int [5]; // reference variables of array
		
		for (int i = 0 ; i < a.length;i++) {
			
			a[i] = sc.nextInt(); // Array insert 
		}
		for (int i = a.length-1; i > 0;i--) {
			System.out.println(a[i]);
		}
			
			
	}

}
