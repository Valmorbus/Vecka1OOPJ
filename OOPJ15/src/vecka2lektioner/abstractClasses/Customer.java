package vecka2lektioner.abstractClasses;

public abstract class Customer {
	
	protected String name;
	protected String adress;
	protected int purchases;
	
	public Customer(String name, String adress, int purchases) {
		super();
		this.name = name;
		this.adress = adress;
		this.purchases = purchases;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getPurchases() {
		return purchases;
	}

	public void setPurchases(int purchases) {
		this.purchases = purchases;
	}
	

}
