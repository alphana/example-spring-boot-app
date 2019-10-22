package name.hedehodo.example.examplespringbootapp.controller;

import name.hedehodo.example.examplespringbootapp.model.Book;
import name.hedehodo.example.examplespringbootapp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController{

    @Autowired
    private BookRepository repository;
    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return repository.findAll();
    }

    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable Long id){
        return repository.findById(id);
    }


}