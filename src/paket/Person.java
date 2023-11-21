package paket;

import java.util.Scanner;

public class Person {
	protected String name;
	protected String address;

	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toStringPerson() {
		return "[name= "+name+", address= "+address;
	}

}
