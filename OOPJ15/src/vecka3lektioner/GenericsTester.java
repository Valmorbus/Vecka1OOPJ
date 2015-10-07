package vecka3lektioner;

public class GenericsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericsTester gt = new GenericsTester();
		gt.test();
	}
	
	private void test()
	{
		String s = "test string";
		GenericsTest<String> gt1= new GenericsTest<String>(s); 
		gt1.showType();
		
		int i = 100;
		GenericsTest<Integer> gt2= new GenericsTest<Integer>(i); 
		gt2.showType();
		int j = gt2.getType();
		System.out.println(j);
	}

}
