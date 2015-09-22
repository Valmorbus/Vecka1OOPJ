package vecka1LektionerIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExeptions {

	public static void main(String[] args) {
		CheckedExeptions ce = new CheckedExeptions();
		try {
			ce.findFile3();
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			ce.findFile4();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ce.findFile1();
		try {
			ce.findFile2();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end of main");
	}
	void findFile1()
	{
		try {
			BufferedReader bf = new BufferedReader(new FileReader(
					"C:/Users/borgs_000/workspace/OOPJ15/text/newnamn5.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//throws, måste tas om hand om där den kallas
	void findFile2() throws FileNotFoundException
	{
		BufferedReader bf = new BufferedReader(new FileReader(
				"C:/Users/borgs_000/workspace/OOPJ15/text/newnamn5.txt"));
	}
	void findFile3() throws FileNotFoundException
	{
			try {
				BufferedReader bf = new BufferedReader(new FileReader(
						"C:/Users/borgs_000/workspace/OOPJ15/text/newnamn5.txt"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				throw e; //kastar vidare problemet vid behov
			}finally{
				System.out.println("fett fel");
			}
	}
	void findFile4() throws FileNotFoundException
	{
		throw new FileNotFoundException("ganska mycket error var det här");
	}

}
