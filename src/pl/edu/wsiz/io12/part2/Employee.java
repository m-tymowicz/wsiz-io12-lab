package pl.edu.wsiz.io12.part2;

import java.util.Scanner;

public class Employee {
    private final String firstname;
    private final String lastname;
    private final int age;
    private final Sex sex;

    public Employee(String firstname, String lastname, int age, Sex sex) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.sex = sex;
    }

    public void print() {
        char sexChar = sex == Sex.FEMALE ? 'K' : 'M';
        System.out.print(firstname + " " + lastname + " " + age + " " + sexChar);
    }

    public boolean isEqual(Employee otherEmployee) {
        return this.firstname.equalsIgnoreCase(otherEmployee.firstname)
                && this.lastname.equalsIgnoreCase(otherEmployee.lastname)
                && this.age == otherEmployee.age
                && this.sex == otherEmployee.sex;
    }

    public static Employee read() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj imię:      ");
        String tmpFirstname = scanner.next();

        System.out.print("Podaj nazwisko:  ");
        String tmpLastname = scanner.next();

        System.out.print("Podaj wiek:      ");
        int tmpAge = scanner.nextInt();

        System.out.print("Podaj płeć:      ");
        char charSex = scanner.next().toUpperCase().charAt(0);
        Sex tmpSex = charSex == 'K' ? Sex.FEMALE : Sex.MALE;

        return new Employee(tmpFirstname, tmpLastname, tmpAge, tmpSex);
    }
}