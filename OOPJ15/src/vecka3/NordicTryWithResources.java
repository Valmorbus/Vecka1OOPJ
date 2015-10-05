package vecka3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Reads Englis and translates to Swedish alphabet signs 
 * @author borgs_000
 *	@version 1.1
 */

public class NordicTryWithResources {
	
	/**
	 * Opens a file and reads with reader
	 * @return reader if no error occurs 
	 * @exception FileNotFoundException
	 * @see FileNotFoundException
	 */
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
	/**
	 * Replaces English translations of certain characters back to swedish
	 * @param reader
	 * @return text with translation
	 */
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
	/**
	 * Writes a new file of translated text
	 * @param text to be written
	 */
	private void fileWrite(String text)
	{
		try (BufferedWriter br = new BufferedWriter(new FileWriter
				("C:/Users/borgs_000/workspace/OOPJ15/text/notnord.txt"))){
			
			br.write(text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		NordicTryWithResources tryWith = new NordicTryWithResources();
		
		System.out.println(tryWith.translate(tryWith.open()));// TODO Auto-generated method stub
		tryWith.fileWrite(tryWith.translate(tryWith.open()));
		
	}
}
