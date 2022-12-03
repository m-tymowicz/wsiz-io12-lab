package pl.edu.wsiz.io12.part2;

public class Employee {
    String firstname;
    String lastname;
    int age;

    void print() {
        System.out.print(firstname + " " + lastname + " " + age);
    }

    static Employee read() {
        Employee e = new Employee();

//        e.firstname = "Jan";
//        e.lastname = "Kowalski";
//        e.age = 39;

        return e;
    }
}