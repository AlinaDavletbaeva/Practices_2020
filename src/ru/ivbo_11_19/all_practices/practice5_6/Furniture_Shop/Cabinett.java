package ru.ivbo_11_19.all_practices.practice5_6.Furniture_Shop;

class Cabinett extends Furniture { //шкаф
    private double height;
    private double width;

    Cabinett(String material, String color, String dimensions, int price, String name){
        super(material, color, dimensions, price, name);
    }

    @Override
    public String displayInfo(){
        return ("Материал: " + getMaterial() + "; Цвет: " + getManufacturer() + "; Габариты: " + getDimensions() +
                "; Высота: " + getHeight() + "; Ширина: " + getWidth());
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}


