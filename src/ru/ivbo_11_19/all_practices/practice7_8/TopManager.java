package ru.ivbo_11_19.all_practices.practice7_8;

public class TopManager implements EmployeePosition{
    Company company;
    public TopManager(Company company)
    {
        this.company = company;
    }
    public String getJobTitle()
    {
        return "Top Manager";
    }
    public double calcSalary(double baseSalary)
    {
        if (company.getIncome() > 10000000)
        {
            return baseSalary * 2.5;
        }
        else {
            return baseSalary;
        }
    }
}
