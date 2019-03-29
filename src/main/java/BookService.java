import java.util.*;
import java.util.stream.Collectors;

public class BookService {

    // Methode qui filtre la liste des livre par année de pkublication
    // ensuite trie le résultat oar prix d'une façon descendante
    // Si les pris sont égaux, on trie par le nom de l'auteur
    public static List<Book> filterBooksByPublicationYearAndFilterByPriceTheFilterByAuthorName(List<Book> books) {

        return books.stream()
                .filter( b -> b.getDate().getYear() >= 2011)
                .sorted(Comparator.comparing(Book::getPrice).reversed().thenComparing(b ->  b.getAuthor().getName()))
                .collect(Collectors.toList());
    }

    // Retourne la liste des pays des auteurs sans doublons
    public static Set<String> getAuthorCountriesDistinct(List<Book> bookList) {
        return bookList.stream().map( b -> b.getAuthor().getCountry().getName() ).collect(Collectors.toSet());
    }

    // Retourner un mpa qui contient la somme des prix des livres par catégorie
    public static Map<Catergory, Integer> getSumPriceGroupedByCategory(List<Book> bookList) {
        return bookList.stream().collect(Collectors.toMap(Book::getCatergory, Book::getPrice, (a, b) -> a + b));
    }

}
