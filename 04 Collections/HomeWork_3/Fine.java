package com.study;

import java.lang.reflect.Type;

class Fine {
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getCity() {
        return city;
    }
    public FineType getType() {
        return fineType;
    }
    public void setType(FineType fineType) {
        this.fineType = fineType;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getPersonId() {
        return personId;
    }
    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public Fine(int code, String city, FineType fineType, int personId) {
        this.code = code;
        this.city = city;
        this.fineType = fineType;
        this.personId = personId;
    }

    private int code;
    private String city;
    private FineType fineType;
    private int personId;

    public void printFIne() {
        System.out.printf("\tCode: %d, City: %s, Fine type: %s\n", code, city, fineType);
    }
    public void changeCode(int code) {
        this.code = code;
    }
    public void changeType(FineType type) {
        fineType = type;
    }
    public void changeCity(String city) {
        this.city = city;
    }
}