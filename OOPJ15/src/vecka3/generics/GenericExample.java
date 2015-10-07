package vecka3.generics;

public class GenericExample {
	String s = "t";

	public static void main(String[] arguments)

	{
		ValueStore<String> myStore1 = new ValueStore<String>();

		myStore1.set("Test");

		String test = myStore1.get();

		ValueStore<ValueStore<String>> myStore2 = new ValueStore<ValueStore<String>>();

		myStore2.set(myStore1);

		myStore1 = myStore2.get();
		System.out.println(test);
		System.out.println(myStore2.get().getClass().getSimpleName());
	}

}
