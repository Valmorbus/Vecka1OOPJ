package vecka4.OrangeFactoryLinked;

public class Orange extends Fruit{

	public Orange() {
		super();
		this.taste = Taste.SWEET;
		
	}
	public boolean hasSeeds()
	{		
		this.getSeeds();
		if (this.getSeeds() > 0)
			return true;
		else 
			return false;
	}
	public Seed pickSeed()
	{
		
		Seed s = this.pickOne();
		
		this.setSeeds(this.getSeeds()-1);
		
		return  s;
	}
	

}
