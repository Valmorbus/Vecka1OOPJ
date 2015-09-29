package vecka2;

public class Circle implements Shape{
	float radie; 

	public Circle(float f) {
		super();
		this.radie = f;
	}

	@Override
	public float calculateArea() {
		// TODO Auto-generated method stub
		return (float) (Math.PI*Math.pow(radie, 2));
	}

	@Override
	public float calculateCircumference() {
		// TODO Auto-generated method stub
		return (float) (2*Math.PI*radie);
	}

	public float getRadie() {
		return radie;
	}

	public void setRadie(int radie) {
		this.radie = radie;
	}
	
}
