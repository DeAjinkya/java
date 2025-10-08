package SinglyLinkedList;

import java.util.Scanner;

public class SingleLinkedList {
	private Node head;
	
	Scanner sc = new Scanner(System.in);
	
	public SingleLinkedList() {
		head = null;
	}
	
	public Node getHead() {
		return head;
	}
	
	public void setHead(Node head) {
		this.head = head;
	}

	public Node createNode() {
		Node newnode = new Node();
		System.out.println("Enter the value: ");
		int value = sc.nextInt();
		newnode.setData(value);
		return newnode;
	}
	
	public void addAtStart()
	{
		Node newnode = createNode();
		
		//check if LL is empty
		if(head == null)
		{
			head = newnode;
		}
		else //LL is !empty
		{
		   newnode.setNext(head);
		   head = newnode;
		}
		
	}//addAtStart()
	
	public void addAtEnd()
	{
		Node newnode = createNode();
		Node temp=head;
		
		if(head==null) //LL is empty
		{
			head  =newnode;
		}
		else
		{
			//search for last node
			while(temp.getNext()!=null)
			{
				temp = temp.getNext();
			}
			//connect last node i.e. temp with newnode
			temp.setNext(newnode);				
		}//else
		
	}//addAtEnd
	
	public void addByData(int value)
	{
		Node newnode = createNode();
		Node temp=head;
		
		if(head==null) //LL is empty
		{
			head = newnode;
		}
		else if(head.getNext()==null) //single node exists
		{
			if(head.getData()==value) //node's data ==value
				head.setNext(newnode);
			else
				System.out.println("\tERROR: node not found...!!!");
		}
		else //LL having multiple nodes
		{
			//search for valid node in LL until found or LL is terminated
			while(temp!=null && temp.getData()!=value)
			{
				temp = temp.getNext();
			}
			if(temp!=null)//when node is encountered
			{
				//Step1: connect newnode and temp's adjacent node
				newnode.setNext(temp.getNext());
				//Step2: connect temp and newnode
				temp.setNext(newnode);
			}
			else
				System.out.println("\tERROR: node not found...!!!");
			
		}//else		
		
	}//addByData
	
	public void deleteAtStart()
	{
		Node temp=head;
		
		if(head == null) //LL in empty
			System.out.println("\tLinked List is empty");
		else //LL is not empty
		{
		   	//shift head to existing 2nd node
			head = head.getNext();
			//break the link between temp and recent head
			temp.setNext(null);
		}
		
	}//deleteAtStart
	
	public void deleteAtEnd()
	{
        Node temp=head;
        
        if(head == null)
        	System.out.println("\tLinked List is empty...!!!");
        else if(head.getNext()==null) //single node exists
        	head = null;
        else //multiple nodes in LL
        {
        	//search for 2nd-last node in LL
        	while(temp.getNext().getNext()!=null)
        	{
        		temp = temp.getNext();
        	}
        	temp.setNext(null);
        }//else
        
	}//deleteAtEnd()
	
	public void deleteByData(int value)
	{
		Node temp=head, tag=head;
		
		if(head==null)
			System.out.println("\tLinked List is empty....!!!");
		else if(head.getNext()==null)//single node exists
		{
			if(head.getData()==value)
			{
				head=null;
			}
			else
				System.out.println("\tNODE not FOUND...!!!");
		}
		else //multiple nodes in LL
		{
			//traverse and search for node in LL
			while(temp!=null && temp.getData()!=value)
			{
				//shift tag on location of temp
				tag=temp;  
				//shift temp to next node
				temp = temp.getNext();
			}
			
			if(temp!=null)  //node found
			{
				//connect tag with temp's adjacent node
				tag.setNext(temp.getNext());
				//d-link temp with its adjacent node
				temp.setNext(null);
			}
			else
				System.out.println("\tNode not FOUND...!!");
		}//else
		
	}//deleteByData()
	
	public void display()
	{
		Node temp=head;
		
		if(head==null)
			System.out.println("\tLinked List is empty....!!!");
		else
		{
			while(temp!=null)
			{
				System.out.print(temp.getData()+"->");
				temp = temp.getNext();
			}
			System.out.print("null");
		}
		
	}//display
	
	public void reverse()
	{
		Node prev = head;
		Node curr = head.getNext();
		Node next=null;
		if(curr.getNext()!=null)
		   next = curr.getNext();
		
		while(curr!=null)
		{
			curr.setNext(prev);  //connect current node with previous
			
			//shift all references not its adjacent node
			prev = curr;
			curr = next;
			if(next!=null)
			   next = next.getNext();			
			
		}//while
		
		head.setNext(null);//assign null with next of existing head
        head = prev;    //re-set head to last node
	}//reverse()	
	
	
}
