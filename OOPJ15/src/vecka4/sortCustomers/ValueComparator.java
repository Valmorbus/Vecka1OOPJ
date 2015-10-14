package vecka4.sortCustomers;

import java.util.Comparator;
import java.util.Map;

public class ValueComparator implements Comparator<Integer> {

	private Map<Integer, Integer> map;

	public ValueComparator(Map<Integer, Integer> map) {
		this.map = map;
	}

	public int compare(Integer a, Integer b) {
		return map.get(a).compareTo(map.get(b));
	}

}
