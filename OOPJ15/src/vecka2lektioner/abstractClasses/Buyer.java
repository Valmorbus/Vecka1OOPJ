package vecka2lektioner.abstractClasses;

public class Buyer extends Customer {

	public Buyer(String name, String adress, int purchases) {
		super(name, adress, purchases);
	}
	
	protected int calculateValue(int price)
	{
		int value = price*purchases; 
		return value;
	}
	
	

}
