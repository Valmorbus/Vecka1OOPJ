package vecka2.animal;

public abstract class Reptile extends Animal{
	private boolean scaly;

	public Reptile(float bodyTemp, String name, String sound, boolean scaly) {
		super(bodyTemp, name, sound);
		this.scaly = scaly;
	}

	public boolean isScaly() {
		return scaly;
	}

	public void setScaly(boolean scaly) {
		this.scaly = scaly;
	}

	@Override
	public void printall() {
		{
			System.out.println(bodyTemp);
			System.out.println(name);
			System.out.println(sound);
			System.out.println("scaly " +scaly);
				
		}
		
	}
	
	
}
