package vecka4.animal;

import java.util.ArrayList;

public class Farm <T extends Reptile>{
	
	T[] farmlist;
	ArrayList <T> lista = new ArrayList<T>();

	
	public Farm(T[] farm) {
		super();
		this.farmlist = farm;
	}
	
	public void createReptilesInFarm(Farm<?> farm)
	{
		Snake snake = new Snake(5, "sirväs", "vääs", true);
		Lizard snake2 = new Lizard(5.0f, "sirväs", "vääs", true);
		ArrayList<Reptile> replist = new ArrayList<Reptile>();
		replist.add(snake);
		replist.add(snake2);
		
		replist.toArray(farmlist);
	
		
		
	}	
	public void ToString(){
		
		for (int i = 0; i < farmlist.length; i++) {
			System.out.println(farmlist[i]);
		}
	}
			
	
	
	
}
