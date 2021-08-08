package day_1;

public class CheckKey {
	static boolean findKey(int n, int a[], int x, int k) {
		int i;
		boolean f = false;
		// iterate from 0 to n-1---->
		for( i = 0; i < n; i=i+k) {
			// iterate from 0 to k-1--->
			for(int j = 0; j < k; j++) {
				if(i + j < n && a[i+j] == x)
					break;
				if(j == k)
					return false;
				if(i + j >= n) 
					return false;
			}
		}
		if(i >= n) 
			return true;
		else
			return f;
	}

	public static void main(String[] args) {
		int a[] = {1,6,8,3,8,3,8,9,3,9,5,3};
		int x =3, k=3;
		int n =a.length;
		if(findKey(n,a,x,k))
			System.out.println("yes");
		else
			System.out.println("no");

	}

}
