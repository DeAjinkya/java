package storing;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Storing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<String> words = new LinkedList<>();
		System.out.println("enter the no of elements to add : ");
		int num = sc.nextInt();
		System.out.println("enter the elements : ");
		int i = 0;
		while(i < num) {
			String str = sc.next();	
			words.add(str);
			i++;
		}
		
		System.out.println("before removing elements : ");

		for( String s : words ) {
			System.out.println(s);
		}
		
		System.out.println("enter the element to remove : ");
		int index = sc.nextInt();
		
		words.remove(index);
		System.out.println("after removing elements");
		for( String s : words ) {
			System.out.println(s);
		}

	}

}
