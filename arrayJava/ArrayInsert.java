package arrayJava;

import java.util.Scanner;

// Insert item in Array
// a[3] = 36 55 46
// loc item = 30
// a[3+1] = 36 55 46 100
public class ArrayInsert {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	System.out.println("Enter array size");
		int n = sc.nextInt();
		int a[] = new int [n +1];
		System.out.println("Enter Array");
		for (int i = 0; i < n; i++) {
			
			a[i] = sc.nextInt();
		}
		System.out.println("Enter aaray location ");
		int loc =sc.nextInt();
		System.out.println("Enter new Array item n");
		int item =sc.nextInt();
		
		for (int i = n; i > loc; i--) {
			a[i] = a[i-1];
		}
		a[loc] = item;
		n++;
		System.out.println("New Array item");
		for (int i = 0; i < n; i++ ) {
			System.out.println(a[i]+ " ");
		}

	}

}
