package vecka3;

import java.util.ArrayList;
import java.util.Random;

public abstract class Fruit extends Seed{
	protected enum Taste {SWEET, SOUR, BITTER, SALTY;}
	protected Taste taste;
	private int seeds;
	private Seed seed;
	private ArrayList<Seed> seedList= new ArrayList<Seed>();
	
	public Fruit() {
		super();
		Random r = new Random();
		seeds = r.nextInt(10)+1;
		taste = Taste.SWEET;
		seed = new Seed(); 
		for (int i = 0; i < seeds; i++) {
			seedList.add(new Seed());
			
		}
	}
	
	public String toString()
	{
		System.out.println("Seeds: " +seeds + " volume of seeds: " +getSeed().getSeedVolume()+ " taste: " +taste.toString());
		return null;
	}

	public Taste getTaste() {
		return taste;
	}

	public void setTaste(Taste taste) {
		this.taste = taste;
	}

	public int getSeeds() {
		return seeds;
	}

	public void setSeeds(int seeds) {
		this.seeds = seeds;
	}

	public Seed getSeed() {
		return seed;
	}

	public void setSeed(Seed seed) {
		this.seed = seed;
	}
	public Seed pickOne()
	{
		return seedList.get(getSeeds()-1);
	}

}
