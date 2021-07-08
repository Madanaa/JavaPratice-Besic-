package arrayJava;
// 1. ==
// 2. equals() 

import java.util.Arrays;

public class ArrayCampare {

	public static void main(String[] args) {
       
		  int a[] = {10,20,40,45};
		  int b [] = {10, 20, 40,45 };
		  
		 // if (a == b) 
		  if(Arrays.equals(a, b)) // this is equals method
		  
		  {
			  System.out.println("Both are equals");
		  }
		  else {
			  System.out.println("Both are not equals");
		  }
	}

}
