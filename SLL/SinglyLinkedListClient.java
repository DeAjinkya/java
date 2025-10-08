package SinglyLinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class SinglyLinkedListClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SingleLinkedList sll = new SingleLinkedList();
//		Node result = sll.createNode();
//		System.out.println(result.getData());
//		System.out.println(result.getNext());
		
		Scanner sc = new Scanner(System.in);
		int option,value;
		
		SingleLinkedList sll = new SingleLinkedList();
		
		do
		{
			System.out.println("------------Menu-------");
			System.out.println("\n1:CreateNew list"+
			                   "\n2:AddAtStart"+
					           "\n3:AddAtend"+
			                   "\n4:AddByData"+
					           "\n5:DeleteAtStart"+
			                   "\n6:DeleteAtEnd"+
					           "\n7:DeleteByData"+
			                   "\n8:Reverse"+
					           "\n99:Display"+
			                   "\n0:Exit");
			System.out.println("Enter your choice: ");
			option = sc.nextInt();
			
			switch(option)
			{
			case 1:
				//Node newnode = createNode();
				//sll.setHead(newnode);
				//OR
				sll.setHead(sll.createNode());
				System.out.println("\tNew Linked List created\n");
				break;
			case 2:
				sll.addAtStart();
				break;
			case 3:
				sll.addAtEnd();
				break;
			case 4:
				System.out.println("Enter value where to add: ");
				value = sc.nextInt();
				sll.addByData(value);
				break;
			case 5:
				sll.deleteAtStart();
				break;
			case 6:
				sll.deleteAtEnd();
				break;
			case 7:
				System.out.println("Enter value to delete: ");
				value = sc.nextInt();
				sll.deleteByData(value);
				break;
			case 8:
				sll.reverse();
				break;
			case 99:
				System.out.println("\n--------------------------------\n");
				sll.display();
				System.out.println("\n--------------------------------\n");
				break;
			case 0:
				System.exit(0);
			}//switch
			
		}while(option!=0);
		
		sc.close();

	}

}
