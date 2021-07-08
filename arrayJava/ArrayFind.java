package arrayJava;
// find elements in array
import java.util.Scanner;

public class ArrayFind {

	public static void main(String[] args) {
		int a[] = new int [2];
		int count =0;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter Array Elements :"); 
	for (int i = 0; i < a.length; i++) {
		a[i] = sc.nextInt();
	}
	System.out.println("Array Elements");
	for(int i = 0; i < a.length;i++) {
		System.out.println(a[i]+" ");
	}
	System.out.println("Enter search Array Elements");
          int n = sc.nextInt();// n variables for searching
          for (int i = 0; i < a.length;i++) {
        	  if(a[i] == n) {
        		  count++;
        	  }
        	  
  }
              if (count > 0) 
   	   {
   		  System.out.println("Element found "+count+" times");        	  
   		  
   	   }
   	  else 
   	  {
   		  System.out.println("Element not found");
   	  }
        	  
          }
	}
          
	


