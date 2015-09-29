package vecka2.sendmessege;

public class Person {
	private String name;
	private Phone phone;
	
	
	public Person(String name, String make) {
		this.name = name;
		this.phone = new Phone(name, make);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Phone getPhone() {
		return phone;
	}


	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	
}
