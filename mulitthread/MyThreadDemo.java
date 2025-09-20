package mulitthread;

public class MyThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r = new MyThread();   
		Thread t = new Thread(r);   
		t.start(); 
		
//		Thread t = new MyThread();   
//		t.start();   
//		
//		Thread t1 = new MyThread();
		System.out.println("name = "+t.getName());
		System.out.println("thread priority = "+t.getPriority());

	}

}
