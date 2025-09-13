package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			int choice = Integer.parseInt(args[2]);
//			Scanner sc = new Scanner(System.in);
//			System.out.println("enter n1: ");
//			int n1 = sc.nextInt();
//			System.out.println("enter n2: ");
//			int n2 = sc.nextInt(); 
//			
//			System.out.println("enter the choice 1.+ \n2.- \n3.* \n4./ :");
//			int choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.println("add = "+n1+n2);
			} else if (choice == 2) {
				System.out.println("subtract = "+(n1-n2));
			}else if (choice == 3) {
				System.out.println("subtract = "+(n1*n2));
			}else if (choice == 4) {
				System.out.println("subtract = "+(n1/n2));
			}else {
				System.out.println("enter a vaild input");
			}
			
		} catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch(InputMismatchException e) {
			System.out.println(e);
		}
		

	}
}


