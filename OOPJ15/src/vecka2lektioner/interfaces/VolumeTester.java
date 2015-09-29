package vecka2lektioner.interfaces;

public class VolumeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VolumeTester vt = new VolumeTester();
		vt.calculateTheMethods();

	}
	private void calculateTheMethods(){
		VolumeHandler vh = new Box(10, 10, 10);
		System.out.println(vh.calculateVolume());
		VolumeHandler sphereVh = new Sphere(10f, "hal");
		System.out.println(sphereVh.calculateVolume());
		
		((Sphere)sphereVh).setRadie(2.1f);
		Sphere sphere2 = new Sphere(1.2f,"");
		sphere2.setTexture("");
	}

}
