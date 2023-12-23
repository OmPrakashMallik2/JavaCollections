package Interfaces.Set.SortedSet.TreeSet;

import java.util.TreeSet;

public class TreeSetBookExample {
    public static void main(String[] args) {

        TreeSet<Book> book = new TreeSet<>();
        //Creating Books
        Book b1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(233,"Operating System","Galvin","Wiley",6);
        Book b3=new Book(101,"Data Communications","Forouzan","Mc Graw Hill",4);

        book.add(b1);
        book.add(b2);
        book.add(b3);

        for(Book b : book){
            System.out.println(b.id);
            System.out.println(b.title);
            System.out.println(b.author);
            System.out.println(b.publisher);
            System.out.println(b.quantity);
            System.out.println("....................................");
        }
    }
}

class Book implements Comparable<Book>{
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
