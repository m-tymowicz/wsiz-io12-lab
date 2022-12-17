package pl.edu.wsiz.io12.part2;

public class Program {
    public static void main(String[] args) {
        Employee employee = new Employee("Jan","Kowalski",31);
        employee.print();

        System.out.println();

        Employee employee2 = Employee.read();
        employee2.print();
    }
}
