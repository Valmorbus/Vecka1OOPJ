package vecka4.adressBook;

public class Person {
	private String firstName;
	private String lastName;
	private String phonenumber;
	private String adress;
	private String email;
	public Person(String firstName, String lastName, String phonenumber, String adress, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phonenumber = phonenumber;
		this.adress = adress;
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void printAll(){
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("adress: " + adress);
		System.out.println("Phonenumber: " + phonenumber);
		System.out.println("Email: " + email);
	}
	public String getAll(){
		return firstName +'\n' + lastName +'\n' +adress +'\n'+phonenumber+'\n'+email +'\n';
	}
	public String getAllsequence(){
		return firstName + lastName  +adress +phonenumber+email;
	}
	
}
