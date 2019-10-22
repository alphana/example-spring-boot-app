package name.hedehodo.example.examplespringbootapp.repository;

import name.hedehodo.example.examplespringbootapp.model.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class BookRepository {
    private List<Book> theRepo=new ArrayList<Book>(Arrays.asList(  new Book[]{new Book(1,"Just Spring","1449316085"), new Book(2,"Java-se 6","9752979277")}));

    public List<Book> findAll() {
        return theRepo;
    }

    public Book findById(Long id) {
        for (Book book:theRepo ) {
            if (book.getId()==id)
                return book;
        }
        return null;
    }
}
