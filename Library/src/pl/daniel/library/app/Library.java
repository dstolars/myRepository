package pl.daniel.library.app;

import pl.daniel.library.data.Book;
import pl.daniel.library.utils.DataReader;

/**
 * @author Daniel Main class o library applictation
 */
public class Library {
	public static void main(String[] args) {

		final String appName = "Biblioteka v0.6";

		Book[] books = new Book[1000];
		DataReader dataReader = new DataReader();

		System.out.println(appName);
		System.out.println("Wprowadz now¹ ksi¹¿kê: ");
		books[0] = dataReader.readAndCreateBook();
		books[1] = dataReader.readAndCreateBook();
		dataReader.close();

		books[0].printInfo();
		books[1].printInfo();

		System.out.println("System mo¿e przechowywaæ do " + books.length + " ksi¹¿ek.");

	}

}
