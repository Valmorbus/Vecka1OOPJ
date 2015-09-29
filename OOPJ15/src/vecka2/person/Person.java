package vecka2.person;

public class Person {
	protected String name;
	protected String adress;
	protected String gender;
	protected int yearOfBirth;
	
	public Person(String name, String adress, String gender, int yearOfBirth) {
		super();
		this.name = name;
		this.adress = adress;
		this.gender = gender;
		this.yearOfBirth = yearOfBirth;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	
	public void printAll()
	{
		System.out.println("name: " + name);
		System.out.println("adress: " + adress);
		System.out.println("gender: " + gender);
		System.out.println("year of birth: " + yearOfBirth);
		
	}
	
	
}
