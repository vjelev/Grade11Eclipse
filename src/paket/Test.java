package paket;

import java.util.Scanner;



public class Test {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		String name = inp.nextLine();
		String address = inp.nextLine();
		String program = inp.nextLine();
		int year = Integer.parseInt(inp.nextLine());
		double fee = Double.parseDouble(inp.nextLine());
		String school = inp.nextLine();
		double pay = Double.parseDouble(inp.nextLine());
Person person = new Person(name,address);
Student student = new Student(name,address,program,year,fee);
Staff staff = new Staff(name,address,school,pay);
System.out.println("Person" + person.toStringPerson());
System.out.println("Student "+student.toStringStudent());
System.out.println("Staff "+staff.toStringStaff());
	}

}
