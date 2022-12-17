package pl.edu.wsiz.io12.part2;

import java.util.Scanner;

public class Employee {
    private final String firstname;
    private final String lastname;
    private final int age;

    public Employee(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public void print() {
        System.out.print(firstname + " " + lastname + " " + age);
    }

    public boolean isEqual(Employee otherEmployee) {
        return this.firstname.equalsIgnoreCase(otherEmployee.firstname)
                && this.lastname.equalsIgnoreCase(otherEmployee.lastname)
                && this.age == otherEmployee.age;
    }

    public static Employee read() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj imię:      ");
        String tmpFirstname = scanner.next();

        System.out.print("Podaj nazwisko:  ");
        String tmpLastname = scanner.next();

        System.out.print("Podaj wiek:      ");
        int tmpAge = scanner.nextInt();

        return new Employee(tmpFirstname, tmpLastname, tmpAge);
    }
}