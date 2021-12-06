package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    //Definim constructorul
    public Person (String firstName, String lastName, int age){
        this.firstName =  firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}