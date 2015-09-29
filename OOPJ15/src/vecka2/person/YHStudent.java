package vecka2.person;

public class YHStudent extends Student {
	private String lia;


	public YHStudent(String name, String adress, String gender, int yearOfBirth, String subjects, int debt,
			String lia) {
		super(name, adress, gender, yearOfBirth, subjects, debt);
		this.lia = lia;
	}


	public String getLia() {
		return lia;
	}


	public void setLia(String lia) {
		this.lia = lia;
	}


	@Override
	public void printAll() {
		// TODO Auto-generated method stub
		super.printAll();
		System.out.println("lia: " + lia);
	}
	
	

}
