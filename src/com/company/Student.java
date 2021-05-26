package com.company;

public class Student extends User {


    private int studenNo;
    private String firstName;
    private String lastName;

   // public Student() {}


    public Student(int id, String firstName,
                   String lastName, String email, int studenNo) {
        super(id, email);
        this.lastName = lastName;
        this.firstName = firstName;
        this.studenNo = studenNo;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudenNo() {
        return studenNo;
    }

    public void setStudenNo(int studenNo) {
        this.studenNo = studenNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
