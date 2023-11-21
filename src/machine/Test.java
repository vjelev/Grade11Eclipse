package machine;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		Lorry lorry=new Lorry();
		 MachineOperator mo = new MachineOperator(lorry);
		
		 mo.setEntity(lorry) ;
		 System.out.print(mo.toString());

	}

}
