package javabeginning;
import java.util.Scanner;
public class Arrayoperations {
	static void prints(int[] value,int len) {
		System.out.println("the output array is");
		for (int i = 0;i < len;i++) {
			System.out.print(value[i]);
		}
		System.out.println(" ");
	}
	static void deletion(int[] value,int len) {
		int i;
		Scanner n = new Scanner(System.in);
		System.out.println("enter the element to be deleted:");
		Integer d = n.nextInt();
		for (i = 0;i < len;i++) {
			if (d == value[i]) {
				break;
			}
		}
		len = len - 1;
		if (i < len) {
			for (int j = i;j < len;j++) {
				value[j] = value[j+1];
			}
			
		}
	}
	static void rotate(int[] value,int len) {
		Scanner nn = new Scanner(System.in);
		System.out.println("enter the no of rotations needed");
		Integer d = nn.nextInt();
		int[] temp = new int[d];
		int i;
		for (i = 0;i < d;i++) {
			temp[i] = value[i];
		}
		for (i = 0;i < len - d ;i++) {
			value[i] = value[d + i];
		}
		for (int j = 0;j < d;j++) {
			value[j + i] = temp[j];
		}
		prints(value,len);
	}
	static void reverse(int[] value,int len) {
		int temp;
		int low = 0;
		int high = len-1;
		while (low < high) {
			temp = value[high];
			value[high] = value[low];
			value[low] = temp;
			low++;
			high--;
		}
		prints(value,len);
	}
	static void sum(int[] value,int len) {
		int t = 0;
		for (int i = 0;i < len;i++) {
			t = t + value[i];
		}
		System.out.printf("the sum of the array elements: %d",t);
		System.out.println();
	}
    public static void frequency(int[] value,int len) {
    	int count = 0,max = 0,f=0;
    	for(int i = 0;i < len;i++) {
    		for (int j = i + 1;j < len;j++) {
    			if (value[i] == value[j]) {
    				count = count + 1;
    			}
    		}
    		if (count > max) {
    			max = count;
    			f = value[i];
    		}
    	}
    	System.out.println("the highest freqency element is:"+f);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 1;
		Scanner n = new Scanner(System.in);
		System.out.println("enter the length of the  array");
		int length = n.nextInt();
		int[] values = new int[length];
		System.out.println("enter the elements in the array:");
		for (int i = 0;i < length;i++) {
			values[i] = n.nextInt();
		}
		while (c > 0) {
		System.out.println("ENTER YOUR CHOICE: ");
		System.out.println("1.PRINTING THE ARRAY");
		System.out.println("2.REVERSING THE ARRAY");
		System.out.println("3.SUM OF THE ARRAY");
		System.out.println("4.INSERTING THE ELEMENT IN THE ARRAY");
		System.out.println("5.DELETING THE ELEMENT FROM THE ARRAY");
		System.out.println("6.THE HIGHEST FREQENCY ELEMENT IN THE ARRAY");
		System.out.println("7.ROATATING THE ARRAY");
		System.out.println("8.EXIT");
		int choice = n.nextInt();
		switch(choice) {
		case 1: prints(values,length);
				break;
		case 2 :reverse(values,length);
		        break;
		case 3 :sum(values,length);
		        break;
		case 5: deletion(values,length);
		        break;
		case 6 :frequency(values,length);
				break;
		case 7: rotate(values,length);
		        break;
		case 8: c = 0;
		        break;
		default : System.out.println("PLEASE ENTER A VALID CHOICE");
		}

	}
}


}
