public class Produit {

    private String name;
    private int year;
    private int month;
    private int  price;


    public Produit(String name, int year, int month, int price) {
        this.name = name;
        this.year = year;
        this.month = month;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", month=" + month +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
}
