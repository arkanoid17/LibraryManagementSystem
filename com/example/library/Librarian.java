package com.example.library;

public class Librarian extends User {
    
    private String employeeNumber;

    public Librarian(String employeeNumber){
        this.employeeNumber = employeeNumber;
    }

    public Librarian(String name, String contactInfo, String employeeNumber){
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Library Dashboard.");
        System.out.println("Employee Number: "+employeeNumber);
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    // public void addBook(Book book){}

    // public void removeBook(Book book){}

    //this is a test comment
    
}
