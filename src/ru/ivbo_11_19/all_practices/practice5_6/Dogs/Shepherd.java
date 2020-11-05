package ru.ivbo_11_19.all_practices.practice5_6.Dogs;

public class Shepherd extends Dog{
    private boolean isService;
    public Shepherd(String name, int age, char gender, String region, boolean isService){
        super(name, age, gender, region);
        this.isService=isService;
    }

    public void setIsService(boolean isService) {
        this.isService = isService;
    }

    @Override
    public void showCharacteristic() {
        super.showCharacteristic();
        System.out.print("Служба: ");
        if (isService==true)
            System.out.println ("служащая");
        else System.out.println("гражданская");
    }

}
