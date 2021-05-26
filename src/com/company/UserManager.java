package com.company;

public class UserManager {


    public void add(User user) {

       // System.out.println("ogrenci id : " + user.getId());

       // System.out.println("ogretmen email : " + user.getEmail());


    }

    public void addMultible(User[] users) {

        for (User user : users) {
            add(user);
        }
    }

}
