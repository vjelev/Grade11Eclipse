	package machine;

public abstract class Machine {
protected String machineType;

public String getMachineType() {
	return machineType;
}
public void setMachineType(String machineType) {
	this.machineType = machineType;
}
public abstract String Start();
public abstract String Stop();

}
