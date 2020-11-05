package ru.ivbo_11_19.all_practices.practice5_6.Dishes;
public class Cup extends Dishes{
    private int volume;
    public Cup(String color, int age, float price, int volume){
        super(color, age, price);
        this.volume=volume;
    }


    @Override
    public  void displayInfo() {
        super.displayInfo();
        System.out.println("Вместимость: "+volume+" мл");
    }
    public int getVolume(){
        return volume;
    }
    public void setVolume(int volume)
    {
        this.volume=volume;
    }
}
