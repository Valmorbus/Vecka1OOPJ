package vecka2;

public class Calculator{
	
	//Check where math error is 
	
	public static void main(String[] args)
	{
		int x = 1;
		Shape circleShape = new Circle(x*1.0f);
		Shape smallCircleShape = new Circle(x*0.5f);
		Shape rectangleShape = new Rectangle(x*3.0f, x*1.0f);
		System.out.println((circleShape.calculateArea()/2)+rectangleShape.calculateArea()+(smallCircleShape.calculateArea()*2));
		
		System.out.println((circleShape.calculateCircumference()/2)+rectangleShape.calculateCircumference()+(smallCircleShape.calculateCircumference()*2));
		
		
	}

}
