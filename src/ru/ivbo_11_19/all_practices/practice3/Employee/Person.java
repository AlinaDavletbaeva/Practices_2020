package ru.ivbo_11_19.all_practices.practice3.Employee;

public class Person extends Human{

    public String name;
    public String surname;

    public /*final*/ void displayInfo() //method of inf
    //final
    {
        System.out.println("Name: "+name+"\n"+"Surname: "+surname);
    }
    public void setHeight(int height){
        this.height=height;

    }

}
