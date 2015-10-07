package vecka3lektioner;

public class TestType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private void testType(Object obj){
		if (obj instanceof TestType){
			System.out.println("this is this");
		}
		else
			System.out.println("this is something else");
	}

}
