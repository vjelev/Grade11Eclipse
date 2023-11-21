package machine;

public class Car extends Machine {

	public Car() {
		super.setMachineType("car");
		// TODO Auto-generated constructor stub
	}
	@Override
	public String Start(){
		return "Car is starting...";
		
	}
	@Override
	public String Stop(){
		return "Car is stopping...";
		
	}
	

}
