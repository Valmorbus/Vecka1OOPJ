package vecka4.OrangeFactoryLinked;

import java.util.Random;

public class Seed {
	private int seedVolume;
	
	public Seed()
	{
		Random r = new Random();
		this.seedVolume = r.nextInt(5)+10;
		
	}
	public int getSeedVolume() {
		return seedVolume;
	}
	public void setSeedVolume(int seedVolume) {
		this.seedVolume = seedVolume;
	}

	
}
