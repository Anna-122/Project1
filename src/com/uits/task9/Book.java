package com.uits.task9;

public class Book {
    String authorName;
    String bookName;

    Book( String authorName, String bookName ) {
        authorName = authorName;
        bookName = bookName;
    }

    Book( String authorName ) {
        authorName = authorName;
        bookName = "default";
    }

    Book() {
        authorName = "default";
        bookName = "default";
    }

}

