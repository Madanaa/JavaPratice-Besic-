package arrayJava;
// calculate average in array
public class ArrayAve {

	public static void main(String[] args) {
		int a[] = {23,12,54,65,12};
		int temp = 0;
		double avg =0;
		for (int i : a) {
			//temp = temp + i;//
			temp +=i;
			avg =temp/5.0;
			
			
		}
		System.out.println(temp);
		System.out.println(avg);
		
	}

}
