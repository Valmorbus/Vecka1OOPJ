package vecka1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Search sc = new Search();
		sc.meny();

	}
	
	private void meny()
	{
		System.out.println("Skriv in filnamnet du söker efter" );
		Scanner sc = new Scanner(System.in);
		File file = new File("C:/Users/borgs_000/workspace/OOPJ15/text/" + sc.nextLine()+".txt");
		String text =search(file);
		save(text);
		sc.close();
		
	}
	private String search(File file)
	{
		String text = "";
		String comp =null; 
		
		try (BufferedReader reader = new BufferedReader(new FileReader(file));){
			while(reader.readLine() != null)
			{
				comp = reader.readLine();
				if (comp.contains("test"))
				{
					text += comp;
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(text);
		return text;
		
	}
	private void save(String text)
	{
		try(BufferedWriter bw = new BufferedWriter(new FileWriter
				("C:/Users/borgs_000/workspace/OOPJ15/text/found.txt"))){
			bw.write(text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
