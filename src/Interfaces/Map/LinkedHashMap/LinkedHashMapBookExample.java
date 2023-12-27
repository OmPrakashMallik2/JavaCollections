package Interfaces.Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

class Book {
    int id;
    String title, author, publisher;
    int quantity;

    public Book(int id, String title, String author, String publisher, int quantity) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
public class LinkedHashMapBookExample {
    public static void main(String[] args) {
        Book book1 = new Book(1001,"Book1", "Author1","Publisher1", 10);
        Book book3 = new Book(1003,"Book3", "Author3","Publisher3", 10);
        Book book2 = new Book(1002,"Book2", "Author2","Publisher2", 10);
        Book book5 = new Book(1005,"Book5", "Author5","Publisher5", 10);
        Book book4 = new Book(1004,"Book4", "Author4","Publisher4", 10);

        LinkedHashMap<Integer, Book> books = new LinkedHashMap<>();
        books.put(2, book2);
        books.put(1, book1);
        books.put(4, book4);
        books.put(3, book3);
        books.put(5, book5);


        for (Map.Entry<Integer, Book> b : books.entrySet()){
            Book x  = b.getValue();
            System.out.println("Book: "+b.getKey());
            System.out.println("ID: "+x.id);
            System.out.println("Title: "+x.title);
            System.out.println("Author: "+x.author);
            System.out.println("Publisher: "+x.publisher);
            System.out.println("Quantity: "+x.quantity);
            System.out.println(".......................");
        }
    }
}
