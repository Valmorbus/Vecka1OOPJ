package vecka4.sortCustomers;

public class Subscriber extends Buyer {
	
	protected int time;

	public Subscriber(String name, String adress, int purchases, int customerNumber) {
		super(name, adress, purchases, customerNumber);
		// TODO Auto-generated constructor stub
	}

	public Subscriber(String name, String adress, int purchases, int time, int customerNumber) {
		super(name, adress, purchases, customerNumber);
		this.time = time;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	

	public int calculateValue(int price, int subscriptionCost) {
		int purchaseValue = calculateValue(price);
		int subscriptionValue = this.time*subscriptionCost;
		
		int totalValue = purchaseValue +subscriptionValue;	
		return totalValue;
		//return super.calculateValue(price);
	}



	
	

}
