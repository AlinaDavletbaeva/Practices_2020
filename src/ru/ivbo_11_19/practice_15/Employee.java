package ru.ivbo_11_19.practice_15;

import ru.ivbo_11_19.lesson8.lesson.InvalidMileageException;

public class Employee {
    private int salary;

    public int getSalary() {
        return salary;
    }
   //через собственный тип исключения InvalidMileageException

    //метод, бросающий исключение типа Exception
    public void addSalary(int salary) throws InvalidSalaryException {
        if(salary < 0) {
            throw new InvalidSalaryException("salary must be positive");
        }
        this.salary += salary;
    }
    public void add2Salary(int salary) throws InvalidSalary2Exception {
        if(salary < 0) {
            throw new InvalidSalary2Exception("ignored salary<0");
        }
        this.salary += salary;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                '}';
    }
}
