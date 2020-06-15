package arrays;
import java.util.Scanner;
public class Stackusingarray {
	 static int top = -1;
	
    public static void push(int n,int d,int arr[]) {
    	if (top == n) {
    		System.out.println("stack over flow");
    	}
    	else {
    		top = top + 1;
    		arr[top] = d;
    	}
    }
    public static void pop() {
    	if (top == -1) {
    		System.out.println("stack under flow");
    	}
    	else {
    		top = top - 1;
    	}
    }
    public static void peek(int arr[]) {
    	if (top == -1) {
    		System.out.println("no peek");
    	}
    	else {
    		System.out.println(arr[top]);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of the stack");
	    int n = sc.nextInt();
		int arr[] = new int[n];
		while (true) {
		System.out.println("1.push element");
		System.out.println("2.pop element");
		System.out.println("3.top of the stack");
		int o = sc.nextInt();
		switch(o) {
		case 1:System.out.println("enter data");
			   int d = sc.nextInt();
			   push(n,d,arr);
		       break;
		case 2:pop();
		       break;
		case 3:peek(arr);
		       break;
		default : System.out.println("enter valid choice");
		}
	}
	}

}
