package com.example.demo.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBook;

    @Column(name = "nameBook")
    private String nameBook;

    @Column(name = "authorId")
    private int idAuthor;

    public Book() {
    }

    public Book(String nameBook, int authorId) {
        this.nameBook = nameBook;
        this.idAuthor = authorId;
    }

    public Book(int bookId, String nameBook, int authorId) {
        this.idBook = bookId;
        this.nameBook = nameBook;
        this.idAuthor = authorId;
    }

    public int getIdBook() {
        return idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + idBook +
                ", nameBook='" + nameBook + '\'' +
                ", authorId=" + idAuthor +
                '}';
    }
}
