
package com.example.library;

public abstract class User{

    private static int idCounter = 0;

    private final String userId;
    private String name;
    private String contactInfo;

    private static int totalUsers = 0;

    public User(){
        userId = generateUniqueId();
        name = null;
        contactInfo = null;
        totalUsers++;
    }

    public User(String name, String contactInfo){
        this.userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
        totalUsers++;
    }

    public User(User user){
        this.userId = user.userId;
        this.name = user.name;
        this.contactInfo = user.contactInfo;
        totalUsers++;
    }

    private static final String generateUniqueId() {
        return (idCounter++)+"";
    }

    public String getUserId() {
        return userId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public abstract void displayDashboard();

    public abstract boolean canBorrowBooks();

    public static int getTotalUsers() {
        return totalUsers;
    }


}