package vecka4lektioner.maps;

public class SpecialSubscriber extends Subscriber {
	final int SERVICE_COST=145;

	public SpecialSubscriber(String name, String adress, int purchases, int time, int customerNumber) {
		super(name, adress, purchases, time, customerNumber);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	protected int calculateValue(int price, int time, int subscriptionCost) {
		// TODO Auto-generated method stub
		return super.calculateValue(price, time, subscriptionCost-SERVICE_COST);
	}
	
}
