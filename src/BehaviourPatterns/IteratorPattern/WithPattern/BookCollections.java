package BehaviourPatterns.IteratorPattern.WithPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class BookCollections implements Iterable<Book>{
    List<Book> list = new ArrayList<>();

    public void addBook(Book book){
        list.add(book);
    }

    public List<Book> getList(){
        return list;
    }

//    public Iterator<Book> createIterator() {
//        return new BookIterator(this.list);
//    }

    @Override
    public Iterator<Book> iterator() {
        return list.iterator();
    }

    // why nested loop? because this is usually how Iterator class is implemented as Iterator here depends on list completely
//    private class BookIterator implements Iterator<Book> {
//        private int position = 0;
//        private List<Book> list;
//        public BookIterator(List<Book> list){
//            this.list = list;
//        }
//        @Override
//        public boolean hasNext() {
//            return position < list.size();
//        }
//
//        @Override
//        public Book next() {
//            return list.get(position++);
//        }
//    }
}

