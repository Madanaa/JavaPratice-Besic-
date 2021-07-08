package arrayJava;
// find average of array Elements 
// 1. a[2] = 20 10 ------> 15
// 2. average = 30/2 =  15  

import java.util.Scanner;

public class ArrayAverage {

	public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int a[] = new int [2];
    int sum=0;
    System.out.println("Enter Array elements");
    for (int i = 0; i < a.length; i++) 
    {
    	a[i] =sc.nextInt(); 
    }
 
    for (int i = 0; i < a.length;i++) {
    	
    	 sum = a[i] +sum;
    	 
    }
    double avg = sum/2;
    System.out.println("Average of Array = "+avg);
		
	}

}
