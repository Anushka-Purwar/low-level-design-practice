package BehaviourPatterns.IteratorPattern.Without;

public class Main {
    public static void main(String[] args) {
        BookCollections bookCollections = new BookCollections();

        bookCollections.addBook(new Book("Java"));
        bookCollections.addBook(new Book("C++"));

        for(Book book : bookCollections.getList()){
            System.out.println(book.getTitle());
        }
    }
}
