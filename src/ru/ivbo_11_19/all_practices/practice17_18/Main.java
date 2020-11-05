package ru.ivbo_11_19.all_practices.practice17_18;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Graph graph = new Graph();
        int k = 0;
        while (true) {

            if(k==-1){
                break;
            }
            k = sc.nextInt();
            graph.work(k);
        }
        graph.getInstruction();
    }
}
/*
//-----------------------------------------
        /*
public static List<String> getCommand(int command) {
    List<String> result = new ArrayList<>();
    switch (command) {
        case 1: result.add("create_project");
            break;
        case 2: result.add("add_library");
            break;
        case 3: result.add("restart");
            break;
        case 4: result.add("test");
            break;
        case 5: result.add("deploy");
            break;
        case 6: result.add("drop_bd");
            break;
        default:
            break;
    }
    return result;
}
        */
    /*} private static void printList(Node head) {
        while (head != null) {//голова главного класса ссылается на следующий узел, а то ссылается на следующий
            //т.е. условие = пока не закончатся узлы
            System.out.println(head.getValue());//принимает в голову значение поля узла
            head = head.getNext();//присваивает каждый раз себе новый узел
        }
    }
    private static void addToEnd(Node head, int value) {
        Node tail = head;//head and tail на самом деле, не включаются в узел, они явл.параметрами главного класса, вкл.узлы
        //хвост равен голове, а голова в свою очередь ссылается на 1 узел
        while (tail.getNext() != null) {//пока следующее поле P в узле, которые содержат инф-цию о предыдущем узле не равно нулю
            tail = tail.getNext();//хвосту присваивается значение следующего за 1-ым узла
        }
       /* Node newTail = new Node(value);//создаём новый узел с полем значения - числа
        tail.setNext(newTail);//устанавливаем ссылку для хвоста на последний узел, хвост ссылается на последний узел
        */
//}

//setNext - ссылка
//printList - метод вывода
//addToEnd(Node head,  int Value)
//node - названия узлов
