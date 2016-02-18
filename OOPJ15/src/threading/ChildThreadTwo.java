package threading;

public class ChildThreadTwo {
	

	Thread thread;
	
	public ChildThreadTwo() {
		super();	
		thread=new Thread(()->{
			run();
		});
		thread.start();
	}



	
	public Thread getThread() {
		return thread;
	}




	public void setThread(Thread thread) {
		this.thread = thread;
	}




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
