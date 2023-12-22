package Interfaces.List.ArrayList;

import java.util.ArrayList;

public class ArrayListExampleBook {
    public static void main(String[] args) {
        ArrayList<Book> book = new ArrayList<>();
        Book b1 = new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2 = new Book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);
        Book b3 = new Book(103,"Operating System","Galvin","Wiley",6);

        book.add(b1);
        book.add(b2);
        book.add(b3);

        for(Book obj : book){
            System.out.println("Id : "+obj.id);
            System.out.println("Title : "+obj.name);
            System.out.println("Author : "+obj.author);
            System.out.println("Publisher : "+obj.publisher);
            System.out.println("Quantity : "+obj.publisher);
            System.out.println("...................................");
        }
    }

}

class Book {
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
