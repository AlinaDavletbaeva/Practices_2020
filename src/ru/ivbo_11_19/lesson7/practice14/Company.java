package ru.ivbo_11_19.lesson7.practice14;
import java.sql.SQLOutput;
import java.util.ArrayList;//работа с массивами
import java.util.function.Predicate;

public class Company {
    private ArrayList<Employee> employees;

    public Company(){
        this.employees = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Company{" +
                "employees=" + employees + '}';
    }

    //увольнять и нанимать

   public void addEmployee(Employee employee){
        employees.add(employee);
    }

    /*public void deleteEmployee(){
        employees.remove(0);
    }*/


//методы сортировки и поиска
    public void  findEmployees(EmployeesSelector selector, handleEmployees handleEmployees){
        int count = 0;
        for (int i = 0; i <employees.size(); i++) {
            if (selector.isNeed(employees.get(i))) {
                handleEmployees.handleEmployees(employees.get(i));
                count++;
            }
        }
        System.out.println("Кол-во: " + count);
    }
}
