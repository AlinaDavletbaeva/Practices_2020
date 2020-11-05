package ru.ivbo_11_19.all_lessons.lesson9;

public class Main {
    public static void main(String[] args) {
        Node node1 = new Node(12);
        Node node2 = new Node(15);
        node1.setNext(node2);

        printList(node1);

        addToEnd(node1, 150);//добавляем узел с помощью метода addToEnd
        System.out.println("Список с добавленным элементом ^^ ");
        printList(node1);

    }
    private static void printList(Node head) {
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
        Node newTail = new Node(value);//создаём новый узел с полем значения - числа
        tail.setNext(newTail);//устанавливаем ссылку для хвоста на последний узел, хвост ссылается на последний узел
    }
        //setNext - ссылка
        //printList - метод вывода
        //addToEnd(Node head,  int Value)
        //node - названия узлов

}
