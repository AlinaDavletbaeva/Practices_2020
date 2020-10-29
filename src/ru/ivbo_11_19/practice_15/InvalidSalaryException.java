package ru.ivbo_11_19.practice_15;
//создали собственный тип исключения
public class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String message) {
        super(message);
    }
}


