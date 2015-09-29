package vecka2.backstring;

public class BackString implements CharSequence {
	private String str;
	char[] cha = null;

	public BackString(String str) {
		super();
		this.str = str;
		String s = reverse(str);
		
		this.str = s;
	}
	
	public String getStr() {
		return str;
	}


	public void setStr(String str) {
		this.str = str;
	}



	@Override
	public char charAt(int arg) {
		char[] c = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (arg == i)
				return c[i];
		}
		return 0;
	}

	@Override
	public int length() {
		char[] c = null;
		for (int i = 0; i < str.length(); i++) {
			c[i] = charAt(i);
		}
		
		int counter = 0;
		for (char charset : c)
			counter++;
		return counter;
	}

	@Override
	public CharSequence subSequence(int arg0, int arg1) {
		char[] c = str.toCharArray();
		//char[] temp = null;
		//CharSequence charsec;
		String tempString =  "";
		
			for (int i = 0; i < c.length; i++) {
				if (i == arg0)
					for (int j = 0; j < arg1-arg0-1; j++) {
						//temp[j] = c[i];	
						tempString +=c[i];
					}
			}						
		return tempString;
	}
	private String reverse(String stri)
	{
		//CharSequence revString = subSequence(0, length());
	
		char[] temp = new char[stri.length()];
		for (int i = 0; i < stri.length(); i++) {
			temp[i] = stri.charAt(i); 
		}
			
		for (int i = 0; i < length(); i++) {
			for (int j = length(); j > 0; j--) {
				cha[i] = temp[j];
			}
		}
		
		
		return stri;
	}
	
	
	@Override
	public String toString()
	{
		String string ="";
		for (int i = 0; i < str.length(); i++) {
			string += cha[i];
		}	
		return string;	
	}
	
	public static void main(String[] args) {
		BackString b = new BackString("detta ar ett test");
		String test = b.toString();
		System.out.println(test);

	}
}
