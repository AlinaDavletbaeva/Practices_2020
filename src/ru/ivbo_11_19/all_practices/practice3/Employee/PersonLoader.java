package ru.ivbo_11_19.all_practices.practice3.Employee;

public class PersonLoader {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Vasiliy";
        p1.surname = "Petrov";

        p1.displayInfo();

        Employee e1 = new Employee();

        e1.name = "Peter";
        e1.surname = "Vasilyev";
        e1.age = 14; //this age wil be only in baby class, not in parent

        e1.displayInfo();
    }
}

