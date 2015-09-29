package vecka2lektioner.abstractClasses;

public class ValueCalculator {
	private final int PRICE = 23;
	private final int SUBSCRIPTION = 450;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValueCalculator vc = new ValueCalculator();
		vc.preferedCustomer();

	}
	
	private void preferedCustomer()
	{
		Buyer b = new Buyer("någon b", "någonstans", 34);		
		int value = b.calculateValue(PRICE);
		System.out.println("value for buyer b " +value);
		
		Subscriber s = new Subscriber("någon s", "någonstans s", 13, 2);
		int value2 = s.calculateValue(PRICE, s.getTime(), SUBSCRIPTION);
		System.out.println("subscriber value: " +value2);
		
	}
	
	

}
