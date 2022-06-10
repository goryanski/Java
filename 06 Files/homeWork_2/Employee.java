package com.study;

import java.io.Serializable;

public class Employee implements Serializable {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(int id, String firstname, String lastName, int age) {
        this.id = id;
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
    }

    private int id;
    private String firstname;
    private String lastName;
    private int age;

    public void printInfo() {
        System.out.printf("id: %d, firstname: %s, lastName: %s, age: %d\n", id, firstname, lastName, age);
    }
}
