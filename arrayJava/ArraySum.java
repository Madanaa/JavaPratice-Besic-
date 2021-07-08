package arrayJava;

import java.util.Scanner;

// find sum of array elements
public class ArraySum {

	public static void main(String[] args) {
		int a[] = new int [7];
		int sum = 0;
	Scanner sc = new Scanner (System.in);	
	System.out.println("Enter elements in Array :");
	 for (int i =0; i < a.length; i++) {
		 a[i] =sc.nextInt();
	 }
	 System.out.println("Array Elements:"); 
	 for (int i= 0; i < a.length;i++){
		 System.out.println(a[i]+" ");
		  sum = a[i] +sum;
	 }
       System.out.println("Sum of Arrray = "+sum);
	}

}
