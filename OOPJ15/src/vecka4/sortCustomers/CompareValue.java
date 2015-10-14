package vecka4.sortCustomers;

import java.util.Comparator;

public class CompareValue implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return ((o1 > o2) ? 1 :(o1 == o2)?0: -1);
	}

}
