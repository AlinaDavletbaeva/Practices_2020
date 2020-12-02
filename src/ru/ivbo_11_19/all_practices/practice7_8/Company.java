package ru.ivbo_11_19.all_practices.practice7_8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Company{
    public float income;
    public double baseSalary;
    List<Employee> employeeList = new ArrayList<>();
    public Company(float income, double baseSalary)
    {
        this.income = income;
        this.baseSalary = baseSalary;
    }
    public float getIncome() {
        return income;
    }
    public double getBaseSalary()
    {
        return baseSalary;
    }
    public void hire(Employee employee)
    {
        employeeList.add(employee);
    }
    public void hireAll(List<Employee> employees)
    {
        for (int i = 0; i < employees.size(); i++)
        {
            employeeList.add(employees.get(i));
        }
    }
    public void fire(int index)
    {
        if (index < employeeList.size() && index >= 0)
        {
            employeeList.remove(index);
        }
    }
    public List<Employee> getTopSalaryStaff(int numStaff)
    {
        if (numStaff >= 1 && numStaff <= employeeList.size())
        {
            employeeList.sort(new EmployeeComparator());
            List<Employee> employeeListTopSalary = new ArrayList<>();
            for (int i = 0; i < numStaff; i++)
            {
                employeeListTopSalary.add(employeeList.get(i));
            }
            return employeeListTopSalary;
        }
        else
        {
            return employeeList;
        }
    }

    public List<Employee> getLowestSalaryStaff(int numStaff)
    {
        if (numStaff >= 1 && numStaff <= employeeList.size())
        {
            employeeList.sort(new EmployeeComparator());
            List<Employee> employeeListLowestSalary = new ArrayList<>();
            for (int i = employeeList.size() - 1; i > employeeList.size() - 1 - numStaff; i--)
            {
                employeeListLowestSalary.add(employeeList.get(i));
            }
            return employeeListLowestSalary;
        }
        else
        {
            return employeeList;
        }
    }
    public String printSalary(List<Employee> employees)
    {
        String topSalary = "";
        for (int i = 0; i < employees.size(); i++)
        {
            topSalary += employees.get(i).salary + " руб.\n";
        }
        return topSalary;
    }
    @Override
    public String toString() {
        /*return "Company{" +
                "income=" + income +
                ", baseSalary=" + baseSalary +
                ", employeeList=" + employeeList +
                '}';*/
        return  "Информация о компании: " +
                "\nДоход: " + income +
                "\nОклад: " + baseSalary +
                "\nСотрудники: \n" + employeeList + "\n";
    }
}