package Book;

import java.util.Scanner;

public class Book {
	String title;
	int year;
	int amountOfAuthors;
	String[] authors;
	Scanner inp = new Scanner(System.in);

	public Book(String title, int year, int amountOfAuthors) {
		super();
		if (!title.isEmpty())
			this.title = title;
		else
			throw new IllegalArgumentException("Title must not be empty.");
		if (year > 1900)
			this.year = year;
		else
			throw new IllegalArgumentException("The book must be older than 1900.");
		if (amountOfAuthors >= 1) {
			this.amountOfAuthors = amountOfAuthors;
			authors = new String[amountOfAuthors];
		} else
			throw new IllegalArgumentException("The book must have more than 1 author.");
		for (int i = 0; i < amountOfAuthors; i++) {
			System.out.print("Print authors: ");
			authors[i] = inp.nextLine();
		}
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getAmountOfAuthors() {
		return amountOfAuthors;
	}

	public void setAmountOfAuthors(int amountOfAuthors) {
		this.amountOfAuthors = amountOfAuthors;
	}

	public String[] getAuthors() {
		return authors;
	}

	public void setAuthors(String[] authors) {
		this.authors = authors;
	}

	public String toStringBook() {
	    StringBuilder result = new StringBuilder();
	    result.append(title).append(" ").append(year).append("- Authors: ");
	    for (int i = 0; i < amountOfAuthors; i++) {
	        result.append(authors[i]);
	        if (i < amountOfAuthors - 1) {
	            result.append(", "); // Add a comma between authors
	        }
	    }
	    return result.toString();
	}
}
