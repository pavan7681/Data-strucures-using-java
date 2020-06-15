package arrays;

import java.util.Scanner;

public class Mergesort {
	public static void merge(int arr[],int low,int mid,int high ) {
		int n1 = mid - low + 1;
		int n2 = high - mid;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for (int i = 0;i < n1;i++) {
			L[i] = arr[low + i];
		}
		for (int i = 0;i < n2;i++) {
			R[i] = arr[mid + 1 + i];
		}
		int i = 0,j = 0,k = low;
		while (i < n1 && j < n2) 
	    { 
	        if (L[i] <= R[j]) 
	        { 
	            arr[k] = L[i]; 
	            i++; 
	        } 
	        else
	        { 
	            arr[k] = R[j]; 
	            j++; 
	        } 
	        k++; 
	    }
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
		while (i < n1) {
			arr[k] = L[i];
			k++;
			i++;
		}
	}
    public static void mergesort(int arr[],int l,int h) {
    	if (l < h) {
    	int mid = ( l + h )/2;
    	mergesort(arr,l,mid);
    	mergesort(arr,mid + 1,h);
    	merge(arr,l,mid,h);
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
		mergesort(arr,0,n-1);
		System.out.println("the sorted array");
		for (int i = 0;i < n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
