package ru.ivbo_11_19.all_practices.practice5_6.Dishes;

public class DishesLoader {
    public static void main(String[] args) {
        Dishes d1 = new Dishes("Голубой", 2, 33.4f );
        d1.displayInfo();
        System.out.println();
        Cup c1 = new Cup("Розовый", 3, 22.5f, 350);
        c1.displayInfo();
        System.out.println();
        Plate p1 = new Plate("Синий", 5, 50.35f,"Суповая");
        p1.displayInfo();
        System.out.println();
        Spoon s1=new Spoon("Бронзовый", 1, 10, "Чайная");
        s1.displayInfo();

    }
}

