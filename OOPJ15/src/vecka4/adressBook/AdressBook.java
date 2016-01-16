package vecka4.adressBook;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class AdressBook {
	File file = new File("Adressbook.txt");
	TreeMap<String, Person> adressMap = new TreeMap<>();

	public static void main(String[] args) {
		AdressBook ab = new AdressBook();
		ab.menu();

	}

	private void menu() {
		boolean inValid = true;
		while (true) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			int choice = 0;
			System.out.println();
			System.out.println("Welcome to the Adressbook");
			System.out.println("1) Load from file");
			System.out.println("2) Save to file");
			System.out.println("3) Add an entry");
			System.out.println("4) Remove an entry");
			System.out.println("5) Edit an existing entry");
			System.out.println("6) Sort the adressbook");
			System.out.println("7) Search a specific entry");
			System.out.println("8) Exit");
			System.out.println();
			do {
				if (sc.hasNextInt()) {
					choice = sc.nextInt();
					inValid = false;
				} else {
					sc.next();
				}
			} while (inValid);
			switch (choice) {
			case 1:
				load();
				break;
			case 2:
				save();
				break;
			case 3:
				addEntry();
				break;
			case 4:
				removeEntry();
				break;
			case 5:
				editEntry();
				break;
			case 6:
				sortAdressBook();
				break;
			case 7:
				searchEntry();
				break;
			case 8:
				System.exit(0);
			case 9:
				printAllAdresses();
				break;
			default:
				System.out.println("Invalid input");
				menu();
			}
		}
	}

	private void save() {

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			Set<Entry<String, Person>> checkRegistry = adressMap.entrySet();
			Iterator<Entry<String, Person>> regIter = checkRegistry.iterator();

			while (regIter.hasNext()) {
				Entry<String, Person> person = regIter.next();
				bw.write(person.getValue().getAll());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return;
	}

	private void load() {
		adressMap = new TreeMap<>();
		String firstname = "";

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			while ((firstname = br.readLine()) != null) {
				Person person = new Person("", "", "", "", "");
				person.setFirstName(firstname);
				person.setLastName(br.readLine());
				person.setAdress(br.readLine());
				person.setPhonenumber(br.readLine());
				person.setEmail(br.readLine());
				adressMap.put(person.getLastName(), person);

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return;
	}

	private void addEntry() {
		Person person = new Person("", "", "", "", "");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name: ");
		person.setFirstName(sc.nextLine());
		System.out.println("Enter Last name: ");
		person.setLastName(sc.nextLine());
		System.out.println("Enter adress: ");
		person.setAdress(sc.nextLine());
		System.out.println("Enter phonenumber: ");
		person.setPhonenumber(sc.nextLine());
		System.out.println("Enter email: ");
		person.setEmail(sc.nextLine());
		adressMap.put(person.getFirstName(), person);
		return;
	}

	private void searchEntry() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter searchword: ");
		String search = sc.nextLine();
		Set<Entry<String, Person>> checkRegistry = adressMap.entrySet();
		Iterator<Entry<String, Person>> regIter = checkRegistry.iterator();
		while (regIter.hasNext()) {
			Entry<String, Person> person = regIter.next();
			if (person.getValue().getAllsequence().toLowerCase().contains(search.toLowerCase())) {
				person.getValue().printAll();
				return;

			}

		}
		System.out.println("Could not be found");
		return;

	}

	private boolean printEntry(String search) {
		Set<Entry<String, Person>> checkRegistry = adressMap.entrySet();
		Iterator<Entry<String, Person>> regIter = checkRegistry.iterator();
		while (regIter.hasNext()) {
			Entry<String, Person> person = regIter.next();
			if (person.getValue().getAllsequence().toLowerCase().contains(search.toLowerCase())) {
				person.getValue().printAll();
				return true;
			}
		}
		System.out.println("Could not be found");
		return false;

	}

	private void removeEntry() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter searchword: ");
		String search = sc.nextLine();
		if (printEntry(search)) {
			Set<Entry<String, Person>> checkRegistry = adressMap.entrySet();
			Iterator<Entry<String, Person>> regIter = checkRegistry.iterator();
			while (regIter.hasNext()) {
				Entry<String, Person> person = regIter.next();
				if (person.getValue().getAllsequence().toLowerCase().contains(search.toLowerCase())) {
					String toRemove = person.getValue().getLastName();
					adressMap.remove(toRemove);
					return;
				}
			}
		}
		return;
	}

	private void editEntry() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter searchword: ");
		String search = sc.nextLine();
		if (printEntry(search)) {
			Set<Entry<String, Person>> checkRegistry = adressMap.entrySet();
			Iterator<Entry<String, Person>> regIter = checkRegistry.iterator();
			while (regIter.hasNext()) {
				Entry<String, Person> person = regIter.next();
				if (person.getValue().getAllsequence().toLowerCase().contains(search.toLowerCase())) {
					System.out.println("Edit first name: ");
					adressMap.get(person.getKey()).setFirstName(sc.nextLine());
					System.out.println("Edit last name: ");
					adressMap.get(person.getKey()).setLastName(sc.nextLine());
					System.out.println("Edit adress: ");
					adressMap.get(person.getKey()).setAdress(sc.nextLine());
					System.out.println("Edit phone number: ");
					adressMap.get(person.getKey()).setPhonenumber(sc.nextLine());
					System.out.println("Edit email: ");
					adressMap.get(person.getKey()).setEmail(sc.nextLine());
					return;
				}
			}
		}
		// System.out.println("Person could not be found");
		return;
	}

	private void printAllAdresses() {
		Set<Entry<String, Person>> checkRegistry = adressMap.entrySet();
		Iterator<Entry<String, Person>> regIter = checkRegistry.iterator();
		while (regIter.hasNext()) {
			Entry<String, Person> person = regIter.next();
			System.out.println(person.getKey() + " ");
			person.getValue().printAll();
		}
	}

	private void sortAdressBook() {
		System.out.println("Vad vill du sortera efter? ");
		boolean inValid = true;
		TreeMap<String, Person> tempMap = new TreeMap<>();
		tempMap.putAll(adressMap);
		while (true) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			int choice = 0;
			System.out.println();
			System.out.println("Welcome to the Adressbook");
			System.out.println("1) Sort by first name");
			System.out.println("2) Sort by Last name");
			System.out.println("3) Sort by adress");
			System.out.println("4) Sort by phone number");
			System.out.println("5) Sort by email");
			System.out.println();
			do {
				if (sc.hasNextInt()) {
					choice = sc.nextInt();
					inValid = false;
				} else {
					sc.next();
				}
			} while (inValid);

			switch (choice) {
			case 1: {
				adressMap = new TreeMap<>(new SortByFirstName(adressMap));
				adressMap.putAll(tempMap);
			}
				return;
			case 2: {
				adressMap = new TreeMap<>(new SortByLastName(adressMap));
				adressMap.putAll(tempMap);
			}
				return;
			case 3:
				adressMap = new TreeMap<>(new SortByAdress(adressMap));
				adressMap.putAll(tempMap);
				return;
			case 4:
				adressMap = new TreeMap<>(new SortByPhoneNumber(adressMap));
				adressMap.putAll(tempMap);
				return;
			case 5:
				adressMap = new TreeMap<>(new SortByEmail(adressMap));
				adressMap.putAll(tempMap);
				return;
			default:
				System.out.println("No sorting selected");
				return;
			}

		}

	}

}
