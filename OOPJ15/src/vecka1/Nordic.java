package vecka1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Nordic {
	
	private BufferedReader Open()
	{
		String filePath = "C:/Users/borgs_000/workspace/OOPJ15/text/nord.txt";
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			return reader;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;	
	}
	private String translate(BufferedReader reader)
	{
		String text = null;
		try {
			text = reader.readLine().replace("oe", "ö").replace("ae", "ä");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return text;
	}

	
	
	public static void main(String[] args) {
		Nordic nc = new Nordic();
		
		System.out.println(nc.translate(nc.Open()));// TODO Auto-generated method stub
		
	}
}
