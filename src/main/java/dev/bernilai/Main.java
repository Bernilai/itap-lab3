package dev.bernilai;

import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashTable = new Hashtable<>(3);
        Library library = new Library();

        Book book1 = new Book("978-0134567890", "Gulliver’s Travels", "Jonathan Swift", 5);
        Book book2 = new Book("978-1234567890", "Frankenstein", "Mary Shelley", 3);

        hashTable.put("apple", 1);
        hashTable.put("banana", 2);
        hashTable.put("orange", 3);

        library.addBook(book1);
        library.addBook(book2);

        System.out.println("Task 1");

        System.out.println("Is hash table empty?: " + hashTable.isEmpty());
        System.out.println("Hash table size: " + hashTable.size());

        hashTable.remove("apple");
        System.out.println("Hash table size without apple: " + hashTable.size());

        hashTable.remove("orange");
        hashTable.remove("banana");

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
