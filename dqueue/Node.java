package DynamicQueue;

public class Node {
	private int data;
	private Node next;
	
	public Node() {
		data = 0;
		next = null;
	}
	
	public void setData(int value) {
		data = value;
	}
	
	public int getData() {
		return data;
	}
	
	
	public void setNext(Node newnode) {
		next = newnode;
	}
	
	public Node getNext() {
		return next;
	}
	
}
