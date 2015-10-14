package vecka4.sortCustomers;

public class SpecialSubscriber extends Subscriber {
	final int SERVICE_COST=200;

	public SpecialSubscriber(String name, String adress, int purchases, int time, int customerNumber) {
		super(name, adress, purchases, time, customerNumber);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public int calculateValue(int price, int subscriptionCost) {
		// TODO Auto-generated method stub
		return super.calculateValue(price, subscriptionCost)-SERVICE_COST;
	}
	
}
