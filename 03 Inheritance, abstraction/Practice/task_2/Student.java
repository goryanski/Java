package com.study;

public class Student {
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public double getAverageMark() {
        return averageMark;
    }
    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    public void getScholarship() {
        if(averageMark == 5) {
            System.out.printf("Student %s %s has scholarship 100UA\n", firstName, lastName);
        }
        else {
            System.out.printf("Student %s %s has scholarship 80UA\n", firstName, lastName);
        }
    }
}
