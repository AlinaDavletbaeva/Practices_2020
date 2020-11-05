package ru.ivbo_11_19.all_practices.practice2.Dogs;

import java.util.Scanner;
public class Dog {

    String name;
    int age;

    public String toString() {
        String s ="Имя собаки - " + name + '\n' + "Возраст - " + age + '\n' + "Возраст в человеческих годах = " + ageCalc();
        return s;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int ageCalc() {
        return age * 7;
    }

}
