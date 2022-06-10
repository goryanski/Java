package com.study;

public class Main {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Vasiliy A.G", 233, "Math", "11.01.1995", "+380934094350");
        reader1.takeBook(2);
        reader1.takeBook("Math", "Biology");
        reader1.takeBook(new Book("Math", "Ivanov I.I"), new Book("Biology", "Sidorova A.A"));

        Reader reader2 = new Reader("Ivan A.G", 731, "Math", "15.04.1993", "+380934094656");
        reader2.returnBook(4);
        reader2.returnBook("Math", "Biology", "History", "English");
        reader2.returnBook(new Book("History", "Ivanova I.I"), new Book("English", "Alon A.A"));
    }
}
