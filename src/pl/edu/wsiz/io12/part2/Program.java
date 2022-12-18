package pl.edu.wsiz.io12.part2;

public class Program {
    public static void main(String[] args) {
        Company company = new Company();

        company.add(new Employee("Jan", "Kowalski", 31));
        company.add(new Employee("Anna", "Kowalczyk", 27));
        company.add(new Employee("Piotr", "Nowak", 36));

        company.printEmployees();

        company.removeEmployee(4);
        company.removeEmployee(3);

        company.removeEmployee(0);
        company.removeEmployee(1);

        company.printEmployees();
    }
}
