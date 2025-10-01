package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryImplTest {

    @Test
    void addClient() {
        //given
        LibraryImpl testLibrary = new LibraryImpl();
        //when
        testLibrary.addClient("testFirstName", "testLastName", "testEmail");
        //then
        assertEquals(1, testLibrary.clientMap.size());
    }

    @Test
    void addMultipleClientsSameInfo() {
        //given
        LibraryImpl testLibrary = new LibraryImpl();
        //when
        testLibrary.addClient("testFirstName", "testLastName", "testEmail");
        testLibrary.addClient("testFirstName", "testLastName", "testEmail");
        //then
        assertEquals(2, testLibrary.clientMap.size());
    }

    @Test
    void activatePremiumStatus(){
        //given
        LibraryImpl testLibrary = new LibraryImpl();
        String testClientId = testLibrary.addClient("testFirstName", "testLastName", "testEmail");
        //when
        testLibrary.activatePremiumStatus(testClientId);
        //then
        assertTrue(testLibrary.clientMap.get(testClientId).isPremiumStatus());
    }

    @Test
    void removeClient() {

    }

    @Test
    void addBook() {
    }

    @Test
    void removeBook() {
    }

    @Test
    void addBookToClient(){

    }
}