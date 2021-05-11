package Day5;

public class ThreeDimentionalShape extends Polygon {
	private int height;

	public ThreeDimentionalShape(int sides, String color, int height) {
		super(sides, color);
		this.height = height;

	}

	public void diasplayHeight() {
		System.out.println(height);
	}

}
