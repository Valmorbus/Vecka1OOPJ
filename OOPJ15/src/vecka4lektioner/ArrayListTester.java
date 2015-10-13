package vecka4lektioner;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListTester at = new ArrayListTester();
		at.test();

	}
	
	private void test(){
		ArrayList<VolumeHandler>list = new ArrayList<VolumeHandler>();
		System.out.println(list.size());
		list.ensureCapacity(15); // sätter en minimumstorlek från start allokerar
		
		System.out.println(list.size());
		list.add(new Sphere(7, "moist"));
		Sphere sphere1 = new Sphere(67, "wet");
		list.add(sphere1);
		System.out.println(list.size());
		System.out.println(list.get(0).getClass().getName());
		System.out.println(list.get(0).toString());
		list.add(new Sphere(9, "moist"));
		list.add(new Sphere(87, "moist"));
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.remove(sphere1);
		System.out.println(list);
		list.trimToSize(); // drar ner till gällande storlek
		
		list.add(new Sphere(9, "moist"));
		list.add(new Sphere(87, "moist"));
		list.add(new Sphere(9, "moist"));
		list.add(new Sphere(87, "moist"));
		
		Iterator<VolumeHandler> iter =list.iterator();
		while(iter.hasNext())
			System.out.println(iter.next().calculateVolume());
		
	}
}
