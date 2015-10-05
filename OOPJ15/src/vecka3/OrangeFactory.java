package vecka3;

public class OrangeFactory {

	public static void main(String[] args) {

		Orange orange = new Orange();
		 System.out.println("Taste of orange: " + orange.getTaste());

		 while (orange.hasSeeds()) {
		 Seed seed = orange.pickSeed();
		 System.out.println("Picked seed from orange: " + seed.getSeedVolume());

	}

}
}
