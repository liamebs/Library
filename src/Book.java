public class Book {
    private String name;
    private double price;

    private Author author;
    private int qty = 0;

    public Book(String name, double price, Author author, int qty) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author.toString() +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}

