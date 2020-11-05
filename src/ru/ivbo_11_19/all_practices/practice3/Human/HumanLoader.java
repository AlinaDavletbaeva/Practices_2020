package ru.ivbo_11_19.all_practices.practice3.Human;

public class HumanLoader {

    public static void main(String[] args) {
        Human human = new Human("brown", "brown", 11, 22);
        System.out.println(human.can());
    }
}