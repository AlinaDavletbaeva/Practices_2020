package ru.ivbo_11_19.all_practices.practice5_6.Dogs;

public class Chihuahua extends Dog {
    private boolean isCalm;

    public Chihuahua(String name, int age, char gender, String region, boolean isCalm) {
        super(name, age, gender, region);
        this.isCalm =isCalm;
    }
    public void set(boolean isCalm) {
        this.isCalm = isCalm;
    }

    @Override
    public void showCharacteristic() {
        super.showCharacteristic();
        System.out.print("По характеру: ");
        if (isCalm==true)
            System.out.println ("спокойная");
        else System.out.println("агрессивная");
    }


}