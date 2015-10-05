package vecka2.linkedlist;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class TestLinkedList {

	public static void main(String[] args) throws IOException {

		LinkedList<String> test = new LinkedList<String>();

		test = readFile();

		System.out.println(test.getSize());
		System.out.println(test.tostring());
		test.add("hej");
		System.out.println(test.getSize());
		for (String s : test)
		{
			System.out.println("foreach");
			System.out.println(s);
		}

	}

	public static LinkedList<String> readFile()
	{
			File file = new File("C:/Users/borgs_000/git/Vecka1OOPJ/OOPJ15/src/vecka2/linkedlist/test.txt");
			String str ="";
			LinkedList<String> test = new LinkedList<String>();
			
		    try (BufferedReader br = new BufferedReader(new FileReader(file))){
		        while((str =br.readLine()) !=null) {        
		            //str =br.readLine();
		            test.add(str);
		        }
		       
		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    return test;
	}

}
