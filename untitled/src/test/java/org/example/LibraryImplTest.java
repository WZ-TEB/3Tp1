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
    void removeClient() {

    }

    @Test
    void addBookToClient() {
    }

    @Test
    void removeBookFromClient() {
    }
}