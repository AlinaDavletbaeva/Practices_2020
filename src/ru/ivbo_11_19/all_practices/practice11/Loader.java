package ru.ivbo_11_19.all_practices.practice11;

import javax.swing.*;
public class Loader {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(800, 500);
        frame.setVisible(true);//делает видимым
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//закрывает окошко
        frame.setLocationRelativeTo(null);//окошко всегда по центру
        frame.add( new CalculatorForm().getPanel1());
    }
}