package com.study;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("Igor", "Ivanov", "PV-911", 5);
        students[1] = new Student("Tamara", "Petrova", "PT-933", 3.9);
        students[2] = new Aspirant("Vadim", "Stolarov", "CE-665", 5, "Chemical industry");
        students[3] = new Aspirant("Danil", "Novov", "TT-911", 4.3, "Ukrainian historical features");

        for (Student student : students ) {
            student.getScholarship();
        }
    }
}
