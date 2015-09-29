package vecka2.animal;

public class RunAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunAnimal rm = new RunAnimal();
		rm.testAnimal();
	}
	
	private void testAnimal()
	{
		Animal dog = new Dog(34, "bob", "voff", 4, "male");
		Animal human = new Human(36, "Robin", "braaaiiins", 2, "male");
		Animal snake = new Snake(17, "sir Väs", "väs", true);
		
		dog.printall();
		human.printall();
		snake.printall();
		
	}

}
