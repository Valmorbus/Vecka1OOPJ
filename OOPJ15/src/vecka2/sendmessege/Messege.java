package vecka2.sendmessege;

import java.time.LocalDateTime;

public class Messege {
	private LocalDateTime date  = LocalDateTime.now();;
	private String sender;
	private String messege;
	
	
	public Messege(String owner, String messege) {
		//this.date = date;
		this.sender = owner;
		this.messege = messege;
		//LocalDateTime date = LocalDateTime.now();
	}

	
	public String getDate() {
		return date.toString();
	}

	/*
	public void setDate(Date date) {
		this.date = date;
	}*/


	public String getSender() {
		return sender;
	}


	public void setSender(String sender) {
		this.sender = sender;
	}


	public String getMessege() {
		return messege;
	}


	public void setMessege(String messege) {
		this.messege = messege;
	}	
	
	public void display(String maker)
	{
	    //LocalDateTime now = LocalDateTime.now(); 
		System.out.println(getDate());

		System.out.println(sender);
		System.out.println(messege);
		System.out.println("sent from my " +maker);
	}

}
