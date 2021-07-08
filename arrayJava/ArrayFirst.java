package arrayJava;

public class ArrayFirst {

	public static void main(String[] args) {
		
		 int a[] ={26, 57,65,78,90,54};// Dynamic Array
		
		int arr[] = new int [5]; // size is fixed static array
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 40;
		arr[3] = 50;
		arr[4] = 80;
		
		for (int i=0; i<5;i++)// i represent to array index 
		{
			System.out.print(" Static\n "+arr[i]);
		}
		
		
      System.out.println(" Dynamic\n "+a[1]);
	}

}
