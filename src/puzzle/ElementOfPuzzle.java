package puzzle;

public class ElementOfPuzzle {
	String type;
	String material;

	public ElementOfPuzzle(String type, String material) {
		setType(type);
		setMaterial(material);
	}

	public String getType() {
		return type;
	}

public void setType(String type) {
	if(type.equals("left part")||type.equals("right part")
			||type.equals("center part")||type.equals("upper part")
			||type.equals("lower part"))this.type = type;
	else throw new IllegalArgumentException("Insert a valid part");
}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		if(material.equals("wood")||material.equals("plastic"))this.material = material;
		else throw new IllegalArgumentException("Insert a valid material");
	}
	public String toString(){
		 return "Вид: " + this.type + ", Материал: " + this.material;
	}

}
