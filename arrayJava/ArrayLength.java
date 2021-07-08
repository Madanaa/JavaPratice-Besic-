package arrayJava;

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		
		
	Scanner sc = new Scanner (System.in);	
	System.out.println("Enter elements in array ");

	int a[] = new int [7];
	for (int i = 0; i <a.length;i++) {
		a[i] =sc.nextInt(); // array insert i is reference of array index
	}
	System.out.println("Array Elements ");
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]+" ");
	}
	System.out.println("Array Length " +a.length);
	}

}
