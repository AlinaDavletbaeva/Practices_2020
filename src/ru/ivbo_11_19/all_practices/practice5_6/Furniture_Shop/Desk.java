package ru.ivbo_11_19.all_practices.practice5_6.Furniture_Shop;

public class Desk extends Furniture{ //стул
    private int height; //высота
    private int length; //длина стола
    private int width; //ширина стола

    Desk(String material, String manufacturer, String dimensions, int price, String name){
        super(material, manufacturer, dimensions, price, name);
    }

    @Override
    public String displayInfo(){
        return ("Материал: " + getMaterial() + "; Изготовитель: " + getManufacturer() + "; Габариты: " + getDimensions() +
                "; Высота ножек: " + getHeight() + "; Длина столешницы: " + getLength()+"; Ширина столешницы: " + getWidth() );
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight(){
        return height;
    }

    public int getLength(){
        return length;
    }

    public int getWidth(){
        return width;
    }


}