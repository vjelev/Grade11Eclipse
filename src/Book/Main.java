package Book;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int booksAmount = Integer.parseInt(inp.nextLine());
		
		Library books = new Library(booksAmount);
		books.toStringLibrary();

	}

}
