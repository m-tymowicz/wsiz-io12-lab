package pl.edu.wsiz.io12.part2;

import java.util.ArrayList;

public class Company {
    private final ArrayList<Employee> employees = new ArrayList<>();

    private boolean employeeExists(Employee employee) {
        for (Employee tmpEmployee : employees) {
            if (tmpEmployee.isEqual(employee)) {
                return true;
            }
        }

        return false;
    }

    public void add(Employee newEmployee) {
        if (!employeeExists(newEmployee)) {
            employees.add(newEmployee);
        } else {
            System.out.println("Pracownik o tych samych danych znajduje się już na liście!");
        }
    }

    public void add() {
        Employee employee = Employee.read();
        add(employee);
    }

    public void removeEmployee(int employeeNumber) {
        if (employeeNumber < 1 || employeeNumber > employees.size()) {
            System.out.println("Lista nie zawiera pracownika o podanym numerze porządkowym.");
            return;
        }

        employees.remove(employeeNumber - 1);
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
