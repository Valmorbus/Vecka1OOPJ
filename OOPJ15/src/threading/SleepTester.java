package threading;

public class SleepTester {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			
			try {
				Thread.sleep(500);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
