package com.company;

public class InstructorManager extends UserManager{

    public void add(User user) {

        System.out.println("Ogretmen id eklendi    : "+user.getId());
        System.out.println("Ogretmen email eklendi : "+user.getEmail());
    }
}
