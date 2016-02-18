package threading;

public class ThreadCommunicationDemo {

	public static void main(String[] args) {
		SharedResource sr = new SharedResource();
		Trader2 t1= new Trader2("first", sr);
		Trader2 t2 = new Trader2("second", sr);
		
		System.out.println("set lock on thread");
		t1.suspendThread();
		t1.resumeThread();
		t2.suspendThread();
		t2.resumeThread();
		t1.setRun(false);
		t2.setRun(false);
		try {
			t1.getThread().join();
			t2.getThread().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
