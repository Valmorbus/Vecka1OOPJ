package vecka4.sortJavaHistory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ReadFileAndSort {

	public static void main(String[] args) {
		
		ReadFileAndSort rfas = new ReadFileAndSort();
		rfas.readFile();
		// TODO Auto-generated method stub

	}

	private void readFile(){
		File file = new File("C:/Users/borgs_000/git/Vecka1OOPJ/OOPJ15/text/text.txt");
		ArrayList<String> list1 = new ArrayList<>();
		String text ="";
		ArrayList<String> list2 = new ArrayList<>();
		int i = 0;
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			while ((text =br.readLine()) != null)
			{
				
				list1.add(text);
				
					
			}
			
			Collections.sort(list1);
			Collections.replaceAll(list1, "", null);
			list1.removeAll(Collections.singleton(null));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Iterator<String> iter = list1.iterator();
		while (iter.hasNext()){
			System.out.println(iter.next());
			
		}
		for (int j = 0; j < list1.size(); j+=5) {
			//if(j%5 == 0){
				String s = list1.get(j);
				list2.add(s);
			//}
		}
		System.out.println("");
		
		Iterator<String> iter2 = list2.iterator();
		while (iter2.hasNext()){
			System.out.println(iter2.next());
		}
	}
}
