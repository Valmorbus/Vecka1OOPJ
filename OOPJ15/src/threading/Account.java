package threading;

public class Account {
	
	public synchronized void makePayment(String name){
		System.out.println(name +" started");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name +" finnished");
	}

}
