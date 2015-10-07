package vecka3lektioner;

public class Statistics <T extends Number>{
	private T[] numbers;

	public Statistics(T[] numbers) {
		super();
		this.numbers = numbers;
	}

	public T[] getNumbers() {
		return numbers;
	}

	public void setNumbers(T[] numbers) {
		this.numbers = numbers;
	}

	public float average(){
		float sum = 0;
		for (T t : numbers) {
			sum+=t.floatValue();
		}
		return sum;
	}
	//använd wildcard när T är bundet
	public boolean sumAverage(Statistics<?> other)
	{
		if (average() ==other.average() )
			return true;
		else
			return false;
	}
}
