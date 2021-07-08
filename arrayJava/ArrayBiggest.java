package arrayJava;

import java.util.Scanner;
// Find biggest number in array
public class ArrayBiggest {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
           int a[] = new int [3];
           int max = 0;
           System.out.println("Enter array");
           for (int i = 0; i < a.length; i++) {
        	   a[i] =sc.nextInt();
           }
           max =a[0];
           for ( int i = 1; i < a.length; i++) {
        	   if (a[i] > max) {
        		   max =a[i];
        	   }
           }
           System.out.println("Biggest number of array = "+max);
	}

}
