public class Book {
    private String name;
    private double price;
    private Author author;
    private int qty = 0; // qty default to 0 if not defined at instantiation

    // two constructors, second one overloads first if no quantity given, and defaults qty to 0
    public Book(String name, double price, Author author, int qty) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.qty = qty;
    }

    public Book(String name, double price, Author author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    // getters redundant following toString() implementation
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

    // toString() override with custom output means above getters not needed now
    // author.toString() incorporated here too
    @Override
    public String toString() {
        return "Book: " + name + "\n" + author.toString() +
                "Price: £" + price + ", Quantity: " + qty + "\n";
    }
}

