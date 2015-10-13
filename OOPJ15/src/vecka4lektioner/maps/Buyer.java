package vecka4lektioner.maps;

public class Buyer extends Customer {

	
	public Buyer(String name, String adress, int purchases, int customerNumber) {
		super(name, adress, purchases, customerNumber);
		// TODO Auto-generated constructor stub
	}
	public Buyer(String name, String adress, int purchases) {
		super(name, adress, purchases);
	}
	

	protected int calculateValue(int price)
	{
		int value = price*purchases; 
		return value;
	}
	
	

}
