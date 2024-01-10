package com.StudentProgram;

public class Student {

    private String fullName;
    private String eMail;
    private String mobileNumber;

    private float marks[] = new float[5];

    public Student(){

    }
    public Student(String fullName, String eMail, String mobileNumber, float[] marks) {
        this.fullName = fullName;
        this.eMail = eMail;
        this.mobileNumber = mobileNumber;
        this.marks = marks;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public float[] getMarks() {
        return marks;
    }

    public void setMarks(float[] marks) {
        this.marks = marks;
    }
}
