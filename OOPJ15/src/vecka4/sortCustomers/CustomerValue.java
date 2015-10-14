package vecka4.sortCustomers;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class CustomerValue {
	final int PRICE = 23;
	final int SUBSCRIPTIONCOST = 450;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerValue cv = new CustomerValue();
		cv.checkValue();

	}

	private void checkValue() {
		SpecialSubscriber ss1 = new SpecialSubscriber("sven1", "Nan", 12, 1, 1);
		SpecialSubscriber ss2 = new SpecialSubscriber("sven2", "Nan", 10, 2, 2);
		SpecialSubscriber ss3 = new SpecialSubscriber("sven2", "Nan", 6, 7, 3);
		Subscriber s1 = new Subscriber("olof", "nan", 12, 5, 4);
		Buyer b1 = new Buyer("Bengt", "null", 38, 5);

		TreeMap<Integer, Integer> valueMap = new TreeMap<>();
		valueMap.put(ss1.getCustomerNumber(), ss1.calculateValue(PRICE, SUBSCRIPTIONCOST));
		valueMap.put(ss2.getCustomerNumber(), ss2.calculateValue(PRICE, SUBSCRIPTIONCOST));
		valueMap.put(ss3.getCustomerNumber(), ss3.calculateValue(PRICE, SUBSCRIPTIONCOST));
		valueMap.put(s1.getCustomerNumber(), s1.calculateValue(PRICE, SUBSCRIPTIONCOST));
		valueMap.put(b1.getCustomerNumber(), b1.calculateValue(PRICE));
		
		
		TreeMap<Integer, Integer> sortedMap = new TreeMap<>(new ValueComparator(valueMap).reversed());
		sortedMap.putAll(valueMap);
		
		Set<Entry<Integer, Integer>> entrySet = valueMap.entrySet();
		Iterator<Entry<Integer, Integer>> iter = entrySet.iterator();
		while (iter.hasNext()) {
			Entry<Integer, Integer> entr = iter.next();
			System.out.println(entr.getKey() + ":" + entr.getValue());
		}
		System.out.println("--------------------");
		Set<Entry<Integer, Integer>> entrySet2 = sortedMap.entrySet();
		Iterator<Entry<Integer, Integer>> iter2 = entrySet2.iterator();
		while (iter2.hasNext()) {
			Entry<Integer, Integer> entr = iter2.next();
			System.out.println(entr.getKey() + ":" + entr.getValue());
		}

		// TreeMap<Integer, Customer> sorted = sortByValue

	}

	

}
