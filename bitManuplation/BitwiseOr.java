package bitManuplation;

public class BitwiseOr {
	
	// | 1 0 --> 1
	// | 0 0 --> 0
	// | 0 1 --> 1

	public static void main(String[] args) {
		
		int a =25; //   1 1 0 0 1
		int b = 15;//   0 1 1 1 1
		           // | 1 1 1 1 1   --> 31
		int c = a | b;
		System.out.println(c);
	}

}
