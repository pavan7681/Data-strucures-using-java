package arrays;

import java.util.Scanner;

public class Selectionsort {
    public static void selectionsort(int arr[],int n) {
    	for (int i = 0;i < n;i++) {
    		int min = i;
    		for (int j = i + 1;j < n;j++) {
    			if (arr[j] < arr[min]) {
    				min = j;
    			}
    		}
    		if (i != min) {
    			int temp = arr[i];
    			arr[i] = arr[min];
    			arr[min] = temp;
    		}
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
		selectionsort(arr,n);
		System.out.println("the sorted array");
		for (int i = 0;i < n;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	

	

}
