package com.example.library;

public abstract class Book implements Lendable{
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }


    public boolean lend(User user){
        if(isAvailable){
            isAvailable = false;
            return true;
        }
        return false;
    }

    public void returnBook(User user){
        isAvailable = true;
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    public abstract void displayBookDetails();

}
