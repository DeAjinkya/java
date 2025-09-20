package mulitthread;

public class MyThread implements Runnable {
		
		@Override
		public void run()
		{
			for(int i = 1 ; i<=5 ;i++) {
				System.out.println("thread prints : "+i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}  

}
