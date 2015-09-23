package vecka1LektionerIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreams {
	
	private String OpenFile()
	{
		
		String pathName = "C:/Users/borgs_000/workspace/OOPJ15/text/namn.txt";
		String textToRead = "";
		String wholeText = "";
		//BufferedReader bufferedReader = null;
		//try {	
			//bufferedReader = new BufferedReader(new FileReader(pathName));
			//textToRead = bufferedReader.readLine();
		//}
		
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(pathName))){
			while((textToRead = bufferedReader.readLine()) != null)
				{
				wholeText += textToRead +'\n';
				System.out.println(wholeText);
				}
			
		}
		catch (FileNotFoundException | ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		/*finally{
			try {
				bufferedReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		
		return wholeText;
		
	}
	private void writeFile()
	{
		try(BufferedWriter bw = new BufferedWriter(new FileWriter
				("C:/Users/borgs_000/workspace/OOPJ15/text/newnamn.txt"))){
			bw.write(OpenFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		CharStreams ch = new CharStreams();
		
		ch.writeFile();

	}

}
