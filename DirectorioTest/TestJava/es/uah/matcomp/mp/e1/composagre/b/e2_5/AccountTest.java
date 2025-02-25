package es.uah.matcomp.mp.e1.composagre.b.e2_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getId() {
        Customer c1 = new Customer(16, "Lili", 'f');
        Account a1 = new Account(4, c1, 1000);
        assertEquals(4, a1.getId());
    }

    @Test
    void getCustomer() {
        Customer c1 = new Customer(16, "Lili", 'f');
        Account a1 = new Account(4, c1, 1000);
        assertEquals(c1, a1.getCustomer());
    }

    @Test
    void getCustomerId() {
        Customer c1 = new Customer(16, "Lili", 'f');
        Account a2 = new Account(4, c1);
        assertEquals(16, a2.getCustomerId());
    }

    @Test
    void getBalance() {
        Customer c1 = new Customer(16, "Lili", 'f');
        Account a1 = new Account(4, c1, 1000);
        assertEquals(1000, a1.getBalance());
    }

    @Test
    void setBalance() {
        Customer c1 = new Customer(16, "Lili", 'f');
        Account a1 = new Account(4, c1, 1000);
        a1.setBalance(6000);
        assertEquals(6000, a1.getBalance());
    }

    @Test
    void testToString() {
        Customer c1 = new Customer(16, "Lili", 'f');
        Account a1 = new Account(4, c1, 1000);
        assertEquals("Lili(4) balance=$1000.0", a1.toString());
    }

    @Test
    void getCustomerName() {
        Customer c1 = new Customer(16, "Lili", 'f');
        Account a1 = new Account(4, c1, 1000);
        assertEquals("Lili", a1.getCustomerName());
    }

    @Test
    void deposit() {
        Customer c1 = new Customer(16, "Lili", 'f');
        Account a1 = new Account(4, c1, 1000);
        a1.deposit(100);
        assertEquals(1100, a1.getBalance());
    }

    @Test
    void testWithdrawSuccessful() {
        Customer c1 = new Customer(16, "Lili", 'f');
        Account a1 = new Account(4, c1, 1000);
        a1.withdraw(100);
        assertEquals(900, a1.getBalance());
        Account a2 = new Account(4, c1, 1000);
        a2.withdraw(2000);
        assertEquals(1000, a2.getBalance());
    }

    @Test
    void testWithdrawExceedsBalance() {
        Customer c1 = new Customer(16, "Lili", 'f');
        Account a1 = new Account(4, c1, 1000);
        a1.withdraw(2000);
        assertEquals(1000, a1.getBalance());
    }
}