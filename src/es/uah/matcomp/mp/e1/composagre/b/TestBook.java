package es.uah.matcomp.mp.e1.composagre.b;

public class TestBook {
    public static void main(String[] args) {

        // Declare and allocate an array of Authors
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        // Declare and allocate a Book instance
        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy); // toString()

        // Construct an author instance
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck); // Author's toString()
        Book dummyBook = new Book("Java for dummy", authors, 19.95, 99); // Test Book's Constructor
        System.out.println(dummyBook); // Test Book's toString()
// Test Getters and Setters
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthors()); // Author's toString()
        System.out.println("Author's name is: " + dummyBook.getAuthorNames());
        System.out.println("Author's email is: " + dummyBook.getAuthorEmail());
// Use an anonymous instance of Author to construct a Book instance
        Book anotherBook = new Book("more Java",
                authors, 29.95);
        System.out.println(anotherBook); // toString()

        System.out.println(anotherBook.getName()); // Modificación 1
        System.out.println(anotherBook.getAuthorEmail()); // Modificación 1
        System.out.println("Author's name is: " + dummyBook.getName());  // Modificación 2
        System.out.println("Author's email is: " + dummyBook.getAuthorEmail());  // Modificación 2
        System.out.println("Author's gender is: " + dummyBook.getAuthorGender());  // Modificación 2

    }
}
