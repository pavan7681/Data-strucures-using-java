package arrays;

import java.util.Scanner;

public class Countingsort {
	public static void countingsort(int arr[],int n) {
		int max = 0;
		for (int i = 0;i < n;i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		int count[] = new int[max + 1];
		int counts[] = new int[n];
		for (int i = 0;i < n;i++) {
			count[arr[i]]++;
		}
		for (int i = 1;i < max + 1;i++) {
			count[i] = count[i] + count[i - 1];
		}
		for (int i = n - 1;i >=0;i--) {
			counts[--count[arr[i]]] = arr[i];
		}
		for (int i = 0;i < n;i++) {
			arr[i] = counts[i];
		}
	}
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size of the array:");
	int n = sc.nextInt();
	int arr[] = new int[n];
	System.out.println("enter the elements:");
	for (int i = 0;i < n;i++) {
		arr[i] = sc.nextInt();
	}
	countingsort(arr,n);
	System.out.println("the sorted array");
	for (int i = 0;i < n;i++) {
		
		System.out.print(arr[i]+" ");
	}

}

}
