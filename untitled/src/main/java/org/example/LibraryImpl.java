package org.example;

import java.util.HashMap;
import java.util.Map;

public class LibraryImpl implements Library {

    Map<String, Client> clientMap = new HashMap<>();
    Map<String, Book> bookMap = new HashMap<>();

    @Override
    public String addClient(String firstName, String lastName, String email) {
        Client client = new Client(firstName, lastName, email);
        clientMap.put(client.getClientId(), client);
        return client.getClientId();
    }

    @Override
    public void removeClient(String clientId) {
        clientMap.remove(clientId);
    }

    @Override
    public String addBook(String title, String author) {
        Book book = new  Book(title, author);
        bookMap.put(book.getBookId(), book);
        return book.getBookId();
    }

    @Override
    public void removeBook(String bookId) {
        bookMap.remove(bookId);
    }

    @Override
    public void addBookToClient(String clientId, String bookId) {
        Client client = clientMap.get(clientId);
        Book book = bookMap.get(bookId);
        client.addBookToClient(bookId);
    }

    public void activatePremiumStatus(String clientId){
        Client client = clientMap.get(clientId);
        client.setPremiumStatus(true);
    }
}
