package vecka3lektioner;

public class GenericsMethodTester {
	public static void main(String[] args){
		
		GenericsMethodTester gt = new GenericsMethodTester();
		Integer iArray[]={1,2,3,4,5,6};
		Integer i = 5;
		System.out.println(gt.isInArray(i, iArray));
		
		String[] s = {"hej", "hå", "hej", "då"};
		String s2 = "dår";
		
		System.out.println(gt.isInArray(s2, s));
		Integer ing = 5;
		Double db[] = {
				5.0, 6.0, 7.0
		};
		System.out.println(gt.isInArray(ing, db));
		System.out.println(gt.isInArray(ing, db, s));
		
		
	}
	private <T1,T2,T3> boolean isInArray (T1 type1, T2[] type2, T3 ... type3)
	{
		for (int i = 0; i < type2.length; i++) {
			if (type1.equals(type2[i])) {
				return true;
				
			}
			
		}
		if (type3 != null)
			System.out.println(type3.getClass().getSimpleName());
		return false;
	}
}
