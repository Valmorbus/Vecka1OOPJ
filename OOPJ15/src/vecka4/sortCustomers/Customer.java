package vecka4.sortCustomers;

public abstract class Customer {
	
	protected String name;
	protected String adress;
	protected int purchases;
	int customerNumber;
	
	public Customer(String name, String adress, int purchases, int customerNumber) {
		super();
		this.name = name;
		this.adress = adress;
		this.purchases = purchases;
		this.customerNumber = customerNumber;
	}
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

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	
}
