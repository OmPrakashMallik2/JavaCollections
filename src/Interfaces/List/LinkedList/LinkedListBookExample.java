package Interfaces.List.LinkedList;

import java.util.LinkedList;

public class LinkedListBookExample {
    public static void main(String[] args) {
        LinkedList<Book> book = new LinkedList<>();
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);

        book.add(b1);
        book.add(b2);
        book.add(b3);

        for(Book obj : book){
            System.out.println(obj.id);
            System.out.println(obj.title);
            System.out.println(obj.author);
            System.out.println(obj.publisher);
            System.out.println(obj.quantity);
            System.out.println("................................");
        }
    }

}
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
