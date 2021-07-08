package swap;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		int x,y, temp=0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter two number");
         x = sc.nextInt(); //x = 10
         y = sc.nextInt(); // y = 20
         System.out.println(" Before Swapping " +x+ " " +y);// 10 20
         
         temp = x; // temp = 10
         x = y;      // 20
         y = temp; // b = 10
         System.out.println(" After Swapping " +x+ " " +y); // 20 10 
	}

}
