package machine;

public class MachineOperator {
	private Machine entity;

	public MachineOperator(Machine entity) {
		this.entity = entity;
	}

	public Machine getEntity() {
		return entity;
	}

	public void setEntity(Machine entity) {
		this.entity = entity;
	}

	public String Start() {
		return entity.Start();
	}

	public String Stop() {
		return entity.Stop();
	}

public String toString(){
	return entity.getMachineType()+"\n"+Start()+"\n"+Stop();
}

}
