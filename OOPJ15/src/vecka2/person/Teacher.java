package vecka2.person;

public class Teacher extends Person {
	private String subject;
	private int salary;

	public Teacher(String name, String adress, String gender, int yearOfBirth, String subject, int salary) {
		super(name, adress, gender, yearOfBirth);
		this.subject = subject;
		this.salary = salary;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public void printAll() {
		// TODO Auto-generated method stub
		super.printAll();
		System.out.println("Subject: " +subject);
		System.out.println("Salary: " + salary);
	}
	

}
