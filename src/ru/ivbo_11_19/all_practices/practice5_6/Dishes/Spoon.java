package ru.ivbo_11_19.all_practices.practice5_6.Dishes;

class Spoon extends Dishes{
    private String typeF;
    public Spoon(String color, int age, float price, String typeF) {
        super(color, age, price);
        this.typeF = typeF;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Тип ложки: "+typeF);
    }

    public String getTypeF(){

        return typeF;
    }

    public void setTypeF(String typeF) {

        this.typeF = typeF;
    }

}
