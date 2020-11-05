package ru.ivbo_11_19.all_lessons.lesson9;

public class Node {
    private int value;//значение поля узла
    private Node next;//поле в узле со ссылкой на значение той же переменной в след.узле
//пишем get set для полей Node: значение, поле следующего, хвост как поле в узле не задаём
    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
