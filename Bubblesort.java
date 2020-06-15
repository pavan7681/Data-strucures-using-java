package arrays;
import java.util.Scanner;

public class Bubblesort {
    public static void bubblesort(int arr[],int n) {
    	int flag;
    	do {
    		 flag = 1;
    		for (int i = 0;i < n - 1;i++) {
    			if (arr[i] > arr[i + 1]) {
    				int temp = arr[i];
    				arr[i] = arr[i + 1];
    				arr[i + 1] = temp;
    				flag = 0;
    			}
    		}
    	}while(flag != 1);
 
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
		bubblesort(arr,n);
		System.out.println("the sorted array");
		for (int i = 0;i < n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
