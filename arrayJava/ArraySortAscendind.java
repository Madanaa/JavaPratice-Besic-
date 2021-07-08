package arrayJava;
import java.util.Scanner;
// sort array in ascending order (increasing order)
// example - a[3] = 16 12 13------>   12 13 16  this is ascending order 
public class ArraySortAscendind {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
       int a[] = new int [4];
       int temp =0;
       
       System.out.println("Enter elements array");
       
       for (int i = 0; i <a.length; i++) {
    	   a[i] = sc.nextInt();
       }
       for ( int i =0 ; i < a.length; i++) {
    	   for (int j = i+1; j < a.length; j++) {
    		   
    		   if (a[i] > a[j]) {
    			   
    			   temp = a[i];
    			   a[i] = a[j];
    			   a[j] = temp;
    		   }
    	   }
       }
       System.out.println("Ascending Order");
       for (int i = 0; i < a.length; i++) {
    	   System.out.println(" "+a[i]);
       }
	}
 
}
