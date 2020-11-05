package ru.ivbo_11_19.all_practices.practice5_6.Furniture_Shop;

abstract class Furniture{
    private String material;
    private int price;
    private String name;
    private String manufacturer;
    private String dimensions;

    Furniture(String material, String manufacturer, String dimensions, int price, String name){
        this.material = material;
        this.manufacturer = manufacturer;
        this.dimensions = dimensions; //габариты
        this.price = price;
        this.name = name;
    }

    public abstract String displayInfo();

    public String getManufacturer(){
        return manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMaterial(){
        return material;
    }

    public String getDimensions(){
        return dimensions;
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    public void setDimensions(String dimensions){
        this.dimensions = dimensions;
    }
}

