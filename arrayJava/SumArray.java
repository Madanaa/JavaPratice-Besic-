package arrayJava;

public class SumArray {

	public static void main(String[] args) {
		
		int a[] = {1, 4,7,8,9,8};
		
		int temp =0;
		
		for (int i : a) {
			temp += i;
			
		}
		System.out.println(temp);
	}

}
