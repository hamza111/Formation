import java.time.LocalDate;

public class Book {

    private String name;
    private int price;
    private Catergory catergory;
    private Author author;
    private LocalDate  date;

    public Book(String name, int price, Catergory catergory, Author author, LocalDate date) {
        this.name = name;
        this.price = price;
        this.catergory = catergory;
        this.author = author;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Catergory getCatergory() {
        return catergory;
    }

    public void setCatergory(Catergory catergory) {
        this.catergory = catergory;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
