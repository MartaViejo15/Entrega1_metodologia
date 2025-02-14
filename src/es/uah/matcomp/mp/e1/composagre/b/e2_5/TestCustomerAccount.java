package es.uah.matcomp.mp.e1.composagre.b.e2_5;

public class TestCustomerAccount {
    public static void main(String[] args) {
        // Test for Customer class
        Customer c1 = new Customer(16, "Lili", 'f');

        System.out.println(c1);
        System.out.println("Customer's id is:" + c1.getId());
        System.out.println("Customer's name's is:" + c1.getName());
        System.out.println("Customer's gender's is:" + c1.getGender());

        // Test for Account class
        Account a1 = new Account(4, c1, 1000);
        System.out.println(a1);
        System.out.println("Id is:" + a1.getId());
        System.out.println("Customer is:" + a1.getCustomer());
        System.out.println("Customer's balance is:$" + a1.getBalance());
        System.out.println("Customer's id is:" + a1.getCustomerId());
        System.out.println("Customer's name is:" + a1.getCustomerName());
        System.out.println("Deposited account is:" + a1.deposit(400));
        System.out.println("Withdrew account is:" + a1.withdraw(200));
        System.out.println("Withdrew account is:" + a1.withdraw(2000));


    }
}
