package Lab7_2;

public class EquilateralTriangle implements Polygon {
	private double side;
	public EquilateralTriangle(double side) {
		this.side = side;
	}
	
	public void setSide(double side) {
		this.side = side;
	}
	public double getSide() {
		return side;
	}
	
	@Override
	public double[] getSides() {
		return new double[] {side, side , side};
	}

}
