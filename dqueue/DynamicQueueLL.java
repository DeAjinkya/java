package DynamicQueue;

public class DynamicQueueLL {
	private Node front,rear;
	
	public DynamicQueueLL() {
		front = null;
		rear = null;
	}
	
	public Node createNode(int value) {
		Node newnode = new Node();
		newnode.setData(value);
		newnode.setNext(null);
		return newnode;
	}
	
	public void enQueue(int value) {
		Node newnode = createNode(value);
		
		//if queue is empty 
		if(front == null && rear == null) {
			front = rear = newnode;
		}else {
			//connect rear with newnode 
			rear.setNext(newnode);
			//shift rear to newnode
			rear = newnode;			
		}
			
		}//enQueue
	
		public int DeQueue() {
			if(front == null && rear == null) {
				System.out.println("no element present in the queue first insert one");
				return -1;
			}else {
				Node temp = front;// reference 
				int value = front.getData();// value
				front = front.getNext();// shifting to next node or element
				temp.setNext(null);//remove the node or element
				
				// last node or element gets removed then front = null then assign rear to null
				// because rear is pointing to the deleted or removed element
				if(front == null) {
					rear = null;
				}
				
				return value;
				
			}
		}
		
		public void display() {
			//check if the queue is empty or not
			if(front == null && rear == null) {
				System.out.println("Queue underflow(no element present)");
			}else {
				Node temp = front;
				while(temp!=null) {
					System.out.println("\t"+temp.getData());
					temp = temp.getNext();
				}
			}
		}//display
		
	
	
}
