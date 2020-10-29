package ru.ivbo_11_19.Practice17_18;
import java.util.Scanner;
import ru.ivbo_11_19.lesson9.Node;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите строку переходов: ");
        String str = in.nextLine();

        for (int i=0; i<(str.length()-2); i++)
        {
            Node node[i] = new Node();
        }

        Node node1 = new Node(0);
        Node node2 = new Node(1);
        Node node3 = new Node(1);
        Node node4 = new Node(1);
        Node node5 = new Node(0);

        if (node1.getValue() == 1) {
            node1.setNext(node2);
            System.out.println("create_project");
        }
        if (node1.getValue() == 0) {
            node1.setNext(node5);
            System.out.println("add_library");
        } else {
            System.out.println("Конец");
        }
//-----------------------------------------------
        if (node2.getValue() == 1) {
            node2.setNext(node4);
            System.out.println("drop_db");
        }
        if (node2.getValue() == 0) {
            node2.setNext(node3);
            System.out.println("test");
        } else {
            System.out.println("Конец");
        }
//------------------------------------------
        if (node3.getValue() == 1) {
            node3.setNext(node5);
            System.out.println("add_library");
        } else {
            System.out.println("Конец");
        }

//------------------------------------------
        if (node4.getValue() == 1) {
            node4.setNext(node5);
            System.out.println("deploy");
        }
        if (node4.getValue() == 0) {
            node4.setNext(node3);
            System.out.println("restart");
        } else {
            System.out.println("Конец");
        }
//-----------------------------------------
        if (node5.getValue() == 1) {
            node5.setNext(node3);
            System.out.println("restart");
        }
        if (node5.getValue() == 0) {
            node5.setNext(node1);
            System.out.println("deploy");
        } else {
            System.out.println("Конец");
        }

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
    } private static void printList(Node head) {
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
    }

        //setNext - ссылка
        //printList - метод вывода
        //addToEnd(Node head,  int Value)
        //node - названия узлов

}
