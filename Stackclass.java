package arrays;
import java.util.*;

public class Stackclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Stack<Integer> st = new Stack<Integer>();
         st.add(2);
         st.add(3);
         st.add(5);
         System.out.println(st);
         System.out.println(st.peek());
         st.pop();
         st.pop();
         System.out.println(st.peek());
         System.out.println(st);
         System.out.println(st.isEmpty());
         st.pop();
         System.out.println(st.isEmpty());
	}

}
