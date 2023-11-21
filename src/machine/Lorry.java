package machine;

public class Lorry extends Machine{
	public Lorry() {
		super.setMachineType("lorry");
		// TODO Auto-generated constructor stub
	}
	@Override
	public String Start(){
		return "Lorry is starting...";
		
	}
	@Override
	public String Stop(){
		return "Lorry is stopping...";
		
	}
}
