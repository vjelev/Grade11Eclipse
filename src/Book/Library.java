package Book;

import java.util.Scanner;

public class Library {
	Book[] arrBooks;
	int booksAmount;
	Scanner inp = new Scanner(System.in);

	public Library(int booksAmount) {
		super();
		this.booksAmount = booksAmount;
		arrBooks = new Book[booksAmount];
		for (int i = 0; i < booksAmount; i++) {
			System.out.print("Enter book info:");
			String[] bookInfo = inp.nextLine().split(" ");
			Book book = new Book(bookInfo[0], Integer.parseInt(bookInfo[1]), Integer.parseInt(bookInfo[2]));
			arrBooks[i] = book;
		}

	}

	public void getMostAuthors() {
		int max = Integer.MIN_VALUE;
		for (Book book : arrBooks) {
			if (book.getAmountOfAuthors() > max)
				max = book.getAmountOfAuthors();
		}
	}

	public Book[] getArrBooks() {
		return arrBooks;
	}

	public void setArrBooks(Book[] arrBooks) {
		this.arrBooks = arrBooks;
	}

	public int getBooksAmount() {
		return booksAmount;
	}

	public void setBooksAmount(int booksAmount) {
		this.booksAmount = booksAmount;
	}

	public void toStringLibrary() {
		for (int i = 0; i < booksAmount; i++) {
			System.out.println(arrBooks[i].toStringBook());
		}

	}

}
