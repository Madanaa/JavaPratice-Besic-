package arrayJava;
// How to print element in array
public class ArrayElement {

	public static void main(String[] args) {
		int a[] = new int [2];
		a[0] =10;
		a[1] = 20;
		
		
		for (int b : a) // for each loop
		{
			System.out.println("Element= "+b);
		}

	}

}
