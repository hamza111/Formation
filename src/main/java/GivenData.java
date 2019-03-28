import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GivenData {

    public static List<Book> getBookList(){

        List<Book> books = new ArrayList<>();

        books.add(new Book("book1", 100, Catergory.ACTION, new Author("a1", Country.FR), LocalDate.of(2011, 1, 1)));
        books.add(new Book("book2", 100, Catergory.DRAMA, new Author("a2", Country.US), LocalDate.of(2019, 1, 1)));
        books.add(new Book("book3", 50,  Catergory.ROMANCE, new Author("a3", Country.GB), LocalDate.of(2009, 1, 1)));
        books.add(new Book("book4", 60,  Catergory.ACTION, new Author("a3", Country.FR), LocalDate.of(2003, 1, 1)));
        books.add(new Book("book5", 40,  Catergory.ROMANCE, new Author("a4", Country.US), LocalDate.of(2015, 1, 1)));
        books.add(new Book("book6", 200, Catergory.DRAMA, new Author("a5", Country.US), LocalDate.of(2018, 1, 1)));
        books.add(new Book("book7", 175, Catergory.DRAMA, new Author("a5", Country.US), LocalDate.of(2008, 1, 1)));

        return books;
    }

    public static List<Student> getStudentList() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("hacen", 36, Arrays.asList(getBookList().get(0), getBookList().get(6))));
        students.add(new Student("hamza", 28, Arrays.asList(getBookList().get(1), getBookList().get(5))));
        students.add(new Student("fouad", 26, Arrays.asList(getBookList().get(2), getBookList().get(4), getBookList().get(6))));
        students.add(new Student("youssef", 29, Arrays.asList(getBookList().get(2), getBookList().get(3), getBookList().get(5))));
        students.add(new Student("mohammed", 32, Arrays.asList(getBookList().get(1), getBookList().get(3), getBookList().get(4))));
        return students;
    }

    public static List<Produit> produits(){

        return Arrays.asList(
                new Produit("Lait", 2018, 2, 40),
                new Produit("Chocolat", 2018, 2, 50),

                new Produit("Viande", 2018, 3, 70),
                new Produit("Polet", 2018, 3, 80),


                new Produit("Coca", 2018, 4, 76),

                new Produit("Gateau", 2017, 9, 30),
                new Produit("Confiture", 2017, 9, 40)
        );
    }
}
