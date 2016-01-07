package threading;

public class ChildThreadTester implements Runnable{

	Thread thread;
	
	public ChildThreadTester() {
		super();	
		thread=new Thread(this);
		thread.start();
	}
	



	public Thread getThread() {
		return thread;
	}




	public void setThread(Thread thread) {
		this.thread = thread;
	}




	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
				System.out.println("child thread " +i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}System.out.println("child thread done");
		
		
	}

}
