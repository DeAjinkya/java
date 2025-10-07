package QueueArray;

public class QueueArray {
	
	private int size;
	private int arrQue[];
	private int front;
	private int rear;
	
	QueueArray(){
		size = 0;
		arrQue = null;
		front = -1;
		rear = -1;
	}
	
	public void initQueue(int size) {
		this.size = size;
		arrQue = new int[this.size];
		front = -1;
		rear = -1;
	}
	
	public boolean isFull() {
		if(rear == size-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		if(front == rear) {
			return true;
		}else {
			return false;
		}
	}
	
	public void enQueue(int value) {
		if(!isFull()) {
			arrQue[++rear] = value;
			System.out.println("value added");
		}else {
			System.out.println("Queue overflow......");
		}
	}
	
	public int deQueue() {
		if(!isEmpty()) {
			front++;
			return arrQue[front];
		}else {
			System.out.println("Queue underflow......");
			return -1;
		}
	}
	
	public void display() {
		if(!isEmpty()) {
			for(int i = front+1;i<=rear;i++) {
				System.out.println("\t"+arrQue[i]);
			}
		}else {
			System.out.println("Queue underflow......");
		}
	}
	
	
	

}
