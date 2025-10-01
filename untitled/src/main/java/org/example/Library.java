package org.example;

public interface Library {
    String addClient(String firstName, String lastName, String email);
    void removeClient(String clientId);
    void addBook(String title, String author);
    void removeBook(String bookId);
    void addBookToClient(String clientId, String bookId);
}