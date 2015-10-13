package vecka4lektioner;

public class Sphere implements VolumeHandler {
	private float radie;
	public String getTexture() {
		return texture;
	}

	public void setTexture(String texture) {
		this.texture = texture;
	}

	String texture;

	public Sphere(float radie, String texture) {
		super();
		this.radie = radie;
		this.texture = texture;
	}

	@Override
	public float calculateVolume() {
		// TODO Auto-generated method stub
		return (float) ((Math.PI*Math.pow(radie, 3)*4)/3);
	}

	public float getRadie() {
		return radie;
	}

	public void setRadie(float radie) {
		this.radie = radie;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "sphere " +radie;
	}
	

}
