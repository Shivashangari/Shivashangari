package Task_28ArrayList;

public class Book {
	int id;
	int quantity;
	String name;
	String author;
	String publisher;
	public Book(int id, int quantity, String name, String author, String publisher) {
		this.id = id;
		this.quantity = quantity;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
	}
	
	
	
/* Create a class named Book, in which create two integer variables named id and quantity, create three String variables named name, author, and publisher.
* Create a parameterized constructor for the Book class to pass the values into the variables.
* Create a class named OrderProcessor, in which create three methods,
      1. getOrderFromTheCustomer
             * Create an integer variable named bookCount and get the value from the user.
             * Create an ArrayList named "bookList" of type "Book".
             * Based on the bookCount, you have to decide the number of Book Objects to be created using the  
                getBookDataFromTheCustomerMethod.
             * This method should return the "bookList".
      2. getBookDataFromTheCustomer
             * Create two integer variables named id and quantity, create three String variables named name, author, and publisher.
             * Get the values from the user and store them in the variables.
             * Create the Book object bypassing these variable values.
             * This method should return the Book object.
      3. printOrderDetails
             * This method should receive the bookList as a parameter.
             * Print all the ordered book details in the console, one after another.
* Create a class named BookStoreRunner, in which create the main method and perform the book ordering process.*/
}
