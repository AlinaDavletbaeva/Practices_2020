package ru.ivbo_11_19.all_practices.practice5_6.Furniture_Shop;

class Sofa extends Furniture { //диван
    private String form;
    private int numberOfSeats;

    Sofa(String material, String manufacturer, String dimensions, int price, String name) {
        super(material, manufacturer, dimensions, price, name);
    }

    @Override
    public String displayInfo() {
        return ("Материал: " + getMaterial() + "; Изготовитель: " + getManufacturer() + "; Габариты: " + getDimensions() +
                "; Форма дивана: " + getForm() + "; Количество мест: " + getNumberOfSeats());
    }

    public String getForm() {
        return form;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}