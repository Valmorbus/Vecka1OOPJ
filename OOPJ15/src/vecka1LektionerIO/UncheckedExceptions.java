package vecka1LektionerIO;

public class UncheckedExceptions {

	public static void main(String[] args) {
		UncheckedExceptions unc = new UncheckedExceptions();
		unc.test2();
		//unc.test();
		System.out.println("end of main");

	}

	private void test()
	{
		throw new NullPointerException("error");
	}
	private void test2()
	{
		@SuppressWarnings("unused")
		int result;
		try{
			int divide =0;
			result = 4/divide;
		}
		catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println("kan ju inte dela med noll, DUMHUVUD!");
			result = 0;
		}
		
		
	}
	
	
}
