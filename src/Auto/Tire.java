package Auto;

public class Tire {
	private String model;
	double diameter;
	double height;

	public Tire(String model, double diameter, double height) {
		super();
		this.model = model;
		this.diameter = diameter;
		this.height = height;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Tire [model=" + model + ", diameter=" + diameter + ", height=" + height + "]";
	}

}
