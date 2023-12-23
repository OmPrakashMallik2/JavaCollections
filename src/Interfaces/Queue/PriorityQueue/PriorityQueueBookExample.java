package Interfaces.Queue.PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueBookExample {
    public static void main(String[] args) {
        PriorityQueue<Book> books = new PriorityQueue<Book>();

        //Creating Books
        Book b1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(233,"Operating System","Galvin","Wiley",6);
        Book b3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);

        books.add(b1);
        books.add(b2);
        books.add(b3);

        for(Book b : books){
            System.out.println(b.id);
            System.out.println(b.title);
            System.out.println(b.author);
            System.out.println(b.publisher);
            System.out.println(b.quantity);
            System.out.println("................................");
        }

    }
}

class Book implements Comparable<Book> {
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

    @Override
    public int compareTo(Book otherBook) {
        return Integer.compare(this.id, otherBook.id);
    }
}

