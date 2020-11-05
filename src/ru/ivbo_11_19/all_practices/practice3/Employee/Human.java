package ru.ivbo_11_19.all_practices.practice3.Employee;
public abstract class Human {
    //абстрактный класс позволяет сделать заготовку для будующих наследуемых классов, без содержимого
    protected int height;
    public int getHeight() {
        return height;

    }
    public abstract void setHeight(int height);
}