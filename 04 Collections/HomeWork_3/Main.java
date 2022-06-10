package com.study;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        ArrayList<Fine> fines = new ArrayList<>();
        ArrayList<Integer> ids = new ArrayList<>();

        //region Default init region
        int personId1 = 1;
        ArrayList<Fine> personFines1 = new ArrayList<>();
        Fine fine1 = new Fine(1111, "Dnipro", FineType.ROAD, personId1);
        Fine fine2 = new Fine(2222, "Dnipro", FineType.ROAD, personId1);
        personFines1.add(fine1);
        personFines1.add(fine2);
        Person person1 = new Person(personId1, "Ivanov I.I.", personFines1);
        people.add(person1);

        int personId2 = 2;
        ArrayList<Fine> personFines2 = new ArrayList<>();
        Fine fine3 = new Fine(1121, "Kyiv", FineType.CRIMINAL, personId2);
        Fine fine4 = new Fine(2225, "Kyiv", FineType.CRIMINAL, personId2);
        personFines2.add(fine3);
        personFines2.add(fine4);
        Person person2 = new Person(personId2, "Petrov B.O.", personFines2);
        people.add(person2);

        int personId3 = 3;
        ArrayList<Fine> personFines3 = new ArrayList<>();
        Fine fine5 = new Fine(11217, "Kharkov", FineType.SMOKING, personId3);
        Fine fine6 = new Fine(22257, "Kharkov", FineType.SMOKING, personId3);
        personFines3.add(fine5);
        personFines3.add(fine6);
        Person person3 = new Person(personId3, "Sidorova A.O.", personFines3);
        people.add(person3);


        ids.add(personId1);
        ids.add(personId2);
        ids.add(personId3);
        fines.add(fine1);
        fines.add(fine2);
        fines.add(fine3);
        fines.add(fine4);
        fines.add(fine5);
        fines.add(fine6);
        //endregion

        Scanner scanner = new Scanner(System.in);
        int choose = 0;
        while (choose != -1) {
            renderMenu();
            System.out.print("Your choose --> ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1 -> printAllPeople(people);
                case 2 -> {
                    System.out.print("Enter code --> ");
                    int code = scanner.nextInt();
                    printDataByCode(people, fines, code);
                }
                case 3 -> {
                    int typeNumber = getTypeNumber();
                    if (typeNumber < 1 || typeNumber > FineType.values().length) {
                        System.out.println("Wrong number");
                    }
                    else {
                        printDataByType(people, fines, FineType.values()[typeNumber - 1]);
                    }
                }
                case 4 -> {
                    System.out.print("Enter city name --> ");
                    String city = scanner.next();
                    printDataByCity(people, fines, city);
                }
                case 5 -> addPerson(people,  fines, ids);
                case 6 -> {
                    printAllPeople(people);
                    System.out.print("Enter person id --> ");
                    int id = scanner.nextInt();
                    addNewFine(people, fines, id);
                }
                case 7 -> {
                    printAllPeople(people);
                    System.out.print("Enter person id --> ");
                    int id = scanner.nextInt();
                    removeFine(people, fines, id);
                }
                case 8 -> {
                    printAllPeople(people);
                    System.out.print("Enter person id --> ");
                    int id = scanner.nextInt();
                    changePersonData(people, fines, id);
                }
                case 9 -> choose = -1;
            }
        }
    }

    public static void renderMenu () {
        System.out.println(
                """
                           
                           Menu:
                           1. Print all DB;
                           2. Print data by fine code;
                           3. Print data by fine fineType;
                           4. Print data by city;
                           5. Add new person;
                           6. Add new fine for person;
                           7. Delete fine;
                           8. Change all person info;
                           9. Exit
                           ==============================================
                           """);
    }

    public static void printAllPeople(ArrayList<Person> people) {
        for (Person person : people) {
            person.printPerson();
        }
    }

    public static void printDataByCode(ArrayList<Person> people,  ArrayList<Fine> fines, int code) {
        Fine fine = fines.stream()
                .filter(f -> f.getCode() == code)
                .findAny()
                .orElse(null);

        if(fine != null) {
            Person person = people.stream()
                    .filter(p -> p.getId() == fine.getPersonId())
                    .findAny()
                    .orElse(null);
            person.printPerson(fine);
        }
        else {
            System.out.println("Data with this code doesn't exist");
        }
    }

    public static void printDataByType(ArrayList<Person> people,  ArrayList<Fine> fines, FineType type) {
        boolean isMatch = false;
        for (Fine fine : fines) {
            if (fine.getType() == type) {
                Person person = people.stream()
                        .filter(p -> p.getId() == fine.getPersonId())
                        .findAny()
                        .orElse(null);
                person.printPerson(fine);
                isMatch = true;
            }
        }
        if(!isMatch) {
            System.out.println("Data with this type doesn't exist");
        }
    }

    public static void printDataByCity(ArrayList<Person> people,  ArrayList<Fine> fines, String city) {
        boolean isMatch = false;
        for (Fine fine : fines) {
            if (Objects.equals(fine.getCity().toLowerCase(), city.toLowerCase())) {
                Person person = people.stream()
                        .filter(p -> p.getId() == fine.getPersonId())
                        .findAny()
                        .orElse(null);
                person.printPerson(fine);
                isMatch = true;
            }
        }
        if(!isMatch) {
            System.out.println("Data with this city doesn't exist");
        }
    }

    public static void addPerson(ArrayList<Person> people,  ArrayList<Fine> fines, ArrayList<Integer> ids) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter person full name --> ");
        String fullName = scanner.next();
        Integer newPersonId = ids.get(ids.size() - 1) + 1; // last id in list + 1

        // fill fines
        System.out.print("How many fines you want to add --> ");
        int finesCount = scanner.nextInt();
        ArrayList<Fine> personFines = new ArrayList<>();
        for (int i = 0; i < finesCount; i++) {
            Fine fine = createFine(newPersonId);
            personFines.add(fine);
        }

        Person person = new Person(newPersonId, fullName, personFines);
        people.add(person);

        ids.add(newPersonId);
        fines.addAll(personFines);
        System.out.println("Success");
    }

    public static void addNewFine(ArrayList<Person> people,  ArrayList<Fine> fines, int personId) {
        Person person = people.stream()
                .filter(p -> p.getId() == personId)
                .findAny()
                .orElse(null);

        if(person == null) {
            System.out.println("Wrong person id");
        }
        else {
            Fine fine = createFine(personId);
            person.addFine(fine);
            fines.add(fine);
            System.out.println("Success");
        }
    }

    public static void removeFine(ArrayList<Person> people,  ArrayList<Fine> fines, int personId) {
        Scanner scanner = new Scanner(System.in);
        Person person = people.stream()
                .filter(p -> p.getId() == personId)
                .findAny()
                .orElse(null);

        if(person == null) {
            System.out.println("Wrong person id");
        }
        else {
            if(person.getFines().size() == 0) {
                System.out.println("There are no fines");
            }
            else {
                System.out.print("Enter fine code --> ");
                int code = scanner.nextInt();
                Fine fine = fines.stream()
                        .filter(f -> f.getCode() == code)
                        .findAny()
                        .orElse(null);

                if(fine == null) {
                    System.out.println("There is no fine with such code");
                }
                else {
                    person.removeFine(fine);
                    fines.remove(fine);
                    System.out.println("Success");
                }
            }
        }
    }

    public static void changePersonData(ArrayList<Person> people,  ArrayList<Fine> fines, int personId) {
        Person person = people.stream()
                .filter(p -> p.getId() == personId)
                .findAny()
                .orElse(null);

        if(person == null) {
            System.out.println("Wrong person id");
        }
        else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Do you want to change user full name? (1-yes, 2-no) --> ");
            int fullNameChoose = scanner.nextInt();
            if(fullNameChoose == 1) {
                System.out.print("Enter a new name --> ");
                String name = scanner.next();
                person.changeFullName(name);
            }
            if(person.getFines().size() == 0) {
                System.out.println("There are no fines");
                System.out.println("Change person completed");
            }
            else {
                System.out.print("Enter fine code to edit fine --> ");
                int code = scanner.nextInt();
                Fine fine = fines.stream()
                        .filter(f -> f.getCode() == code)
                        .findAny()
                        .orElse(null);

                if(fine == null) {
                    System.out.println("There is no fine with such code");
                }
                else {
                    System.out.print("Do you want to change fine code? (1-yes, 2-no) --> ");
                    int fineCodeChoose = scanner.nextInt();
                    if(fineCodeChoose == 1) {
                        System.out.print("Enter a new code --> ");
                        int newCode = scanner.nextInt();
                        fine.changeCode(newCode);
                    }

                    System.out.print("Do you want to change fine type? (1-yes, 2-no) --> ");
                    int typeChoose = scanner.nextInt();
                    if(typeChoose == 1) {
                        System.out.println("Choose new type:");
                        int typeNumber = getTypeNumber();
                        if (typeNumber < 1 || typeNumber > FineType.values().length) {
                            System.out.println("Wrong number");
                        }
                        else {
                            fine.changeType(FineType.values()[typeNumber - 1]);
                        }
                    }

                    System.out.print("Do you want to change fine city? (1-yes, 2-no) --> ");
                    int cityChoose = scanner.nextInt();
                    if(cityChoose == 1) {
                        System.out.print("Enter a new city name --> ");
                        String newCity = scanner.next();
                        fine.changeCity(newCity);
                    }

                    System.out.println("End of changing");
                }
            }
        }
    }

    private static int getTypeNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Types list:");
        for (int i = 0; i < FineType.values().length; i++) {
            System.out.println(i + 1 + ". " + FineType.values()[i]);
        }
        System.out.print("Choose type number --> ");
        return scanner.nextInt();
    }
    private static Fine createFine(int personId) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter fine code --> ");
        int code = scanner.nextInt();
        System.out.print("Enter city name --> ");
        String city = scanner.next();
        boolean isTypeNumberCorrect = false;
        int typeNumber = 0;
        while(!isTypeNumberCorrect) {
            typeNumber = getTypeNumber();
            if (typeNumber < 1 || typeNumber > FineType.values().length) {
                System.out.println("Wrong number");
            }
            else {
                isTypeNumberCorrect = true;
            }
        }
        return new Fine(code, city, FineType.values()[typeNumber - 1], personId);
    }
}