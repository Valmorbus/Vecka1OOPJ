package vecka3.generics;

public class ValueStore <T>{
	T type;

	public ValueStore() {
		super();
		this.type = null;
	}

	public T get() {
		return type;
	}

	public void set(T type) {
		this.type = type;
	}
	
}
