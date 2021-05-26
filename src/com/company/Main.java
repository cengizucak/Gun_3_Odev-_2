package com.company;

public class Main {

    public static void main(String[] args) {


        Student student = new Student(1,"Deniz","Ucak","deniz@ucak",1);

        Instructor instructor=new Instructor("Engin","Demirog",12,"engin@demirog");

        UserManager manager = new UserManager();
        manager.add(student);
        manager.add(instructor);



        UserManager userManager = new UserManager();
        User[] users={student,instructor};
        userManager.addMultible(users);



        StudentManager studentManager = new StudentManager();
        studentManager.add(student);


        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor);






    }
}
