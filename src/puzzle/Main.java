package puzzle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Puzzle domino = new Puzzle(n, "wooden");

        // Add puzzle pieces to the elementsTogether array using a loop
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the type for piece " + (i + 1) + ": ");
            String type = scanner.nextLine();

            System.out.print("Enter the material for piece " + (i + 1) + ": ");
            String material = scanner.nextLine();

            domino.elementsTogether[i] = new ElementOfPuzzle(type, material);
        }
        
        // Modify properties and display updated data
        domino.elementsTogether[1].setMaterial("wood");
        domino.setWrapping("paper");
        domino.displayProperties();

        scanner.close();
	}

}
