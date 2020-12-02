package ru.ivbo_11_19.all_practices.practice7_8;
import java.util.List;

public class Employee {
    public String name, surname, post;
    public double baseSalary, salary;
    public Employee(Company company, String post, String name, String surname)
    {
        baseSalary = company.getBaseSalary();
        this.name = name;
        this.surname = surname;
        this.post = post;
        if (post == "Manager")
        {
            Manager manager = new Manager();
            salary = manager.calcSalary(baseSalary);
        }
        else if (post == "Top Manager")
        {
            TopManager topManager = new TopManager(company);
            salary = topManager.calcSalary(baseSalary);
        }
        else
        {
            Operator operator = new Operator();
            salary = operator.calcSalary(baseSalary);
        }
    }

    @Override
    public String toString() {
        return "\nИнформация о сотруднике: " +
                "\nИмя: "+ name + " " + surname +
                //"\nФамилия: " + surname +
                "\nДолжность: " + post +
                "\nЗарплата: " + salary + "\n";
    }
}

