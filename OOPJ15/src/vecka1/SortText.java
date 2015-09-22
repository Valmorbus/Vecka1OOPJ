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
		int counter = 0;
		try(BufferedReader br = new BufferedReader(new FileReader(path));
				BufferedReader control = new BufferedReader(new FileReader(path))){		
			while (control.readLine() != null)
			{
				counter++;
			}
			control.close();
			for (int i = 0; i < counter; i++) {
				lines.add(br.readLine());
			}
			
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
