package DynamicQueue;

import java.util.Scanner;

public class DynamicQueueLLClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int option = 0,value = 0;
		DynamicQueueLL dq = new DynamicQueueLL();
		
		do {
			System.out.println("----------Menu-------");
		    System.out.println("\n1.EnQueue"+
		    		           "\n2.DeQueue"+
		                       "\n3.Display"+
		    		           "\n0: Exit");
		    System.out.println("Enter your choice:: ");
		    option = sc.nextInt();
		    
		    switch(option) {
		    case 1:
		    	System.out.println("enter value to enqueue");
		    	value = sc.nextInt();
		    	dq.enQueue(value);
		    	System.out.println("value added");
		    	break;
		    case 2:
		    	value = dq.DeQueue();
		    	if(value != -1) {
		    		System.out.println("\t Dequeue:: "+value);
		    	}
		    	break;
		    case 3:
		    	System.out.println("--------------------\n");
		    	dq.display();
		    	System.out.println("\n--------------------\n");
		    	break;
		    case 0:
		    	System.exit(0);
		    }//switch
		}while(option!=0);
		sc.close();
	}

}
