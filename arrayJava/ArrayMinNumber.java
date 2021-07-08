package arrayJava;

import java.util.Scanner;

// find minimum number in array
public class ArrayMinNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a[] = new int [3];
		int minimum = 0;
		System.out.println("Enter array");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		minimum =a[0];
		for (int i = 1; i < a.length; i++) {
			if(a[i] < minimum) { // doubt here
				minimum =a[i];
				
			}
		}
		System.out.println("Minimum array " +minimum);
	}
   
}
