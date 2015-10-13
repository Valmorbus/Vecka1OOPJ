package vecka4.animal;

public abstract class Mamal extends Animal {
	private int legs;
	private String gender;
	
	public Mamal(float bodyTemp, String name, String sound, int legs, String gender) {
		super(bodyTemp, name, sound);
		this.legs = legs;
		this.gender = gender;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public void printall() {
		// TODO Auto-generated method stub
		{
			System.out.println(bodyTemp);
			System.out.println(name);
			System.out.println(sound);
			System.out.println(legs);
			System.out.println(gender);
		}
	}
	
	
	
}
