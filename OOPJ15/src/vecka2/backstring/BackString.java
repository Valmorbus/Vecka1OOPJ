package vecka2.backstring;

public class BackString implements CharSequence {
	private String str;

	public BackString(String str) {
		this.str = str;
		String reverse = toString();
		// System.out.println(this.str);
	}

	public static void main(String[] args) {
		BackString b = new BackString("detta ar ett test");
		String test = b.toString();
		System.out.println(test);

	}

	@Override
	public char charAt(int index) {
		char c = 0;
		for (int i = 0; i < str.length(); i++) {
			if (i == index)
				c = str.charAt(index);
		}

		return c;
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		int temp = str.length() - 1;
		return temp;
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		String temp = "";
		for (int i = 0; i < length(); i++) {
			if (i >= start && i < end)
				temp += charAt(i);
		}
		return temp;
	}

	@Override
	public String toString() {
		String temp = "";
		for (int j = length(); j >= 0; j--) {
			temp += charAt(j);

		}
		return temp;

	}
}
