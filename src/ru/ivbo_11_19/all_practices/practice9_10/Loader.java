package ru.ivbo_11_19.all_practices.practice9_10;
import  javax.swing.*;
public class Loader {
    public static void main(String[] args) {
        //1 variant
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//полное закрытие программы, окошечка

        //frame.add(new JButton("Click")); //принимает текст
        //2 variant CUI form d src
        FootballForm myForm = new FootballForm();
        frame.add(myForm.getPanelform());

    }
}
