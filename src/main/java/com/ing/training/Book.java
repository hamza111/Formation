package com.ing.training;

import java.time.LocalDate;

/**
 * Created by hamza on 3/25/19.
 */
public class Book {

    private String name;
    private int price;
    private Author author;
    private LocalDate date;
    private Category category;

    public Book(String name, int price, Author author, LocalDate date, Category category) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.date = date;
        this.category = category;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getPrice() {
        return price;
    }

    public Author getAuthor() {
        return author;
    }

    public Category getCategory() {
        return category;
    }
}
