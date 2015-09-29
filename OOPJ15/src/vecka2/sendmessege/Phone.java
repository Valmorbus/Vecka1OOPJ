package vecka2.sendmessege;

import java.util.Date;

public class Phone {
	private String owner;
	private String maker;
	
	public Phone(String owner, String maker) {
		super();
		this.owner = owner;
		this.maker = maker;
	}
	
	
	public void sendmessege(String messege)
	{
		Date date = new Date();
		Messege m = new Messege(owner,  messege);
		m.display(maker);
	}
	
}
