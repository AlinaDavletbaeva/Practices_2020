package ru.ivbo_11_19.lesson7.practice14;

public class ConsolePrinter implements handleEmployees {
    @Override
    public void handleEmployees(Employee employee) {
        System.out.println("================");
        System.out.println(employee);
        System.out.println("================");
    }
}
