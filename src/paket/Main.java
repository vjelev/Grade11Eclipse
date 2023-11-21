package paket;

public class Main {
	 public static void main(String[] args) {
	        Figure triangle = new Triangle(4,5);
	        Figure rectangle = new Rectangle(4,5);
	        

	        // Calculate and print areas
	        System.out.println("Triangle Area: " + triangle.calculateArea(4,5));
	        System.out.println("Rectangle Area: " + rectangle.calculateArea(3,4));
	    }
}