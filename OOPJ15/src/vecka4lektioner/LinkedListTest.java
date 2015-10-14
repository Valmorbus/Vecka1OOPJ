package vecka4lektioner;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListTest llt = new LinkedListTest();
		llt.tester();

	}
	private void tester(){
		LinkedList<String> list = new LinkedList<>();
		
		String str = "hej"; 
		String str2 = "hejdå";
		list.add(str);
		list.add(str2);
		list.add("fan");
		
		
		list.addFirst("first");
		list.addLast("last?");
		list.addLast("Last!");
		list.add(null);
		list.add("va");
		list.add(2, "third!");
		
		list.removeLast();
		list.removeFirst();
		list.removeFirstOccurrence("hej");
		list.remove(4);
		
		System.out.println(list);
	}

}
