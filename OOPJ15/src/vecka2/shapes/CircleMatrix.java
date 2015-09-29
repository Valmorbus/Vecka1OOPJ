package vecka2.shapes;

public class CircleMatrix {
	int x = 1;

	public static void main(String[] args) {
		CircleMatrix cm = new CircleMatrix();
		cm.matrixTester();
	}

	private void matrixTester() {
		Shape[][] matrix = new Circle[10][10];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = new Circle(i + j);
			}

		}
		float area = 0;
		float circumfence = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				area += matrix[i][j].calculateArea();
				circumfence += matrix[i][j].calculateCircumference();
			}
		}
		System.out.println(area + " " + circumfence);
	}

}
