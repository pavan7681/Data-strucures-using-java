package recursion;
import java.util.Scanner;

public class Recursion {
	public static void withoutloop(int n) {
	      if (n - 1 != 0)
	    	  withoutloop(n - 1);
	      System.out.println(n);
		
	}
    public static void sumofnumber(int n,int sum) {
    	sum = sum + n % 10;
    	n = n / 10;
    	if (n == 0) {
    		System.out.println("the sum is :" + sum);
    	}
    	else {
    		sumofnumber(n,sum);
    	}
    }
    public static void noOfdigits(int n,int count) {
    	n = n / 10;
    	if (n == 0) {
    		count  = count + 1;
    		System.out.println("no of digits :" + count);
    	}
    	else {
    		count = count +1;
    		noOfdigits(n,count);
    	}
    }
    public static int sum(int n) {
        if (n / 10 == 0) {
            return n;
        }
        else
          return n % 10 + sum(n / 10);
    }
    public static int digitalRoot(int n)
    {
        if (n / 10 == 0) {
            return n;
        }
        else {
            return digitalRoot(sum(n));
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
		System.out.println("M-E-N-U");
		System.out.println("1.printing 1 to n without loop");
		System.out.println("2.sum of the number");
		System.out.println("3.no of digits in a number");
		System.out.println("4.didgital root");;
		System.out.println("enter your option");
		Scanner sc = new Scanner(System.in);
		int o = sc.nextInt();
		switch(o) {
		case 1:	System.out.println("enter the n value:");
				int n = sc.nextInt(); 
				withoutloop(n);
				break;
		case 2: System.out.println("enter the n value:");
		        int m = sc.nextInt();
		        sumofnumber(m,0);
		        break;
		case 3:System.out.println("enter d value:");
		        int d = sc.nextInt();
		        noOfdigits(d,0);
		        break;
		case 4:System.out.println("enter value");
		       int s = sc.nextInt();
		       System.out.println("the root is : " + digitalRoot(s));
		       break;
		default:System.out.println("enter a valid choice");
		}
	}

	}

}
