package es.uah.matcomp.mp.e1.composagre.b.e2_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void getId() {
        Customer c1 = new Customer(16, "Lili", 'f');
        assertEquals(16, c1.getId());
    }

    @Test
    void getName() {
        Customer c1 = new Customer(16, "Lili", 'f');
        assertEquals("Lili", c1.getName());
    }

    @Test
    void getGender() {
        Customer c1 = new Customer(16, "Lili", 'f');
        assertEquals('f', c1.getGender());
    }

    @Test
    void testToString() {
        Customer c1 = new Customer(16, "Lili", 'f');
        assertEquals("Lili(16)", c1.toString());
    }
}