package Auto;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
Scanner inp = new Scanner(System.in);
List<Car> cars = new ArrayList<>();
String inputCar = inp.nextLine();
Car car = new Car(inputCar);
while(inputCar!="end"){
cars.add(car);
for(Car car1 :cars){//FILL LIST OF CARS
	if(car1.getTires()!=null)break;
	Tire[]tires = new Tire[4];
	for(int i=0;i<4;i++){
		String[] inputInfo = inp.nextLine().split(" ");
		Tire tire = new Tire(inputInfo[0], Double.parseDouble(inputInfo[1]), Double.parseDouble(inputInfo[1]));
		tires[i]=tire;
	}	
	car.setTires(tires);
}
inputCar = inp.nextLine();
car = new Car(inputCar);
}
System.out.println("Choose car: ");
int chooseCar = Integer.parseInt(inp.nextLine());
System.out.println("Choose tire: ");
int chooseTire = Integer.parseInt(inp.nextLine());
String[] inputNewTire = inp.nextLine().split(" ");
Tire newTire = new Tire(inputNewTire[0], Double.parseDouble(inputNewTire[1]), Double.parseDouble(inputNewTire[1]));
cars.get(chooseCar).changeTire(chooseTire, newTire);

Collections.sort(cars,new sortCars());
for(Car car2:cars){
	Arrays.sort(car2.getTires(),new sortTires());
}
//for(Car car3:cars){
//	System.out.println(car.getModel());
//	for(Tire tire:car3.getTires()){
//		System.out.println(tire.toString());
//	}
//}
System.out.println(car.toString());
	}
/*
	�� �� ������� ����� ����������� ���� ��� �������� ��������: �����, ��������, �������� �� ���������.
	������: ������� �� �����, ������ �� �����, ������� �� ��������, ������ �� ��������, ������� ���������� �� ���������, ������ �� ���������� �� ���������. 
	�� �� ������� ����� ���������� � 4 ���� � ����� �� ����������.
	�� �� ������� ������� �� ����������.
	�� �� ����� ����������� ����(������� �� ������ ����� ��������).
	�� �� ������� ����� �� ����.
	�� �� �������� ������ �� �������� �� ���������, � ��� ����� ���������� �� ����� ��� �������� ���.
	�� �� ������ ������.
	�� �� ������� ����� �� ����������.
	�� �� �������� ������������ �� ����� � ��������� ���.
	�� �� ������� ���������������� �� ����������.
*/
}
