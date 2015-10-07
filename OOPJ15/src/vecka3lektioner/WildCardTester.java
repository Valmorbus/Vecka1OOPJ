package vecka3lektioner;

public class WildCardTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		Float[] farray ={3.4f,4f,54f,4353f,43534f,05f};
		Integer[] iarray = {1,2,3,5,6,78,5};
		Statistics<Float> statistics1 = new Statistics<Float>(farray);
		Statistics<Integer> statistics2 = new Statistics<Integer>(iarray);

		System.out.println(statistics1.sumAverage(statistics2));
	}

}
