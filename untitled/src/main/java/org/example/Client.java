package org.example;

import java.util.ArrayList;
import java.util.UUID;

public class Client {
    private final String firstName;
    private final String lastName;
    private String email;
    private boolean premiumStatus;
    private final String clientId;
    private final ArrayList<String> bookIds;

    public Client(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.premiumStatus = false;
        this.clientId = UUID.randomUUID().toString();
        this.bookIds = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isPremiumStatus() {
        return premiumStatus;
    }

    public void setPremiumStatus(boolean premiumStatus) {
        this.premiumStatus = premiumStatus;
    }

    public String getClientId() {
        return clientId;
    }

    public ArrayList<String> getBookIds() {
        return bookIds;
    }

    public void addBookToClient(String bookId){
        bookIds.add(bookId);
    }
}
