package org.example;

import java.util.UUID;

public class Book {
    private final String title;
    private final String author;
    private final String bookId;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.bookId = UUID.randomUUID().toString();
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookId() {
        return bookId;
    }
}
