package vecka4.animal;

import java.util.ArrayList;

public class Human extends Mamal {

	public Human(float bodyTemp, String name, String sound, int legs, String gender) {
		super(bodyTemp, name, sound, legs, gender);
		// TODO Auto-generated constructor stub
	}
	
	public void createFarm()
	{
		System.out.println("creating farm");
		Reptile[] arr = new Reptile[5];
		
		Farm<?> farmen = new Farm<Reptile>(arr);
		farmen.createReptilesInFarm(farmen);
		farmen.ToString();
	}

}
