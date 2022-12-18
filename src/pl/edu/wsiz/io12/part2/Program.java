package pl.edu.wsiz.io12.part2;

import java.util.Scanner;

public class Program {

    private static final int EXIT_OPERATION_CODE = 99;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Company company = new Company();

        company.add(new Employee("Jan", "Kowalski", 31));
        company.add(new Employee("Anna", "Kowalczyk", 27));
        company.add(new Employee("Piotr", "Nowak", 36));

        int operationNumber = 0;

        while (operationNumber != EXIT_OPERATION_CODE) {
            System.out.println("Lista operacji:\n");

            System.out.println("1 - wypisz listę pracowników");
            System.out.println("2 - dodaj pracownika");
            System.out.println("3 - usuń pracownika");
            System.out.println("9 - zakończ program\n");

            System.out.print("Podaj numer operacji: ");
            operationNumber = scanner.nextInt();

            switch (operationNumber) {
                case 1:
                    company.printEmployees();
                    break;

                case 2:
                    company.add();
                    break;

                case 3:
                    System.out.print("Podaj numer pracownika do usunięcia: ");
                    int employeeNumber = scanner.nextInt();
                    company.removeEmployee(employeeNumber);
                    break;

                case EXIT_OPERATION_CODE:
                    break;

                default:
                    System.out.println("Operacja o podanym numerze nie istnieje!");
            }
        }
    }
}
