package ru.ivbo_11_19.practice_15;

import ru.ivbo_11_19.lesson8.lesson.Car;
import ru.ivbo_11_19.lesson8.lesson.InvalidMileageException;

public class Main15 {
    public static void main(String[] args) throws Exception {
//        int a = 65 / 0;
        Employee employee = new Employee();

        try {
            //int newSalary = 7 / 0;//Incorrect salary calculation
            //employee.addSalary(newSalary);
            employee.addSalary(45);
            employee.addSalary(50);
            employee.addSalary(-5);//Incorrect salary
            employee.add2Salary(-9);

        } catch (ArithmeticException aex) {
            System.out.println("Incorrect salary calculation");
            System.out.println(aex.getMessage());
        } catch (InvalidSalaryException e) {
            System.out.println("Incorrect salary");
            System.out.println(e.getMessage());
            throw e;
        } /*catch (InvalidSalary2Exception f) { когда runtime - не надо вызывать catch
            System.out.println("Обходим исключение на нормальных значениях");
            //попытались сбросить исключение, но сначала finally выполнился раньше
        } */finally {//выполняется так или иначе
            System.out.println(employee);
        }

    }

}