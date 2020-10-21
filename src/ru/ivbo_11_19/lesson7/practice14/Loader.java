package ru.ivbo_11_19.lesson7.practice14;

import java.util.Random;
import java.util.function.Predicate;

public class Loader {
    public static void main(String[] args) {
        Company company = new Company();
        Random random = new Random(50_000);
        for (int i = 0; i < 25; i++) {
            Employee employee = new Employee(
                    "Петров",
                    "Пётр",
                    1946 + random.nextInt(50),
                    "Пр.Вернадского д.78",
                    "89245651123",
                    20_000 + random.nextInt(50_000));
            company.addEmployee(employee);

            // System.out.println(employee);
            //company.deleteEmployee(employee, 5);
            //car.addMileage(random.nextInt(100_000));
        }

        System.out.println("Данные о сотрудниках 1988 рождения и младше: ");
        //реализация сортировки через отдельный класс
        company.findEmployees(new YearSelector(1988), new ConsolePrinter());
        System.out.println("Фамилии сотрудников с зарплатой больше 50_000: ");
        //через анонимный класс
        company.findEmployees(
                new EmployeesSelector() {
                    @Override
                    public boolean isNeed(Employee employee) {
                        return employee.getSalary() > 50_000;

                       // System.out.println("Начислена пи" employee.getSalary() + 20_000);
                    }
                },
                new handleEmployees() {
                    @Override
                    public void handleEmployees(Employee employee) {
                        System.out.println(employee.getSurname());

                    }
                }
        );
        //через лямбда-выражения
        System.out.println("Список и кол-во сотрудников, чьи фамилии начинаются на П: ");
        EmployeesSelector selector = c -> c.getSurname().startsWith("П");
        company.findEmployees(selector, c-> System.out.println(c));
        System.out.println("Список и кол-во фамилий сотрудников, старше 43 лет и с зарплатой выше 25тыс.");

        company.findEmployees(
                c->c.getBirthday() < 1977 && c.getSalary() > 25_000,
                employee -> System.out.println(employee.getSurname()));

    }}