package ru.ivbo_11_19.all_lessons.lesson8;
//обработка исключений

public class Main {
    public static void main(String[] args) {
//        int a = 65 / 0;
        Car car = new Car();

        try {
            car.addMileage(45);
            int newMileage = 7 / 1;
            car.addMileage(newMileage);

            car.addMileage(50);
            car.addMileage(-5);
        } catch (ArithmeticException aex) {
            System.out.println("Incorrect mileage calculation");
            System.out.println(aex.getMessage());
        } catch (InvalidMileageException e) {
            System.out.println("Incorrect mileage");
            System.out.println(e.getMessage());
        }
        System.out.println(car);
    }

}
/*public class Main {
    public static void main(String[] args) throws Exception не красиво{
        System.out.println(5+8);
        System.out.println(8/5);
        System.out.println(8/0);//исключение java.lang.ArithmeticException
        System.out.println(-8.0/0.0);//double позволяет избежать искл-я Infinity
        try{...} catch (Exception ex){...} выдаст /by zero - сообщение
        можно в отдельной функции divide - миникалькулятор с вводом с консоли с рекурсией - можно исправлять
        вместо try catch можно использовать while
        try{} catch{} обернуть addMileage(int)
        catch может быть несколько (incorrect mileage calculation новый) исключения наследуются от Exception
        проходится по исключениям последовательно
        нужно идти от самых конкретных к самым абстрактным
        исключения бывают разными RuntimeException (* ArithmeticException - не проверяется)
        чтобы в элементе car в Main - прога не ругалась при добавлении car.addMileage(34) можем класс
         наследовать отRuntimeException -  выход за границы массива, при делении на ноль, чтобы часто не проверять
        бывает  ArrayIndexOutOfException - выход за границы массива

    }
} */
