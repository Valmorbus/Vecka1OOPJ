package vecka4.phonebook;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class PhoneBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		PhoneBook pb = new PhoneBook();
		System.out.println("Skriv in namnet på den du söker: ");
		pb.register(sc.nextLine());

	}
	private void register(String s)
	{
		TreeMap<String, Person> registry = new TreeMap<>(Collections.reverseOrder()); 
		Person person1 = new Person("Simon", "none", "Male", 1985, "0705566544");
		Person person2 = new Person("Robin", "Slottet", "Male", 1988, "0705765544");
		
		
		registry.put(person1.getName(), person1);
		registry.put(person2.getName(), person2);
		
		Set<Entry<String, Person>>checkRegistry = registry.entrySet();
		Iterator<Entry<String, Person>> regIter = checkRegistry.iterator();
		Iterator<Entry<String, Person>> regIter2 = checkRegistry.iterator();
		
		while (regIter2.hasNext()){
			Entry<String, Person> person = regIter2.next();
			String number = person.getValue().getPhoneNumber();
			number = "091"+number.substring(3);
			person.getValue().setPhoneNumber(number);
		}
		
		if (s.equals("all")){
			while (regIter.hasNext()){
				Entry<String, Person> person = regIter.next();
				System.out.println(person.getKey() + " "); 
				person.getValue().printAll();
			}
		}	
		else
			registry.get(s).printAll();
	}

}
