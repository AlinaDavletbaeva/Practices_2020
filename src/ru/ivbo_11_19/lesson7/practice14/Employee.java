package ru.ivbo_11_19.lesson7.practice14;

public class Employee {
    private final int number; //номер в списке
    private final String surname;//фамилия
    private final String name;//имя
    private final int birthday; //день рождения
    private final String address;//адрес
    private final String phone;//номер
    private int salary;//зарплата


//конструктор
    public Employee(int number, String surname, String name, int birthday, String address, String phone, int salary) {
        this.number = number;
        this.surname = surname;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.phone = phone;
        this.salary = salary;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getBirthday() {return birthday;}

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return number+1 + ". Employee{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\''+
                ", address=" + address +
                ", phone=" + phone +'\''+
                ", salary=" + salary +
                '}';
    }
}