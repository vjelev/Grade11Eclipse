package paket;

public class Triangle extends Figure {
	protected double a;
	protected double b;

	
	Triangle(double a, double b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public double calculateArea(double a,double b) {
		return 0.5 * a * b;
	}
}
