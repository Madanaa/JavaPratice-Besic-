package arrayJava;
import java.util.*;
// sort array in descending order 
public class ArraySortDescending {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);  
		System.out.println("Enter array ");
      
       int a[] = new int [4];
       int temp = 0;
       
       for (int i = 0; i < a.length; i++) {
    	   a[i] = sc.nextInt();
       }
       System.out.println("Array Elements");
       for (int i = 0; i < a.length; i++) {
    	   for (int j = i +1; j < a.length; j++) {
    		   if(a[i] < a[j]) {
    			   temp = a[i];
    			   a[i] = a[j];
    			   a[j] = temp;
    		   }
    	   }
    	   
       }
      for (int i = 0; i < a.length; i++) {
    	  System.out.println(a[i]);
      }
      
	}

}
