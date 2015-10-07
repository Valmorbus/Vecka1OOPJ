package vecka3lektioner;

public class GenericsTest<T> {
	T type;

	public GenericsTest(T type) {
		super();
		this.type = type;
	}

	public T getType() {
		return type;
	}

	public void setType(T type) {
		this.type = type;
	}

	public void showType() {
		System.out.println("datatype of parameter is: " + type.getClass().getSimpleName());
	}

}
