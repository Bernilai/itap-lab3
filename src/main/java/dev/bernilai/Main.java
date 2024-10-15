package dev.bernilai;

public class Main {
    public static void main(String[] args) {
        HashTable<Integer, String> hashTable = new HashTable<>(10);
        Library library = new Library();

        Book book1 = new Book("978-0134567890", "Gulliver’s Travels", "Jonathan Swift", 5);
        Book book2 = new Book("978-1234567890", "Frankenstein", "Mary Shelley", 3);

        hashTable.put(1, "apple");
        hashTable.put(3, "banana");
        hashTable.put(8, "orange");

        library.addBook(book1);
        library.addBook(book2);

        System.out.println("Task 1");

        System.out.println("Is hash table empty?: " + hashTable.isEmpty());
        System.out.println("Hash table size: " + hashTable.size());

        System.out.println("1: " + hashTable.get(1));
        System.out.println("2: " + hashTable.get(2));
        System.out.println("3: " + hashTable.get(3));
        System.out.println("8: " + hashTable.get(8));

        hashTable.remove(1);
        System.out.println("Hash table size without apple: " + hashTable.size());

        hashTable.remove(3);
        hashTable.remove(8);

        System.out.println("Is hash table empty?: " + hashTable.isEmpty());

        System.out.println("\nTask 2");

        Book foundBook = library.findBook("978-0134567890");
        if (foundBook != null) {
            System.out.println("Found book: " + foundBook.getTitle() + " by " + foundBook.getAuthor());
        } else {
            System.out.println("Book not found.");
        }

        library.removeBook("978-1234567890");

        foundBook = library.findBook("978-1234567890");
        if (foundBook != null) {
            System.out.println("Found book: " + foundBook.getTitle() + " by " + foundBook.getAuthor());
        } else {
            System.out.println("Book not found.");
        }
    }
}
