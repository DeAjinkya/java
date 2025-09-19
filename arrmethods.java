package asshashmap;

import java.util.Arrays;
import java.util.stream.IntStream;

public class arrmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int[] arr1 = {};
		
		System.out.println("array tostring method");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("fill method");
		Arrays.fill(arr,0);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("fill method");
		Arrays.fill(arr,0,4,2);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("arrays clone method");
		arr1 = arr.clone();
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("arrays equals method");
		boolean result = arr1.equals(arr);
		System.out.println(result);
		
		int[] arr2 = {9,4,6,8,3,2,7}; 
		System.out.println("arrays sort method");
		Arrays.sort(arr2, 1, 5);
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = {1,2,3,4};
		System.out.println("arrays stream method sum");
		IntStream st = Arrays.stream(arr3);
		System.out.println(st.sum());
		
		
		System.out.println("arrays stream method avg");
		IntStream st1 = Arrays.stream(arr3);
		System.out.println(st1.average());
		
		
	}

}
