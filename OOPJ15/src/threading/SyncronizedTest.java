package threading;

public class SyncronizedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		Trader t1 = new Trader(account, "Sven1");
		Trader t2 = new Trader(account, "Sven2");
		Trader t3 = new Trader(account, "Sven3");
	}

}
