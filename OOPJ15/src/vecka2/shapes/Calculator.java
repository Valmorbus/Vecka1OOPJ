package vecka2.shapes;

public class Calculator{

	//fulhack med uträkningarna
	public static void main(String[] args)
	{
		int x = 1;
		Shape circleShape = new Circle(x*1.0f);
		Shape smallCircleShape = new Circle(x*0.5f);
		Shape rectangleShape = new Rectangle(x*3.0f, x*1.0f);
		System.out.println((circleShape.calculateArea()/2)+rectangleShape.calculateArea()+(smallCircleShape.calculateArea()));
		
		System.out.println((circleShape.calculateCircumference()/2)+rectangleShape.calculateCircumference()/2+(smallCircleShape.calculateCircumference()));
		
		
	}

}
