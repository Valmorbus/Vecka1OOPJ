package vecka2.person;

public class runPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runPerson rp = new runPerson();
		rp.persons();
	}
	
	private void persons()
	{
		Person t1 = new Teacher("sven", "gatan", "female", 1985, "computer", 75000);
		
		Person s1 = new YHStudent("robin", "b�lsta", "male", 1984, "computer", 500000, "no"); 
		Person s2 = new YHStudent("robin2", "b�lsta", "male", 1984, "computer", 500000, "no"); 
		Person s3 = new YHStudent("robin3", "b�lsta", "male", 1984, "computer", 500000, "yes"); 
		Person s4 = new YHStudent("robin4", "sthlm", "female", 1984, "computer", 500000, "no"); 
		
		t1.printAll();
		s2.printAll();
		s4.printAll();
	}

}
