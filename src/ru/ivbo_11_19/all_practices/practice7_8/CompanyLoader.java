package ru.ivbo_11_19.all_practices.practice7_8;
import java.util.Random;
public class CompanyLoader {

    public static void main(String[] args) {
        Company company = new Company(120000000, 40000);
        String[] posts = {"Manager", "Top Manager", "Operator"};
        /*Employee employee1 = new Employee(company,posts[0], "Mana", "Ger");
        Employee employee2 = new Employee(company,posts[1], "Topma", "Nager");
        Employee employee3 = new Employee(company,posts[0], "Mana2", "Ger2");
        Employee employee4 = new Employee(company,posts[0], "Mana3", "Ger3");
        Employee employee5 = new Employee(company,posts[2], "Ope", "Rator");
        company.hire(employee1);
        company.hire(employee2);
        company.hire(employee3);
        company.hire(employee4);
        company.hire(employee5);
        System.out.println(company);
        System.out.println(company.printSalary(company.getLowestSalaryStaff(2)));*/
        int i, countOperator = 180, countMan = 80, countTopMan = 10;
        for (i = 1; i <= countOperator; i++)
        {
            company.hire(new Employee(company, posts[2], "Oper", "Ator" + i));
        }
        for (i=1; i <= countMan; i++)
        {
            company.hire(new Employee(company, posts[0], "Mana", "Ger" + i));
        }
        for (i=1; i <= countTopMan; i++)
        {
            company.hire(new Employee(company, posts[1], "Top Ma", "Nager" + i));
        }
        System.out.println(company.printSalary(company.getTopSalaryStaff(11)));
        System.out.println(company.printSalary(company.getLowestSalaryStaff(30)));
        final Random random = new Random();
        for (i=0;i<company.employeeList.size()/2; i++)
        {
            company.fire(random.nextInt(company.employeeList.size()-1));
        }
        System.out.println(company.printSalary(company.getTopSalaryStaff(11)));
        System.out.println(company.printSalary(company.getLowestSalaryStaff(30)));
    }
    }

