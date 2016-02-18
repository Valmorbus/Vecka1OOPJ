package threading;

public class Trader2 implements Runnable {

	private Thread thread;
	private String name;
	private SharedResource sharedResource;
	private boolean suspendFlag;
	private boolean run = true;

	public Trader2(String name, SharedResource sharedResourse) {
		super();
		this.name = name;
		sharedResource = sharedResourse;
		thread = new Thread(this);

		suspendFlag = false;
		thread.start();
	}
	
	public void resumeThread(){
		this.suspendFlag = false;
		
	}
	public void suspendThread(){
		this.suspendFlag = true;
		synchronized(sharedResource){
			sharedResource.notify();
		}
	}

	@Override
	public void run() {
		while (run) {
			sharedResource.makePayment(getName());
			try {
				Thread.sleep(500);
				
				synchronized(sharedResource){
					if (suspendFlag)
						sharedResource.wait();
				}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public Thread getThread() {
		return thread;
	}

	public void setThread(Thread thread) {
		this.thread = thread;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isRun() {
		return run;
	}

	public void setRun(boolean run) {
		this.run = run;
	}
	

}
