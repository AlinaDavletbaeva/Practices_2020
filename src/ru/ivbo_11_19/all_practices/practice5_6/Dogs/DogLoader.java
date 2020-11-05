package ru.ivbo_11_19.all_practices.practice5_6.Dogs;

public class DogLoader {
    public static void main(String[] args) {
        Dog d1 = new Dog("Тотошка",3, 'д', "Российская Федерация" );
        d1.showCharacteristic();
        System.out.println("Возраст в человеческих годах: "+d1.calculate());
        System.out.println();
        Shepherd sh1= new Shepherd("Мухтар", 2, 'м', "Киргизская респ.", true);
        sh1.showCharacteristic();
        System.out.println("Возраст в человеческих годах: "+sh1.calculate());
        System.out.println();
        Chihuahua c1=new Chihuahua("Маркус", 3, 'м', "Германия", true);
        c1.showCharacteristic();
        System.out.println("Возраст в человеческих годах: "+c1.calculate());

    }
}
