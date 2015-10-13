package vecka4lektioner.maps;

public class CustomerValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerValue cv = new CustomerValue();
		cv.checkValue();

	}

	private void checkValue()
	{
		SpecialSubscriber ss1 = new SpecialSubscriber("sven1", "Nan", 12, 1, 1);
		SpecialSubscriber ss2 = new SpecialSubscriber("sven2", "Nan", 10, 2, 2);
		SpecialSubscriber ss3 = new SpecialSubscriber("sven2", "Nan", 6, 7, 3);
		
		Subscriber s1 = new Subscriber("olof", "nan", 12, 5, 4);
		
		Buyer b1 = new Buyer("Bengt", "null", 38, 5);
		
		
		
	}
}
