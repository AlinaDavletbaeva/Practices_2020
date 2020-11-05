package ru.ivbo_11_19.all_practices.practice3.Employee;

public /*final*/ class Employee extends Person{
    //final works with classes and methods

    //ext and name of Mums class
    public  int age; // новую переменную зададим через дисплейинфо благодаря переопределению
    //сначала вызвоется старая логика через супер, а затем новая

    @Override //pereopredelenie parent method
    public void displayInfo() {

        super.displayInfo(); // super - вызов метода из Parent? если удалим - ничего не будет вызывать
        System.out.println("Age: "+age);

        //новый метод

    }

}
