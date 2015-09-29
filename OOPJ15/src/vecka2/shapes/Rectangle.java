package vecka2.shapes;

public class Rectangle implements Shape {
	float height, width;

	public Rectangle(float height, float width) {
		super();
		this.height = height;
		this.width = width;
	}

	@Override
	public float calculateArea() {
		// TODO Auto-generated method stub
		return height*width;
	}

	@Override
	public float calculateCircumference() {
		// TODO Auto-generated method stub
		return 2*height+2*width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
}
