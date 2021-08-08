package day_1;

import java.util.Scanner;

public class ReverseArray {
	static void Revers(int a[], int n) {
		int a1[] = new int [n];
		int j = n;
		for(int i = 0; i < n; i++) {
			a1[j-1] = a[i];
			j=j-1;
		}
		System.out.println("Reverse Array");
		for(int k = 0; k < n; k++) {
			System.out.println(a1[k]);
		}
	}

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        int a[] = new int [6];
        for(int i = 0; i < 6;i++) {
        	a[i] = sc.nextInt();
        }
        Revers(a,a.length);
	}

}
