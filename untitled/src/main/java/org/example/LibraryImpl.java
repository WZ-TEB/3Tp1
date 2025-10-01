package org.example;

import java.util.HashMap;
import java.util.Map;

public class LibraryImpl implements Library {

    Map<String, Client> clientMap = new HashMap<>();

    @Override
    public void addClient(String firstName, String lastName, String email) {
        Client client = new Client(firstName, lastName, email);
        clientMap.put(client.getClientId(), client);
    }

    @Override
    public void removeClient(String clientId) {

    }

    @Override
    public void addBookToClient(String clientId, String bookId) {

    }

    @Override
    public void removeBookFromClient(String clientId, String bookId) {

    }
}
