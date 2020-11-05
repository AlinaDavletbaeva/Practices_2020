package ru.ivbo_11_19.all_practices.practice5_6.Dogs;

public class Dog {
    private String name;
    private int age;
    private char gender;
    private String region;

    public String getName(){ return name; }
    public int getAge(){
        return age;
    }
    public char getGender(){ return gender; }

    public String getRegion(){ return region; }


    public Dog(String name, int age, char gender, String region){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.region=region;
    }

    public void showCharacteristic() {
        System.out.println("Кличка: "+name+"\n"+"Возраст в собачьих годах: "+age +"\n"+"Страна породы: "+region);

    }
    /*public String humAge(){
        return "Возраст собаки в человеческих годах: " + getAge()*7;
    }*/

    public int calculate(){
        return   getAge() * 7;

    }
}


