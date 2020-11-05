package ru.ivbo_11_19.all_practices.practice5_6.Dishes;
public class Dishes {
    private String color;
    private int age;
    private float price;

    public String getColor(){
        return color;
    }
    public int getAge(){
        return age;
    }
    public float getPrice(){
        return price;
    }

    public Dishes(String color, int age, float price){
        this.color=color;
        this.age=age;
        this.price=price;
    }
    public void displayInfo(){
        System.out.println("Цвет: "+color+"\n"+"Сколько лет хранится: "+age+" года/лет"+"\n"+"Цена: "+price+" руб.");
    }


    }

