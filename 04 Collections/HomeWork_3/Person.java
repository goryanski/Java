package com.study;

import java.util.ArrayList;

class Person {
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public ArrayList<Fine> getFines() {
        return fines;
    }
    public void setFines(ArrayList<Fine> fines) {
        this.fines = fines;
    }

    public Person(int id, String fullName, ArrayList<Fine> fines) {
        this.id = id;
        this.fullName = fullName;
        this.fines = fines;
    }

    private int id;
    private String fullName;
    private ArrayList<Fine> fines;

    public void printPerson() {
        System.out.printf("Id: %d, FullName: %s\n", id, fullName);
        for (Fine fine : fines) {
            fine.printFIne();
        }
    }
    public void printPerson(Fine fine) {
        System.out.printf("Id: %d, FullName: %s\n", id, fullName);
        fine.printFIne();
    }
    public void addFine(Fine fine) {
        fines.add(fine);
    }
    public void removeFine(Fine fine) {
        fines.remove(fine);
    }
    public void changeFullName(String newName) {
        fullName = newName;
    }
}