package arrayJava;

import java.util.Scanner;

// Delete item in Array
// a[3] = 45 67 34
// loc = 1
// [3 - 1]
public class ArrayDelete {

	public static void main(String[] args) {

	 Scanner sc = new Scanner (System.in);
	 System.out.println("Enter array size"); 
	 int n = sc.nextInt();
	 int a[] = new int [n]; // a[3]
	 System.out.println("Enter array elements");
	 for (int i = 0; i < n; i++) 
	 {
		 a[i] = sc.nextInt();// 45 23 67
	 }
	 System.out.println("Enter Array Delete loction");
	 int loc = sc.nextInt(); // loc = 1
	 
	 for (int i = loc; i < n -1; i++)
	 {
		 a[i] = a[i+1];
	 }
       n--;
       System.out.println("After delete new array");
      for ( int i = 0; i < n; i++) {
    	  System.out.println(a[i]+ "");
      }
	}

}
