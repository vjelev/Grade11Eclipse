package Auto;

import java.util.Arrays;

public class Car {
String model;
Tire [] tires;

public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public Tire[] getTires() {
	return tires;
}
public void setTires(Tire[] tires) {
	this.tires = tires;
}
public void changeTire(int chooseTire,Tire tire){
	tires[chooseTire]=tire;
}
public Car(String model) {
	this.model = model;
}
@Override
public String toString() {
	return "Car [model=" + model + ", tires=" + Arrays.toString(tires) + "]";
}


}
