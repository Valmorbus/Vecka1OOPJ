package vecka2.sendmessege;

public class messegeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		messegeMain mm = new messegeMain();
		mm.runMessegeMain();
	}
	
	private void runMessegeMain()
	{
		Person p1 = new Person("Joe", "Iphone");
		p1.getPhone().sendmessege("Hi Sara. Shall we dance?");
		
		Person p2 = new Person("Sara", "Samsung Galaxy");
		p2.getPhone().sendmessege("Yes Joe, I would love that!!! :)");
		
	}

}
