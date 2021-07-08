package arrayJava;
import java.util.*;

// in array sort() Equals() CopyOf()
public class ArraySortMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter array size");
		int n = sc.nextInt();
		int a[] = new int [n];
		System.out.println("Enter data in Array");
		for (int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
          Arrays.sort(a);
          System.out.println("Array in sort form");
          for (int i = 0; i < n; i++) {
        	  System.out.println(a[i]+" "); 
          }
	}

}
