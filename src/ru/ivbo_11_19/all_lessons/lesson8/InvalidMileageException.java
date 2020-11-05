package ru.ivbo_11_19.all_lessons.lesson8;


/*public class InvalidSalaException extends Exception { когда вызываем Exception, а передаём тип элемента нового класса
    оно будет работать с ребёнком
}*/
public class InvalidMileageException extends Exception {
    public InvalidMileageException(String message) {
        super(message);
    }
}