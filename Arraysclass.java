package javabeginning;

import java.util.Arrays;

public class Arraysclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[8];
		Arrays.fill(numbers,3);
		System.out.println(Arrays.toString(numbers));
		char[] chars = new char[8];
		Arrays.fill(chars,'a');
		System.out.println(Arrays.toString(chars));
		Arrays.fill(numbers,2,6,2);
		System.out.println(Arrays.toString(numbers));
		int[] nums = {5,4,3,2,1};
	    Arrays.parallelSort(nums);
	    System.out.println(Arrays.toString(nums));
	    System.out.println(Arrays.binarySearch(nums,3));

	}

}
