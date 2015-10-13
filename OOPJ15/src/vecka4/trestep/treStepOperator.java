package vecka4.trestep;

import java.util.Scanner;

public class treStepOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int fraga = sc.nextInt();
		String svar = (fraga == 0)? "fel inmatning" : Integer.toString(fraga/2);
		
		System.out.println(svar);

	}

}
