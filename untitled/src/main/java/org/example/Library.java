package org.example;

public interface Library {
    void addClient(String firstName, String lastName, String email);
    void removeClient(String clientId);
    void addBookToClient(String clientId, String bookId);
    void removeBookFromClient(String clientId, String bookId);

}