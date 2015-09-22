package vecka1LektionerIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExeptions {

	public static void main(String[] args) {
		CheckedExeptions ce = new CheckedExeptions();
		ce.findFile1();
		try {
			ce.findFile2();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void findFile1()
	{
		try {
			BufferedReader bf = new BufferedReader(new FileReader(
					"C:/Users/borgs_000/workspace/OOPJ15/text/newnamn.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//throws, måste tas om hand om där den kallas
	void findFile2() throws FileNotFoundException
	{
		BufferedReader bf = new BufferedReader(new FileReader(
				"C:/Users/borgs_000/workspace/OOPJ15/text/newnamn.txt"));
	}
	void findFile3()
	{
		
	}

}
