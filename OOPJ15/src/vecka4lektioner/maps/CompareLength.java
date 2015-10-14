package vecka4lektioner.maps;

import java.util.Comparator;

public class CompareLength implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return (o1.length() > o2.length()) ? 1 :(o1.length() == o2.length())?0: -1;
	}

}
