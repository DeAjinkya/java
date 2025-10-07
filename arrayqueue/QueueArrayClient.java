package QueueArray;

import java.util.Scanner;

public class QueueArrayClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc = new Scanner(System.in);
			
			QueueArray qa = new QueueArray();
			
			int option = 0,size = 0,value = 0;
			
			do {
				System.out.println("------------menu-------------");
				System.out.println("1.initQueue"+
								   "\n2.EnQueue"+
								   "\n3.DeQueue"+
								   "\n4.Display"+
								   "\n0.Exit");
				System.out.println("Enter your choice :: ");
				option = sc.nextInt();
				
				switch(option) {
				case 1:
					System.out.println("enter size of queue: ");
					size = sc.nextInt();
					qa.initQueue(size);
					break;
					
				case 2:
					System.out.println("enter value to enqueue/add: ");
					value = sc.nextInt();
					qa.enQueue(value);
					break;
					
				case 3:
					
					value = qa.deQueue();
					System.out.println("value to dequeue/remove: " + value);
					
					break;
					
				case 4:
			    	System.out.println("--------------------\n");
			    	qa.display();
			    	System.out.println("\n--------------------\n");
			    	break;
			    case 5:
			    	System.exit(0);
				
				}
				
			}while(option!=0);
			
			sc.close();
			

	}

}
