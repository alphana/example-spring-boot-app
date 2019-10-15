package name.atakan.example.examplespringbootapp.controller;

import name.atakan.example.examplespringbootapp.model.Book;
import name.atakan.example.examplespringbootapp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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