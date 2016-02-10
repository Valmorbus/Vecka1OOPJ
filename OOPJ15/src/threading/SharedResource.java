package threading;

public class SharedResource {

	float balance =0;;

	public synchronized void makePayment(String name) {
		balance++;
		System.out.println(name + "has lock on thread");
	}

}
