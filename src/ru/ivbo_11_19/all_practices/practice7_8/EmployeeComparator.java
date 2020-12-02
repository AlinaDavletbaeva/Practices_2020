package ru.ivbo_11_19.all_practices.practice7_8;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.salary > o2.salary)
        {
            return -1;
        }
        else if (o1.salary < o2.salary)
        {
            return 1;
        }
        return 0;
    }
}