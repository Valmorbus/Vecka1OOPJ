package vecka2lektioner.interfaces;

public class Box implements VolumeHandler {
	private int height, lenght, depth;

	public Box(int height, int lenght, int depth) {
		super();
		this.height = height;
		this.lenght = lenght;
		this.depth = depth;
	}



	@Override
	public float calculateVolume() {
		
		return height*lenght*depth;
	}

}
