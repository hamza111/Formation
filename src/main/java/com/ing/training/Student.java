package com.ing.training;

import java.util.List;

/**
 * Created by hamza on 3/25/19.
 */
public class Student {

    private String name;
    private int age;
    private List<Book> books;

    public Student(String name, int age, List<Book> books) {
        this.name = name;
        this.age = age;
        this.books = books;
    }

    public int getAge() {
        return age;
    }

    public List<Book> getBooks() {
        return books;
    }
}
