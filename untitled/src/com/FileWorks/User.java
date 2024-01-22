package com.FileWorks;

public class User {

    private String rollNumber;
    private String firstName;
    private String lastName;
    private String mobileNumber;


    public User(String rollNumber, String firstName, String lastName,String mobileNumber) {
        this.rollNumber = rollNumber;
        this.firstName = firstName;
        this.lastName= lastName;
        this.mobileNumber = mobileNumber;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName(){return  lastName;}
    public String getMobileNumber() {
        return mobileNumber;
    }
}
