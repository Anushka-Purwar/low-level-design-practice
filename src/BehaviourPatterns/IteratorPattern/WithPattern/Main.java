package BehaviourPatterns.IteratorPattern.WithPattern;


import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookCollections bookCollections = new BookCollections();

        bookCollections.addBook(new Book("Java"));
        bookCollections.addBook(new Book("C++"));

        Iterator<Book> it = bookCollections.iterator();
        while(it.hasNext()){
            Book book = it.next();
            System.out.println("Title of book is " + book.getTitle());
        }
    }
}
