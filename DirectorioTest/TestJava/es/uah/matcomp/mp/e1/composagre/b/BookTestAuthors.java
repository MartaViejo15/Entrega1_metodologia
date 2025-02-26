package es.uah.matcomp.mp.e1.composagre.b;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTestAuthors {

    @Test
    void getName() {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        assertEquals("Tan Ah Teck", ahTeck.getName());
    }

    @Test
    void getAuthors() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        assertArrayEquals(authors, authors);
    }

    @Test
    void getPrice() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        BookAuthors javaDummy = new BookAuthors("Java for Dummy", authors, 19.99, 99);
        assertEquals(19.99, javaDummy.getPrice());
    }

    @Test
    void setPrice() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        BookAuthors javaDummy = new BookAuthors("Java for Dummy", authors, 19.99, 99);
        javaDummy.setPrice(19.99);
        assertEquals(19.99, javaDummy.getPrice());
    }

    @Test
    void getQty() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        BookAuthors javaDummy = new BookAuthors("Java for Dummy", authors, 19.99, 99);
        assertEquals(99, javaDummy.getQty());
    }

    @Test
    void setQty() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        BookAuthors javaDummy = new BookAuthors("Java for Dummy", authors, 19.99, 99);
        javaDummy.setQty(99);
        assertEquals(99, javaDummy.getQty());
    }

    @Test
    void testToString() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        assertEquals("Author[name=Tan Ah Teck, email=AhTeck@somewhere.com, gender=m]", authors[0].toString());
        assertEquals("Author[name=Paul Tan, email=Paul@nowhere.com, gender=m]", authors[1].toString());
    }

    @Test
    void getAuthorNames() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        assertArrayEquals(authors, authors);
    }

    @Test
    void getAuthorInfo() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        BookAuthors javaDummy = new BookAuthors("Java for Dummy", authors, 19.99, 99);
        assertEquals("Authors: Tan Ah Teck, AhTeck@somewhere.com, mPaul Tan, Paul@nowhere.com, m", javaDummy.getAuthorInfo());
    }

    @Test
    void getAuthorEmail() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        assertEquals("AhTeck@somewhere.com", authors[0].getEmail());
        assertEquals("Paul@nowhere.com", authors[1].getEmail());
    }

    @Test
    void getAuthorGender() {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        assertEquals('m', authors[0].getGender());
        assertEquals('m', authors[1].getGender());
    }
}