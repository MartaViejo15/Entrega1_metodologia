package es.uah.matcomp.mp.e1.composagre.b.e2_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Book_2_3Test {

    @Test
    void getIsbn() {
        Author_2_3 a1 = new Author_2_3("Tan Ah Teck", "ahteck@nowhere.com");
        Book_2_3 b1 = new Book_2_3("12345", "Java for dummies", a1, 8.8, 88);
        assertEquals("12345", b1.getIsbn());
    }

    @Test
    void getName() {
        Author_2_3 a1 = new Author_2_3("Tan Ah Teck", "ahteck@nowhere.com");
        Book_2_3 b1 = new Book_2_3("12345", "Java for dummies", a1, 8.8, 88);
        assertEquals("Java for dummies", b1.getName());
    }

    @Test
    void getAuthor() {
        Author_2_3 a1 = new Author_2_3("Tan Ah Teck", "ahteck@nowhere.com");
        Book_2_3 b1 = new Book_2_3("12345", "Java for dummies", a1, 8.8, 88);
        assertEquals(a1, b1.getAuthor());
    }

    @Test
    void getPrice() {
        Author_2_3 a1 = new Author_2_3("Tan Ah Teck", "ahteck@nowhere.com");
        Book_2_3 b2 = new Book_2_3("54321", "Java for dummies 2", a1, 10.99);
        assertEquals(10.99, b2.getPrice());
    }

    @Test
    void setPrice() {
        Author_2_3 a1 = new Author_2_3("Tan Ah Teck", "ahteck@nowhere.com");
        Book_2_3 b1 = new Book_2_3("12345", "Java for dummies", a1, 8.8, 88);
        b1.setPrice(10);
        assertEquals(10, b1.getPrice());
    }

    @Test
    void getQty() {
        Author_2_3 a1 = new Author_2_3("Tan Ah Teck", "ahteck@nowhere.com");
        Book_2_3 b1 = new Book_2_3("12345", "Java for dummies", a1, 8.8, 88);
        assertEquals(88, b1.getQty());
    }

    @Test
    void setQty() {
        Author_2_3 a1 = new Author_2_3("Tan Ah Teck", "ahteck@nowhere.com");
        Book_2_3 b1 = new Book_2_3("12345", "Java for dummies", a1, 8.8, 88);
        b1.setQty(10);
        assertEquals(10, b1.getQty());
    }

    @Test
    void getAuthorName() {
        Author_2_3 a1 = new Author_2_3("Tan Ah Teck", "ahteck@nowhere.com");
        Book_2_3 b1 = new Book_2_3("12345", "Java for dummies", a1, 8.8, 88);
        assertEquals("Tan Ah Teck", b1.getAuthorName());
    }

    @Test
    void testToString() {
        Author_2_3 a1 = new Author_2_3("Tan Ah Teck", "ahteck@nowhere.com");
        Book_2_3 b1 = new Book_2_3("12345", "Java for dummies", a1, 8.8, 88);
        assertEquals("Book[isbn=12345, name=Java for dummies, Author[Author[name=Tan Ah Teck, email=ahteck@nowhere.com]], price=8.8, qty=88]", b1.toString());
    }
}