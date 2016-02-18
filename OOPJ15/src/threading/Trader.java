package threading;

public class Trader {
	Account account;
	String name;
	Thread thread;
	
	
	public Trader(Account account, String name) {
		super();
		this.account = account;
		this.name = name;
		
		this.thread=new Thread(()->{
			account.makePayment(name);
		});thread.start();
		
	}
	
	
	

}
