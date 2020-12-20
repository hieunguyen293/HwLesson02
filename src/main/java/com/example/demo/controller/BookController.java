package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/get-all-books")
    public List<Book> getAllBooks(){
        System.out.println("lay het sach");
        return bookService.getAllBooks();
    }

    @PostMapping("/add-book")
    public boolean addBook(@RequestParam String nameBook, @RequestParam int idAuthor){
        System.out.println("them sach");
        return bookService.addBook(nameBook,idAuthor);
    }

    @PutMapping("/update-book")
    public boolean updateBook(@RequestParam int idOldBook, @RequestParam String newNameBook, @RequestParam int newIdAuthor ){
        System.out.println("update sach");
        return bookService.updateBook(idOldBook,newNameBook,newIdAuthor);
    }

    @DeleteMapping("/delete-book")
    public boolean deleteBook(@RequestParam int id){
        System.out.println("xoa sach");
        return bookService.deleteBook(id);
    }

}
