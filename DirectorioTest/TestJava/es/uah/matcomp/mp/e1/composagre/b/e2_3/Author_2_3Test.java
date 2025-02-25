package es.uah.matcomp.mp.e1.composagre.b.e2_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Author_2_3Test {

    @Test
    void getName() {
        Author_2_3 a1 = new Author_2_3("Tan Ah Teck", "ahteck@nowhere.com");
        assertEquals("Tan Ah Teck", a1.getName());
    }

    @Test
    void getEmail() {
        Author_2_3 a1 = new Author_2_3("Tan Ah Teck", "ahteck@nowhere.com");
        assertEquals("ahteck@nowhere.com", a1.getEmail());
    }

    @Test
    void setEmail() {
        Author_2_3 a1 = new Author_2_3("Tan Ah Teck", "ahteck@nowhere.com");
        a1.setEmail("ahteck@nowhere.es");
        assertEquals("ahteck@nowhere.es", a1.getEmail());
    }

    @Test
    void testToString() {
        Author_2_3 a1 = new Author_2_3("Tan Ah Teck", "ahteck@nowhere.com");
        assertEquals("Author[name=Tan Ah Teck, email=ahteck@nowhere.com]", a1.toString());
    }
}