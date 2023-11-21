package puzzle;

public class Puzzle {
int n;
String wrapping;
ElementOfPuzzle[]elementsTogether;

public String getMaterial() {
	return wrapping;
}

public void setWrapping(String wrapping) {
	if(wrapping.equals("wooden")||wrapping.equals("paper"))this.wrapping = wrapping;
	else throw new IllegalArgumentException("Insert a valid wrapping");
}

public Puzzle(int n, String wrapping) {
	super();
	setN(n);
	setWrapping(wrapping);
	elementsTogether = new ElementOfPuzzle[n];
}

public int getN() {
	return n;
}

public void setN(int n) {
	this.n = n;
}

public int getMiddleElements() {
	int count = 0;
    for (ElementOfPuzzle piece : elementsTogether) {
        if (piece != null && piece.getType().equals("center part")) {
            count++;
        }
        
    }
    return count;
}

// Извеждане на свойствата на обекта
public void displayProperties() {
    System.out.println("Вид на опаковката: " + this.wrapping);
    System.out.println("Брой на елементите с вид 'center' част: " + getMiddleElements());
}

}
