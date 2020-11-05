package ru.ivbo_11_19.all_practices.practice5_6.Dishes;

public class Plate extends Dishes{
    private String food;
    public Plate(String color, int age, float price, String food) {
        super(color, age, price);
        this.food=food;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Для какого вида пищи: "+food);
    }
    public String getTypeFood(){
            return food;
    }

    public void setTypeFood(String typeFood) {
            this.food = food;
    }
}
