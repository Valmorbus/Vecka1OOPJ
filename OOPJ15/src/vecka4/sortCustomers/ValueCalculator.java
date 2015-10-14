package vecka4.sortCustomers;

import java.util.Date;

public class ValueCalculator {
	
	final int PRICE=23;
	final int SUBSCRIPTIONCOST=450;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ValueCalculator valueCalculator=new ValueCalculator();
		//valueCalculator.compareCustomers();
		

	}
	
	private void compareCustomers()
	{
		Buyer buyer=new Buyer("Edgar","Lofotengaten 45",34);
		int value=buyer.calculateValue(PRICE);
		System.out.println("value for the buyer: "+value);
		
		Subscriber subscriber=new Subscriber("Greta", "Lofotengaten 15", 13, 3);
		int value2=subscriber.calculateValue(PRICE,  SUBSCRIPTIONCOST);
		System.out.println("value for subsriber "+value2);
		
		Subscriber subscriber2=new SpecialSubscriber("Greta", "Lofotengaten 15", 13, 3, 1);
		int value22=subscriber2.calculateValue(PRICE,  SUBSCRIPTIONCOST);
		System.out.println("value for SpecialSubsriber "+value22);
		
		Subscriber subscriber3=new SpecialSubscriber("Eva", "Lofotengaten 15", 23, 1, 3);
		int value23=subscriber3.calculateValue(PRICE,  SUBSCRIPTIONCOST);
		System.out.println("vatlue for SpecialSubsriber3 "+value23);
		testTypes(subscriber3);
		testTypes(new Date());
		
		//Customer test=new Customer("","",3);st
		System.out.println("---------------------------------------");
		
		
		
	}
	
	
	private void testTypes(Object object)
	{
		
		if (object instanceof SpecialSubscriber) {
			System.out.println("it is a SpecialSubsriber");
			
		}
		
		else if(object instanceof Subscriber){
			System.out.println("it is a Subscriber");
			
		}
		else if(object instanceof Buyer){
			System.out.println("it is a Buyer");
			
		}
		else
			System.out.println("other types");
		
		
	}
	
}
