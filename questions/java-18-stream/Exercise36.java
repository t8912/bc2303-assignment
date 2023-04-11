import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Exercise: Deal with common data structures, using stream flatmap() to restructure the data
 */
/**
 * Expected Output: 
Writer: Susan
Writer: Tracy
Book Name: Book A, Book Price: 34.9
Book Name: Book B, Book Price: 78.9
Book Name: Book C, Book Price: 104.9
Book Name: Book D, Book Price: 449.9
The Most Expensive Book: Name=Book D, Price=449.9
 */
// Implement Book class
// Code here ...
///
class Book {
    private double price;
    private String name;
    
    public Book(double price, String name) {
        this.price = price;
        this.name = name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String getName() {
        return name;
    }
}


// Implement Wrtier Class
// Code here ...
///
class Writer {
    private String name;
    private List<Book> books;
    
    public Writer(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }
    
    public String getName() {
        return name;
    }
    
    public List<Book> getBooks() {
        return books;
    }
}


// Implement a Comparator to compare the book price
// Code here ...

class Exercise36 {
    public static void main(String[] args) {
        // Create Books1 and Writer1
        List<Book> books = Arrays.asList(new Book(34.9, "Book A"), new Book(78.9, "Book B"));
        Writer w1 = new Writer("Susan", books);

        // Create Books2 and Writer2
        books = Arrays.asList(new Book(104.9, "Book C"), new Book(449.9, "Book D"));
        Writer w2 = new Writer("Tracy", books);

        List<Writer> writers = Arrays.asList(w1, w2);
        // Print all Writers names
        // Code here ...
        writers.stream().map(Writer::getName).forEach(System.out::println); ///

        // Use flatMap method to return all books written by our writers, storing in a List<Book>
        // Just return the Books!
        // Code here ...
        List<Book> books2 = writers.stream().flatMap(writer -> writer.getBooks().stream()).collect(Collectors.toList()); ///

        // Print out all books' Name and Price.
        // Code here
        books2.stream().forEach(book -> System.out.println("Book Name: " + book.getName() + ", Book Price: " + book.getPrice())); ///

        // Create Comparator for stream max() method use, aims to find the most expensive book
        // Book maxPriceBook = ...
        Book maxPriceBook = books2.stream().max(Comparator.comparing(Book::getPrice)).get(); ///
                
        // Print out the most expensive book
        System.out.println("Name:" + maxPriceBook.getName() + ", Price:" + maxPriceBook.getPrice());
    }
}
