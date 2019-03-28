import java.util.*;
import java.util.stream.Collectors;

public class BookService {

    public static List<Book> filterBooksByPublicationYearAndFilterByPriceTheFilterByAuthorName(List<Book> books) {

        return books.stream()
                .filter( b -> b.getDate().getYear() >= 2011)
                .sorted(Comparator.comparing(Book::getPrice).reversed().thenComparing(b ->  b.getAuthor().getName()))
                .collect(Collectors.toList());
    }

    public static Set<String> getAuthorCountriesDistinct(List<Book> bookList) {
        return bookList.stream().map( b -> b.getAuthor().getCountry().getName() ).collect(Collectors.toSet());
    }

    public static Map<Catergory, Integer> getSumPriceGroupedByCategory(List<Book> bookList) {
        return bookList.stream().collect(Collectors.toMap(Book::getCatergory, Book::getPrice, (a, b) -> a + b));
    }

}
