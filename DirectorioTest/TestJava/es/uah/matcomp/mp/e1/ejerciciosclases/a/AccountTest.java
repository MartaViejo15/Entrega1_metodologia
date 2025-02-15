package es.uah.matcomp.mp.e1.ejerciciosclases.a;

import es.uah.matcomp.mp.e1.ejerciciosclases.a.e1_6.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    void credit() {
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        a1.credit(100);
        assertEquals(188, a1.getBalance());
    }
}