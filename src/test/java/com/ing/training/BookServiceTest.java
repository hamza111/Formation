package com.ing.training;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Set;

/**
 * Created by hamza on 3/25/19.
 */
public class BookServiceTest {

    @Test
    public void should_filter_books_by_publication_year() {

        List<Book> books = Given.books();

        List<Book> result = BookService.filterBookByYearAndSortByPriceTheAuthorName(books);

        result.forEach(book -> Assert.assertTrue(book.getDate().getYear() >= 2011));
    }

    @Test
    public void should_sort_books_by_price() {

        List<Book> books = Given.books();

        List<Book> result = BookService.filterBookByYearAndSortByPriceTheAuthorName(books);

        result.stream().reduce((b1, b2) -> {Assert.assertTrue(b1.getPrice() >= b2.getPrice()); return b2;});

        //OR
        for (int i = 0; i < result.size() - 1; i ++) {
            Assert.assertTrue(result.get(i).getPrice() >= result.get(i + 1).getPrice());
        }
    }

    @Test
    public void should_sort_books_by_author_name_if_price_are_equals() {
        List<Book> books = Given.books();

        List<Book> result = BookService.filterBookByYearAndSortByPriceTheAuthorName(books);

        for (int i = 0; i < result.size() - 1; i ++) {
            if (result.get(i).getPrice() == result.get(i + 1).getPrice()) {
                Assert.assertTrue(result.get(i).getAuthor().getName().compareTo(result.get(i + 1).getAuthor().getName()) <= 0);
            }
        }
    }


    @Test
    public void should_get_books_authors_countries_distinct() {
        List<Book> books = Given.books();

        Set<String> result = BookService.getAuthorsCountriesDistinct(books);


    }

}
