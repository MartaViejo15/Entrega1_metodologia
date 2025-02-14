package es.uah.matcomp.mp.e1.composagre.b.e2_3;

public class Book_2_3 {
    private String isbn;
    private String name;
    private Author_2_3 author;
    private double price;
    private int qty = 0;

    public Book_2_3(String isbn, String name, Author_2_3 author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public Book_2_3(String isbn, String name, Author_2_3 author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getName() {
        return name;
    }
    public Author_2_3 getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public String getAuthorName() {
        return author.getName();
    }
    public String toString() {
        return "Book[isbn=" + isbn + ", name=" + name + ", Author[" + author + "], price=" + price + ", qty=" + qty + "]";
    }
}
