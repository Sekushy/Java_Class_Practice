package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    //Constructor
    public Person (String firstName, String lastName, int age) {
        //this.firstName se refera la first name de la linia 4
        //= firstName se refera la first name de la linia 7
        this.firstName = firstName;
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
