
package com.example.library;

public abstract class User{
    private String userId;
    private String name;
    private String contactInfo;

    public User(){
        userId = generateUniqueId();
        name = null;
        contactInfo = null;
    }

    public User(String name, String contactInfo){
        this.userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public User(User user){
        this.name = user.name;
        this.contactInfo = user.contactInfo;
    }

    private String generateUniqueId() {
        return "0";
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

}