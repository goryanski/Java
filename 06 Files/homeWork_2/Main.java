package com.study;


import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        File employeesFile = new File("employees.txt");
        ArrayList<Employee> employees = new ArrayList<>();
        if(!employeesFile.exists()) {
            try {
                employees.add(new Employee(1, "Igor", "Ivanov", 27));
                employees.add(new Employee(2, "Vasya", "Sidorov", 22));
                employees.add(new Employee(3, "Masha", "Petrova", 33));
                employees.add(new Employee(4, "Sergey", "Malishev", 19));

                employeesFile.createNewFile();
                serialize(employees, employeesFile.getName());
            }
            catch (IOException ex) {
                System.err.println("Can't create file");
            }
        }
        else {
            employees = deserialize(employeesFile.getName());
        }
        int lastId = employees.get(employees.size() - 1).getId();

        Scanner scanner = new Scanner(System.in);
        int choose = 0;
        while (choose != -1) {
            renderMenu();
            System.out.print("Your choose --> ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1 -> printEmployees(employees, true);
                case 2 -> {
                    System.out.print("Enter firstname --> ");
                    String firstname = scanner.next();
                    System.out.print("Enter lastname --> ");
                    String lastname = scanner.next();
                    System.out.print("Enter age --> ");
                    int age = scanner.nextInt();
                    employees.add(new Employee(++lastId, firstname, lastname, age));
                    serialize(employees, employeesFile.getName());
                    System.out.println("Success");
                }
                case 3 -> {
                    printEmployees(employees, true);
                    System.out.print("Enter id --> ");
                    int id = scanner.nextInt();
                    Employee employee = findEmployeeById(employees, id);
                    if(employee == null) {
                        System.out.println("Employee not found");
                    }
                    else {
                        System.out.print("Enter new firstname --> ");
                        String firstname = scanner.next();
                        System.out.print("Enter new lastname --> ");
                        String lastname = scanner.next();
                        System.out.print("Enter new age --> ");
                        int age = scanner.nextInt();
                        employee.setFirstname(firstname);
                        employee.setLastName(lastname);
                        employee.setAge(age);
                        serialize(employees, employeesFile.getName());
                        System.out.println("Success");
                    }
                }
                case 4 -> {
                    printEmployees(employees, true);
                    System.out.print("Enter id --> ");
                    int id = scanner.nextInt();
                    Employee employee = findEmployeeById(employees, id);
                    if(employee == null) {
                        System.out.println("Employee not found");
                    }
                    else {
                        employees.remove(employee);
                        serialize(employees, employeesFile.getName());
                        System.out.println("Success");
                    }
                }
                case 5 -> {
                    System.out.print("Enter lastname --> ");
                    String lastname = scanner.next();
                    ArrayList<Employee> foundEmployees = findEmployees(employees, lastname);
                    if(foundEmployees.size() == 0) {
                        System.out.println("No match");
                    }
                    else {
                        printEmployees(foundEmployees, false);
                    }
                }
                case 6 -> {
                    System.out.print("Enter age --> ");
                    int age = scanner.nextInt();
                    ArrayList<Employee> foundEmployees = findEmployees(employees, age);
                    if(foundEmployees.size() == 0) {
                        System.out.println("No match");
                    }
                    else {
                        printEmployees(foundEmployees, false);
                    }
                }
                case 7 -> {
                    System.out.print("Enter first letter of lastname --> ");
                    String firstLetterStr = scanner.next();
                    char firstLetter = firstLetterStr.toLowerCase().charAt(0);
                    ArrayList<Employee> foundEmployees = findEmployees(employees, firstLetter);
                    if(foundEmployees.size() == 0) {
                        System.out.println("No match");
                    }
                    else {
                        printEmployees(foundEmployees, false);
                    }
                }
                case 8 -> choose = -1;
            }
        }
    }
    public static void renderMenu () {
        System.out.println(
                """

                        Menu:
                        1. Print all employees;
                        2. Add new employee;
                        3. Edit employee;
                        4. Delete employee;
                        5. Find employees by lastname;
                        6. Find employees by age;
                        7. Find employees by first letter in lastname;
                        8. Exit
                        ==============================================
                        """);
    }

    public static void serialize(ArrayList<Employee> employees, String fileName) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(employees);
            fos.close();
        }
        catch (FileNotFoundException ex) {
            System.err.println("File not found:");
            ex.printStackTrace();
        }
        catch (IOException ex) {
            System.err.println("Input/Output error:");
            ex.printStackTrace();
        }
        finally {
            try {
                fos.close();
            }
            catch (IOException ex) {
                System.err.println("Input/Output error:");
                ex.printStackTrace();
            }
        }
    }

    public static ArrayList<Employee>  deserialize(String fileName) {
        ArrayList<Employee> employees = new ArrayList<>();
        FileInputStream fis = null;
        Object obj = null;
        try {
            fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            employees =  (ArrayList) ois.readObject();
            ois.close();
        }
        catch (FileNotFoundException ex) {
            System.err.println("File not found:");
            ex.printStackTrace();
        }
        catch (IOException ex) {
            System.err.println("Input/Output error:");
            ex.printStackTrace();
        }
        catch (ClassNotFoundException ex) {
            System.err.println("Class not found:");
            ex.printStackTrace();
        }
        finally {
            try {
                fis.close();
            }
            catch (IOException ex) {
                System.err.println("Input/Output error:");
                ex.printStackTrace();
            }
        }
        return employees;
    }

    public static void printEmployees(ArrayList<Employee> employees, boolean printAll) {
        System.out.println(printAll ? "All employees:" : "Found employees");
        for (Employee employee : employees) {
            employee.printInfo();
        }
        System.out.println();
    }

    public static Employee findEmployeeById(ArrayList<Employee> employees, int id) {
        return employees.stream().filter(e -> e.getId() == id)
                .findAny()
                .orElse(null);
    }
    public static ArrayList<Employee> findEmployees(ArrayList<Employee> employees, String lastname) {
        ArrayList<Employee> foundEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if(employee.getLastName().equalsIgnoreCase(lastname)) {
                foundEmployees.add(employee);
            }
        }
        return foundEmployees;
    }
    public static ArrayList<Employee> findEmployees(ArrayList<Employee> employees, int age) {
        ArrayList<Employee> foundEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if(employee.getAge() == age) {
                foundEmployees.add(employee);
            }
        }
        return foundEmployees;
    }
    public static ArrayList<Employee> findEmployees(ArrayList<Employee> employees, char firstLetter) {
        ArrayList<Employee> foundEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if(employee.getLastName().toLowerCase().charAt(0) == firstLetter) {
                foundEmployees.add(employee);
            }
        }
        return foundEmployees;
    }
}