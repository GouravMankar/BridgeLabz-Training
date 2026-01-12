package com.bookshelf;

import java.util.HashMap;

public class BookManage {

	Book head;
	HashMap<String, Book> libraryHashMap = new HashMap<>();

	public void add(Book book) {
		Book newBook = new Book(book.author, book.name, book.price, book.genre);

		if (head == null) {
			head = newBook;
			libraryHashMap.put(newBook.genre, newBook);
			return;
		}

		Book temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = newBook;
		libraryHashMap.put(newBook.genre, newBook);
	}

	public boolean borrowBook(Book book) {

		if (head == null) {
			System.out.println("Library is empty");
			return false;
		}

		if (head.name.equals(book.name)) {
			head = head.next;
			System.out.println("You borrowed: " + book.name);
			return true;
		}

		Book temp = head;

		while (temp.next != null) {
			if (temp.next.name.equals(book.name)) {
				System.out.println("You borrowed: " + book.name);
				temp.next = temp.next.next;
				return true;
			}
			temp = temp.next;
		}

		System.out.println("Book not found: " + book.name);
		return false;
	}

	public boolean returnBook(Book book) {

		Book newBook = new Book(book.author, book.name, book.price, book.genre);

		if (head == null) {
			head = newBook;
			return true;
		}

		Book temp = head;
		while (temp.next != null) {
			temp = temp.next; // FIXED
		}

		temp.next = newBook;
		return true;
	}

	public void display() {
		if (head == null) {
			System.out.println("No books in library");
			return;
		}

		Book temp = head;
		while (temp != null) {
			System.out.println(temp);
			temp = temp.next;
		}
	}
}
