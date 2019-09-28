package com.uits.task9;

public class Book {
    String authorName;
    String bookName;

    Book( String authorName, String bookName ) {
        this(authorName) ;
        this.bookName = bookName;
    }

    Book( String authorName ) {
       this();
    }

    Book() {
    }

}

