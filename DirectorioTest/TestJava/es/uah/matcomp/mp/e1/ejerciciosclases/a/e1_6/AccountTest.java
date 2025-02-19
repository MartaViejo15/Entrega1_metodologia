package es.uah.matcomp.mp.e1.ejerciciosclases.a.e1_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    void credit() {
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        a1.credit(100);
        assertEquals(188, a1.getBalance());
    }

    @Test
    void getId() {
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        assertEquals("A101", a1.getId());
    }

    @Test
    void getName() {
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        assertEquals("Tan Ah Teck", a1.getName());
    }

    @Test
    void debit() {
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        a1.debit(100);
        assertEquals(100, a1.getBalance());
    }

    @Test
    void transferTo() {
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        Account a2 = new Account("A102", "Tan Ah Teck", 88);
        a2.debit(100);
    }

    @Test
    void testToString() {
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        Account a2 = new Account("A102", "Tan Ah Teck", 88);
        Account a3 = new Account("A103", "Tan Ah Teck", 88);
        Account a4 = new Account("A104", "Tan Ah Teck", 88);
        assertEquals(a1.toString(), a2.toString());
        assertEquals(a2.toString(), a3.toString());
        assertEquals(a3.toString(), a4.toString());
        assertEquals(a4.toString(), a1.toString());
    }
}