/*package ru.ivbo_11_19.all_practices.practice5_6.Furniture_Shop;
import java.util.Scanner;
import java.util.ArrayList;

public class FurnitureLoader {
    public int numbProduct;
    public int amountOfMoney;

    public static void showCommand(){
        System.out.println("Добро пожаловать! Список команд: ");
        System.out.print("Показать каталог - 1" + "\n" +  "Купить - 2" + "\n" +
                "Показать список команд - 3" + "\n" + "Уйти - 4" + "\n" + "Ваша команда: ");
    }

    public static void main(String[] args) {
        Sofa sofa_1 = new Sofa("Skin", "China", "Average", 40000, "Fisher_1");
        Desk desk_1 = new Desk("Oak", "Brasil", "Small", 2300, "StudySmart_3");
        Cabinett cab_1 = new Cabinett("Wood", "South Korea", "Big", 60000, "Trio_1");

        ArrayList<Furniture> catalog = new ArrayList<Furniture>();
        catalog.add(new Desk("Oak", "Brasil", "Small", 2700, "StudySmart_2"));
        catalog.add(new Sofa("Velour", "Germany", "Big", 100000, "Fisher_2"));
        catalog.add(new Cabinett("Wood", "Indonesia", "Average", 150000, "IndBusy_2"));
        catalog.add(desk_1);
        catalog.add(sofa_1);
        catalog.add(cab_1);

        System.out.print("Введите сумму Ваших денег: ");
        Scanner in = new Scanner(System.in);
        int amountOfMoney = in.nextInt();

        FurnitureLoader.showCommand();

        //через case сделать
        while(true){
            int command = in.nextInt();
            if(command == 1){ //вывод каталога
                FurnitureShop.printCatalog(catalog);
            }
            else if(command == 2){ //добавить в корзину
                System.out.print("Введите номер товара который хотите добавить в корзину: ");
                int numbProduct = in.nextInt()-1;
                FurnitureShop.getBas(catalog, basket, numbProduct);
            }
            else if(command == 3){ //убрать из корзины
                System.out.println("Введите номер товара который хотите убрать из корзины: ");
                int numbProduct = in.nextInt()-1;
                FurnitureShop.delBas(basket, numbProduct);
            }
            else if(command == 4){
                FurnitureShop.showBasket(basket);
            }
            else if(command == 5){ //покупка
                System.out.println("Стоимость всех товаров из Вашей корзины составляет: " + FurnitureShop.getSum());
                FurnitureShop.buy(amountOfMoney, basket);
            }
            else if(command == 6){ //вывод списка команд
                FurnitureLoader.showCommand();
            }
            else if(command == 7){ //выход
                System.out.println("Выход");
                break;
            }
            else{
                System.out.print("Вы неверно ввели команду. Список команд: ");
                FurnitureLoader.showCommand();
            }
        }
    }
}
*/