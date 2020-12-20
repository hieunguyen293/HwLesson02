package com.example.demo.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAuthor;

    @Column(name = "name")
    private String nameAuthor;

    public Author() {
    }

    public Author(int idAuthor, String nameAuthor) {
        this.idAuthor = idAuthor;
        this.nameAuthor = nameAuthor;
    }

    public int getIdAuthor() {
        return idAuthor;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    @Override
    public String toString() {
        return "Author{" +
                "idAuthor=" + idAuthor +
                ", nameAuthor='" + nameAuthor + '\'' +
                '}';
    }
}
