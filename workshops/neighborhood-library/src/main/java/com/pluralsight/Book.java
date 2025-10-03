package com.pluralsight;

public class Book {

    // Instance Variables
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    // Parameterized Constructor
    public Book(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        isCheckedOut = false;
        checkedOutTo = "";
    }

    // Default Constructor
    public Book() {
        id = 0;
        isbn = "";
        title = "";
        isCheckedOut = false;
        checkedOutTo = "";
    }

}
