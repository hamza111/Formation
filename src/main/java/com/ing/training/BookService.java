package com.ing.training;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by hamza on 3/25/19.
 */
public class BookService {
    public static List<Book> filterBookByYearAndSortByPriceTheAuthorName(List<Book> books) {
        return  books.stream()
                .filter(b -> b.getDate().getYear() >= 2011)
                .sorted(Comparator.comparing(Book::getPrice).reversed().thenComparing(b -> b.getAuthor().getName()))
                .collect(Collectors.toList());
    }

    public static Set<String> getAuthorsCountriesDistinct(List<Book> books) {
        return books.stream().map(b -> b.getAuthor().getCountry().getName()).collect(Collectors.toSet());
    }

    public static Map<Category, Integer> getPriceSumGroupedByCategory(List<Book> books) {
        return books.stream().collect(Collectors.toMap(Book::getCategory, Book::getPrice, (a, b) -> a + b));
    }

    public static List<Student> filterStudent(List<Student> students) {
        return students.stream()
                .filter(s -> s.getAge() > 20)
                .filter(s -> s.getBooks().stream().anyMatch(b -> b.getPrice() == 50))
                .collect(Collectors.toList());
    }
}
