package vecka4lektioner.maps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Account {

	public static void main(String[] args) {

		Account a = new Account();
		a.setAccount();
		a.setAccountsorted();
		a.setAccountsorted2();

	}

	private void setAccount() {

		HashMap<String, Float> accountMap = new HashMap<String, Float>();
		accountMap.put("Robin", 5.0f);
		accountMap.put("Owen", 2578900.54f);
		accountMap.put("Simon", -25000f);
		accountMap.put("Anton", 35700.8f);
		accountMap.put("Anton", 35700.8f);

		Set<Entry<String, Float>> accountMapEntry = accountMap.entrySet();
		Iterator<Entry<String, Float>> iter = accountMapEntry.iterator();

		while (iter.hasNext()) {
			Entry<String, Float> person = iter.next();
			System.out.println(person.getKey() + " " + person.getValue());
		}
		System.out.println();
		float money = accountMap.get("Simon");
		accountMap.put("Simon", money + 1000);
		
		
		System.out.println("Simon har : " + accountMap.get("Simon"));
		

	}

	private void setAccountsorted() {

		TreeMap<String, Float> accountMap = new TreeMap<String, Float>(Collections.reverseOrder());
		accountMap.put("Robin", 5.0f);
		accountMap.put("Owen", 2578900.54f);
		accountMap.put("Simon", -25000f);
		accountMap.put("Anton", 35700.8f);
		accountMap.put("Anton", 35770.8f);

		Set<Entry<String, Float>> accountMapEntry = accountMap.entrySet();
		Iterator<Entry<String, Float>> iter = accountMapEntry.iterator();

		while (iter.hasNext()) {
			Entry<String, Float> person = iter.next();
			System.out.println(person.getKey() + " : " + person.getValue());
		}

	}
	private void setAccountsorted2() {

		TreeMap<String, Float> accountMap = new TreeMap<String, Float>(new CompareLength());
		accountMap.put("Robin", 5.0f);
		accountMap.put("Owen", 2578900.54f);
		accountMap.put("Simon", -25000f);
		accountMap.put("Anton", 35700.8f);
		accountMap.put("Anton2", 35770.8f);
		System.out.println("Här");
		Set<Entry<String, Float>> accountMapEntry = accountMap.entrySet();
		Iterator<Entry<String, Float>> iter = accountMapEntry.iterator();

		while (iter.hasNext()) {
			Entry<String, Float> person = iter.next();
			System.out.println(person.getKey() + " : " + person.getValue());
		}

	}
	

}
