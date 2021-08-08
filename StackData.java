package day_1;

import java.util.Stack;

public class StackData {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack();
          s.push(12);
          s.push(13);
          s.push(23);
          s.push(25);
          s.push(27);
       
         int p1 =s.peek();
         System.out.println(p1);
        
       
	}

}
