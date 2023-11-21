package paket;

public class Rectangle extends Figure {
     protected double a;
     protected double b;

    public Rectangle(double length, double width) {
    	super();
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea(double a,double b) {
        return a * b;
    }
}
