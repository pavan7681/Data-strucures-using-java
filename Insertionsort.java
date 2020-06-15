package arrays;

import java.util.Scanner;

public class Insertionsort {
    public static void insertionsort(int arr[],int n) {
    	for (int j = 1;j < n;j++) {
    		int key = arr[j];
    		int i = j - 1;
    		while (i >= 0 && arr[i] > key) {
    			arr[i + 1] = arr[i];
    			i--;
    		}
    		arr[i + 1] = key;
    		
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the elements:");
		for (int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		insertionsort(arr,n);
		System.out.println("the sorted array");
		for (int i = 0;i < n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
