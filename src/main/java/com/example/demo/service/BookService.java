package com.example.demo.service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public boolean addBook(String nameBook, int idAuthor){
        try {
            Book book = new Book(nameBook,idAuthor);
            bookRepository.save(book);
            return true;
        }catch (Exception e){
            System.out.println(e);
        }
        return false;
    }

    public boolean updateBook(int idOldBook, String newNameBook, int newIdAuthor){
        try {
            if (bookRepository.findById(idOldBook)!=null){
                Book book1 = new Book();
                book1.setNameBook(newNameBook);
                book1.setIdAuthor(newIdAuthor);
                bookRepository.save(book1);
                return true;
            }else{
                return false;
            }
        } catch (Exception e){
            System.out.println(e);
        }
        return false;
    }

    public boolean deleteBook(int id){
        try {
            bookRepository.deleteById(id);
            return true;
        }catch (Exception e){
            System.out.println(e);
        }
        return false;
    }

}
