package vecka1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SortText {

	public static void main(String[] args) {
		SortText st = new SortText();
		ArrayList<String> stringList = new ArrayList<String>();
		stringList = st.read();
		
		for (String line : stringList)
		{
			System.out.println(line);
		}
	}
	
	private ArrayList<String> read()
	{
		ArrayList<String> lines = new ArrayList<String>();
		String path = "C:/Users/borgs_000/workspace/OOPJ15/text/array.txt";
		try(BufferedReader br = new BufferedReader(new FileReader(path))){		
			while (br.readLine() != null)
				lines.add(br.readLine());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return lines;
		
	}

}
