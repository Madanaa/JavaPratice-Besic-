package arrayJava;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEqualsMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a[] = new int [4];
		int b[] = new int [4];
		/*System.out.println("Array1");
		for (int i = 0; i < 4; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Array2");
		for (int i = 0; i < 4; i++) {
			b[i] =sc.nextInt();
		}*/
         boolean c = Arrays.equals(a, b);
         
         System.out.println("Both array are equals or not "+c);
	}

}
