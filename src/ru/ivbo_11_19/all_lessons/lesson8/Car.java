package ru.ivbo_11_19.all_lessons.lesson8;

public class Car {
    private int mileage;

    public int getMileage() {
        return mileage;
    }

    public void addMileage(int mileage) throws InvalidMileageException {
        if(mileage < 0) {
            throw new InvalidMileageException("mileage must be positive");
        }
        this.mileage += mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mileage=" + mileage +
                '}';
    }
}







/*public class Car {

    мы делали прокрутку пробега через рандом
    теперь к счётчику прибавляем модуль пробега, чтобы никто не смог передать отрицательное значение
    +=Math.abc()
}
это внутри предыдущего пакета

проверка пробега меньшего нуля - throw new Exception("mileage must be positive"),
 лучше вместо предыдущего создавать отдельный класс, наследуемыйц от Exception - InvalidMileageException
  throws Exception приписать к методу, чтобы показать, что он умеет
*/