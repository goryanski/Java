package com.study;

public class Reader {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String name;
    private int ticketNumber;
    private String faculty;
    private String birth;
    private String phone;

    Reader(String name, int ticketNumber, String faculty, String birth, String phone) {
        setName(name);
        setTicketNumber(ticketNumber);
        setFaculty(faculty);
        setBirth(birth);
        setPhone(phone);
    }



    public void takeBook(int countBooks) {
        System.out.printf("%s took %d books\n", name, countBooks);
        System.out.println();
    }
    public void takeBook(String ...args) {
        System.out.printf("%s took books:\n", name);
        for (int i = 0; i < args.length; i++) {
            System.out.println(i + 1 + ". " + args[i]);
        }
        System.out.println();
    }
    public void takeBook(Book ...books) {
        System.out.printf("%s took books:\n", name);
        for (int i = 0; i < books.length; i++) {
            System.out.printf("%d. name: %s, author: %s\n", i + 1, books[i].getName(), books[i].getAuthor());
        }
        System.out.println();
    }

    public void returnBook(int countBooks) {
        System.out.printf("%s return %d books\n", name, countBooks);
        System.out.println();
    }
    public void returnBook(String ...args) {
        System.out.printf("%s return books:\n", name);
        for (int i = 0; i < args.length; i++) {
            System.out.println(i + 1 + ". " + args[i]);
        }
        System.out.println();
    }
    public void returnBook(Book ...books) {
        System.out.printf("%s return books:\n", name);
        for (int i = 0; i < books.length; i++) {
            System.out.printf("%d. name: %s, author: %s\n", i + 1, books[i].getName(), books[i].getAuthor());
        }
        System.out.println();
    }
}
