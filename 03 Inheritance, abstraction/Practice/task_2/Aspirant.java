package com.study;

public class Aspirant extends Student{
    public String getScienceWorkName() {
        return scienceWorkName;
    }
    public void setScienceWorkName(String scienceWorkName) {
        this.scienceWorkName = scienceWorkName;
    }

    private String scienceWorkName;

    Aspirant(String firstName, String lastName, String group, double averageMark, String scienceWorkName) {
        super(firstName, lastName, group, averageMark);
        this.scienceWorkName = scienceWorkName;
    }

    @Override
    public void getScholarship() {
        if(super.getAverageMark() == 5) {
            System.out.printf("Student %s %s has scholarship 200UA\n", super.getFirstName(), super.getLastName());
        }
        else {
            System.out.printf("Student %s %s has scholarship 180UA\n", super.getFirstName(), super.getLastName());
        }
    }
}
