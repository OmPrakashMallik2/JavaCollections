package Interfaces.Queue.Deque;

import java.util.ArrayDeque;

class Book {
    int id;
    String name,author,publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
public class ArrayDequeBookExample {
    public static void main(String[] args) {
        ArrayDeque<Book> set=new ArrayDeque<Book>();
        //Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        //Adding Books to Deque
        set.add(b1);
        set.add(b2);
        set.add(b3);
        //Traversing ArrayDeque
        for(Book b:set){
            System.out.println(b.id);
            System.out.println(b.name);
            System.out.println(b.author);
            System.out.println(b.publisher);
            System.out.println(b.quantity);
            System.out.println("................................");
        }
    }
}