package BehaviourPatterns.IteratorPattern.Without;

import java.util.ArrayList;
import java.util.List;

public class BookCollections {
    List<Book> list = new ArrayList<>();

    public void addBook(Book book){
        list.add(book);
    }

    public List<Book> getList(){
        return list;
    }
}
