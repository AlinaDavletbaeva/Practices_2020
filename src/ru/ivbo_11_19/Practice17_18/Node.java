package ru.ivbo_11_19.Practice17_18;

public class Node {
    private int value;//0 или 1
    private int command; //от 1 до 6
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

    public int getCommand() {
        return command;
    }

    public void setCommand(int command) {
        this.command = command;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }



}
