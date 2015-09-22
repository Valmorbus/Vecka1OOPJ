package vecka1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class FirstPerson {
	
	
	
	public String reader()
	{
		File file = new File("C:/Users/borgs_000/workspace/OOPJ15/text/namn.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			BufferedReader controller = new BufferedReader(new FileReader(file));
			String line = "";
			String result = null;
			Random rand = new Random();
			int lines = 0;
			while (controller.readLine() != null){
				lines++;
			}
			controller.close();
			
			int j = rand.nextInt(lines);
			int i = lines;
			while(i != 0)
			{
				System.out.println(i);
				i--;
				line = reader.readLine();
				System.out.println(line);
				if (i == j )
					result = line;
			
			}
			reader.close();
			return result;
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error" + e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstPerson fp = new FirstPerson();
		System.out.println(fp.reader());
	}

}
