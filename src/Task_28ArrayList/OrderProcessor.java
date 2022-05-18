package Task_28ArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class OrderProcessor {
	Scanner scan = new Scanner(System.in);
	ArrayList<Book> getOrderFromTheCustomer() {
//Creating Variable Name bookcount
		int bookCount;
		System.out.println("Enter the count");
		bookCount = scan.nextInt();
//creating arraylist named booklist of type book
		ArrayList<Book> bookList = new ArrayList<Book>();
		Book object[] = new Book[bookCount];
		// To get the book count
		for (int index = 0; index < bookCount; index++) {
//to store the count in the obj
			object[index] = getBookDataTheCustomer(bookCount);

			bookList.add(object[index]);

		}

		return bookList;
	}

	Book getBookDataTheCustomer(int bookCount) {
//creating to integer variable and three string get input from the user
		int id, quantity;
		String name, author, publisher;

		System.out.println("Enter the id");
		id = scan.nextInt();
		System.out.println("Enter the quantity");
		quantity = scan.nextInt();
		System.out.println("Enter the name");
		name = scan.next();
		System.out.println("Enter the author");
		author = scan.next();
		System.out.println("Enter the publisher");
		publisher = scan.next();

		Book object = new Book(id, quantity, name, author, publisher);

		return object;

	}

//to get the book list from the above method
	void printOrderDetails(ArrayList<Book> bookList) {

		ArrayList<Book> temporary = new ArrayList<Book>(bookList);
		for (Book book : temporary) {
			System.out.println(
					book.id + " " + book.quantity + " " + book.name + " " + book.author + " " + book.publisher + " ");
		}
	}
}