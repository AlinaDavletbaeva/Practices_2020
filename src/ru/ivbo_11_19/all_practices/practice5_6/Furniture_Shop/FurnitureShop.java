package ru.ivbo_11_19.all_practices.practice5_6.Furniture_Shop;
import java.util.ArrayList;

public class FurnitureShop {
    private String storeName;
    private String buyersName;
    static int sum = 0;
    static int count = 0;

    FurnitureShop(String storeName, String buyersName){
        this.storeName = storeName;
        this.buyersName = byersName;
    }

    static void printCatalog(ArrayList<Furniture> catalog){
        for(int i = 0; i < catalog.size(); i++){
            System.out.println(i+1 + ") " + catalog.get(i).getName() + " " + catalog.get(i).getPrice());
        }
    }

     static void getBas(ArrayList<Furniture> catalog, ArrayList<Furniture> basket, int numbProduct){
        basket.add(catalog.get(numbProduct));
        System.out.println("Товар " + basket.get(counterObjBas).getName() + " добавлен в корзину!");
        sum += basket.get(count).getPrice();
        ++count;
    }
    
     static void delBasket(ArrayList<Furniture> basket, int numbProduct){
        if(!basket.isEmpty()) {
            System.out.println("Товар " + basket.get(numbProduct).getName() + " удалён из корзины!");
            sum -= basket.get(numbProduct).getPrice();
            basket.remove(numbProduct);
            --count;
        }
        else{
            System.out.println("Корзина пуста");;
        }
    }
    
    static void buy(ArrayList<Furniture> catalog, int numbProduct, int amountOfMoney){
        if(amountOfMoney >= catalog.get(numbProduct).getPrice()){
            amountOfMoney -= catalog.get(numbProduct).getPrice();
            catalog.remove(numbProduct);
            System.out.println("Вы успешно купили выбранный товар!!!" + " Остаток средств: " + amountOfMoney);
        }
        else {
            System.out.println("На вашем счёте недостаточно средств для совершения покупки. ");
        }
    }

       static int getSum(){
        return sum;
    }
    public void setBuyersName(String buyersName) {
        this.buyersName = buyersName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getBuyersName() {
        return buyersName;
    }

    public String getStoreName() {
        return storeName;
    }

    @Override
    public String toString() {
        return "FurnitureShop{" +
                "storeName='" + storeName + '\'' +
                ", buyersName='" + buyersName + '\'' +
                '}';
    }
}
