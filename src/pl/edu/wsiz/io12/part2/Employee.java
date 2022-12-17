package pl.edu.wsiz.io12.part2;

import java.util.Scanner;

public class Employee {
    String firstname;
    String lastname;
    int age;

    void print() {
        System.out.print(firstname + " " + lastname + " " + age);
    }

    static Employee read() {
        Scanner scanner = new Scanner(System.in);
        Employee e = new Employee();

        System.out.print("Podaj imię:      ");
        e.firstname = scanner.next();

        System.out.print("Podaj nazwisko:  ");
        e.lastname = scanner.next();

        System.out.print("Podaj wiek:      ");
        e.age = scanner.nextInt();

        return e;
    }
}