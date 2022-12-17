package pl.edu.wsiz.io12.part2;

import java.util.ArrayList;

public class Company {
    private ArrayList<Employee> employees = new ArrayList<>();

    public void add(Employee employee) {
        employees.add(employee);
    }

    public void printEmployees() {
        System.out.println("--------------------");

        for (int i = 0; i < employees.size(); i++) {
            System.out.print(i + 1 + "  ");
            Employee employee = employees.get(i);
            employee.print();
            System.out.println();
        }

        System.out.println("--------------------");
    }
}
