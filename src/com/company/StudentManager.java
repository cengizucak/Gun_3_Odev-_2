package com.company;

public class StudentManager extends UserManager{

    public void add(User user) {

        System.out.println("Ogrenci id eklendi     : "+user.getId());
        System.out.println("Ogrenci email eklendi  : "+user.getEmail()+"\n");

    }
}
