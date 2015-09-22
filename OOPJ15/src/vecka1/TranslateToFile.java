package vecka1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TranslateToFile {

	private BufferedReader open()
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
		
		return text;
	}
	private void fileWrite(String text)
	{
		BufferedWriter br = null;
		
		try {
			br = new BufferedWriter(new FileWriter("C:/Users/borgs_000/workspace/OOPJ15/text/notnord.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			br.write(text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		TranslateToFile tr = new TranslateToFile();
		
		System.out.println(tr.translate(tr.open()));// TODO Auto-generated method stub
		tr.fileWrite(tr.translate(tr.open()));
		
	}

}
