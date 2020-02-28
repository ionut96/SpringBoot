package com.example.MProject.domainModel;

import javax.persistence.*;

@Entity
@Table(name = "Books")
public class JpaBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idBook;

    @Column(name = "name")
    private String name;

    @Column(name = "author")
    private String author;

    public JpaBook() {}

    public JpaBook(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public int getId() {
        return idBook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String toString()
    {
        return "Cartea: " + getName() + " de: " + getAuthor();
    }
}
