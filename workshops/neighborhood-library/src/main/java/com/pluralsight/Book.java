package com.pluralsight;
import java.util.Scanner;

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

    // Setters
    public void setID(int id) {
        this.id = id;
    }

    public void setISBN(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsCheckedOut(boolean isCheckedOut) {
        this.isCheckedOut = isCheckedOut;
    }

    public void setCheckOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    // Getters

    public int getID() {
        return this.id;
    }

    public String getISBN() {
        return this.isbn;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean getIsCheckedOut() {
        return this.isCheckedOut;
    }

    public String getCheckedOutTo() {
        return this.checkedOutTo;
    }

    // Method to check out a book from the library
    public void checkOut(String name) {
        this.checkedOutTo = name;
        this.isCheckedOut = true;
    }

    // Method to check in a book to the library
    public void checkIn() {
        this.checkedOutTo = "";
        this.isCheckedOut = false;
    }
}
