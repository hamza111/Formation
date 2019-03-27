package com.ing.training;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hamza on 3/25/19.
 */
public class Given {

    public static List<Book> books() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("book1", 100, new Author(Country.FR, "toto"), LocalDate.of(2011, 1, 1), Category.ACTION));
        books.add(new Book("book2", 100, new Author(Country.UK, "koko"), LocalDate.of(2012, 1, 1), Category.DRAMA));
        books.add(new Book("book3", 150, new Author(Country.FR, "fofo"), LocalDate.of(2009, 1, 1), Category.ACTION));
        books.add(new Book("book4", 50, new Author(Country.DE, "lolo"), LocalDate.of(2014, 1, 1), Category.ROMANCE));
        books.add(new Book("book5", 200, new Author(Country.US, "nono"), LocalDate.of(2013, 1, 1), Category.ACTION));
        books.add(new Book("book6", 50, new Author(Country.UK, "momo"), LocalDate.of(2016, 1, 1), Category.ROMANCE));
        books.add(new Book("book7", 175, new Author(Country.DE, "vovo"), LocalDate.of(2007, 1, 1), Category.DRAMA));
        return books;
    }

    public static List<Student> students() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("hacen", 36, Arrays.asList(books().get(0), books().get(6))));
        students.add(new Student("hamza", 28, Arrays.asList(books().get(1), books().get(5))));
        students.add(new Student("fouad", 26, Arrays.asList(books().get(2), books().get(4), books().get(6))));
        students.add(new Student("youssef", 29, Arrays.asList(books().get(2), books().get(3), books().get(5))));
        students.add(new Student("mohammed", 32, Arrays.asList(books().get(1), books().get(3), books().get(4))));
        return students;
    }

}
