package vecka2.person;

public class Student extends Person {
	private String subjects;
	private int debt;
	
	public Student(String name, String adress, String gender, int yearOfBirth, String subjects, int debt) {
		super(name, adress, gender, yearOfBirth);
		this.subjects = subjects;
		this.debt = debt;
	}

	public String getSubjects() {
		return subjects;
	}

	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}

	public int getDebt() {
		return debt;
	}

	public void setDebt(int debt) {
		this.debt = debt;
	}

	@Override
	public void printAll() {
		// TODO Auto-generated method stub
		super.printAll();
		System.out.println("Subject: " + subjects);
		System.out.println("debt: " + debt);
	}
	
}
