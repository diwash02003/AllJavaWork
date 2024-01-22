package com.FileWorks;

public class User {

    private String rollNumber;
    private String name;
    private String mobileNumber;

    public User(String rollNumber, String name, String mobileNumber) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }
}
