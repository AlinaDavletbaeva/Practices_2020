package ru.ivbo_11_19.all_practices.practice3.Circle;

public class Circle {
    //заготовка абстрактного мяча
    private int number; //
    private float radius; //
    private float area; //
    private float length;

    //desc Number
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    //desc radius
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius){
        this.radius=radius;
    }
    public float getLength(){
        float length= (float) (radius * 2 * 3.14);
        return length;
    }
    public void setLength(float length){
        this.length=length;
    }

    /* public void setArea(float area){
       this.area=area;
   }*/
//desc area
    public void setArea(float area){
        this.area = area;
    }
    public float getArea(){
        area= (float) (radius * radius * 3.14);
        return area;
    }

}
