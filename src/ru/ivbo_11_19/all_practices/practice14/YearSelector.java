package ru.ivbo_11_19.all_practices.practice14;

public class YearSelector implements EmployeesSelector{
    private int birthday;

    public YearSelector(int birthday) {
        this.birthday=birthday;
    }

    @Override
    public boolean isNeed(Employee employee) {
        return employee.getBirthday()> birthday;
    }
}
