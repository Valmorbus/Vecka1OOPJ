package threading;

public class ChildThreadRunner {

	public static void main(String[] args) {
		ChildThreadTester child1= new ChildThreadTester();
		ChildThreadTwo child2 = new ChildThreadTwo();
	
		
		for (int i = 0; i < 5; i++) {
			
			try {
				child1.getThread().join();
				child2.getThread().join();
				Thread.sleep(500);
				System.out.println("main thread " +i);
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		System.out.println("done ");
		
	}

}
